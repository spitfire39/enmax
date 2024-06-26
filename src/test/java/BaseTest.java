import Utils.ConfigProperties;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public abstract class BaseTest {

    @BeforeTest
    public void openPage(){
        open(ConfigProperties.BASE_URL);
    }

    @AfterTest
    public void closeBrowser(){
        closeWebDriver();
    }
}
