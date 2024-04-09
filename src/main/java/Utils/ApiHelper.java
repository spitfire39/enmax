package Utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiHelper {

    protected static HttpClient httpClient = HttpClient.newHttpClient();
    protected static JSONObject jsonObject = new JSONObject();

    HttpRequest createPostRequest(String urlSuffix, String body){
        return HttpRequest.newBuilder()
                .uri(URI.create(ConfigProperties.API_URL + "/" + urlSuffix))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
//                .header("Accept", "*/*")
//                .header("Connection", "keep-alive")
//                .method("POST", HttpRequest.BodyPublishers.ofString(body))
                .build();
    }

    HttpRequest createGetRequest(String urlSuffix){
        return HttpRequest.newBuilder()
                .uri(URI.create(ConfigProperties.API_URL + "/" + urlSuffix))
                .header("Content-Type", "application/json")
                .GET()
                .build();
    }

    HttpResponse<String> sendRequest(HttpRequest request){
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    public String authorise(String email, String password){
        jsonObject.put("Provider", "Internal");
        jsonObject.put("LongTermExpired", true);
        jsonObject.put("Email", email);
        jsonObject.put("Password", password);
        String jsonString = jsonObject.toString();
        String stringJson = sendRequest(createPostRequest("login", jsonString)).body();
        JsonObject jsonObject = JsonParser.parseString(stringJson).getAsJsonObject();
        return jsonObject.get("token").toString();
    }

}
