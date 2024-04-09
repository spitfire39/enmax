import Utils.ApiHelper;
import Utils.ConfigProperties;
import com.browserup.bup.BrowserUpProxy;
import com.codeborne.selenide.*;
import org.apache.hc.client5.http.auth.BearerToken;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.sql.DriverManager;

import static com.codeborne.selenide.AuthenticationType.*;
import static com.codeborne.selenide.Selenide.*;

public abstract class BaseTest {

    public static ApiHelper apiHelper = new ApiHelper();

    @BeforeTest
    public void openPage(){
        open(ConfigProperties.BASE_URL);
    }

    @AfterTest
    public void closeBrowser(){
        closeWebDriver();
    }

    public void openPage(String url){
        open(url);
    }

    public void openPageAuth(){
        Configuration.proxyEnabled = true;
        String token = apiHelper.authorise("recruiter2@a.com", "Pass1234!");
        open(ConfigProperties.BASE_URL + ConfigProperties.PROJECTS_ACTIVE_TAB,
                BEARER,
                new BearerTokenCredentials("", token));
    }

    void openPageAuth2() {
        Configuration.baseUrl = "https://d1t88p009kked0.cloudfront.net/";
        Configuration.proxyEnabled = true;
        open();
        BrowserUpProxy proxy = WebDriverRunner.getSelenideProxy().getProxy();
        proxy.addHeader("Authorization", token);
        open("https://d1t88p009kked0.cloudfront.net/projects/paused");
    }

    void openPageAuth3(){
        driver.getProxy().getProxy().addHeader("Authorization", token);
        open("https://d1t88p009kked0.cloudfront.net/projects/paused");
    }

    protected static Driver driver;

    static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI2OWE2ODAwNS0wZmQ2LTQ4OWUtYWJlNS01M2YzMTdlZTE4NjciLCJmaXJzdE5hbWUiOiJSX0ZJUlNUX05BTUUzIiwibGFzdE5hbWUiOiJSX0xBU1RfTkFNRTMiLCJlbWFpbCI6InJlY3J1aXRlcjJAYS5jb20iLCJyb2xlIjoiRnJlZUh1bWFuUmVzb3VyY2UiLCJsYW5ndWFnZSI6ImVuIiwiYXZhdGFyVXJsIjoiZmlsZS82OWE2ODAwNS0wZmQ2LTQ4OWUtYWJlNS01M2YzMTdlZTE4Njcvc3VucmlzZS1vdmVyLXRoZS1sYWtlLXdpdGgtdHJlZS1hbmQtYmlyZHMuanBnIiwiZXhwaXJlZERhdGUiOiI0LzYvMjAyNCA5OjAwOjAwIFBNIiwianRpIjoiMmJjODAxNWMtNGExNi00MDYxLTliNTItM2RlNWEwNWQ0ZWQyIiwiZXhwIjoxNzEyNDM3MjAwLCJpc3MiOiJnaWJlLnRlY2giLCJhdWQiOiJnaWJlLnRlY2gifQ.wVgzjUWHXrgIXAFT0D-X4lCsM0SIRQq6DM1mCJlYZzY";

//        protected static WebDriver webDriver;
}
