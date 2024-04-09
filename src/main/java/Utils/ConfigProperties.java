package Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class ConfigProperties {
    private static final Properties PROPERTIES;
    //    declare of variables for config file values
    public static final String BASE_URL;
    public static final String API_URL;
    public static final String PROJECTS_ACTIVE_TAB;
    public static final String RECRUITER2_USERNAME;
    public static final String RECRUITER2_PWD;

    //this class helps to get data from config file
    static {
        PROPERTIES = new Properties();
        URL props = ClassLoader.getSystemResource("config.properties");
        try {
            PROPERTIES.load(props.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        initialize of variables from config file
        BASE_URL = PROPERTIES.getProperty("url");
        API_URL = PROPERTIES.getProperty("apiUrl");
        PROJECTS_ACTIVE_TAB = PROPERTIES.getProperty("projectsActivePage");
        RECRUITER2_USERNAME = PROPERTIES.getProperty("recruiterUsername");
        RECRUITER2_PWD = PROPERTIES.getProperty("recruiterPwd");
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
