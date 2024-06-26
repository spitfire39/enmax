import Pages.EnmaxHomePage;
import Utils.ConfigProperties;
import org.testng.annotations.Test;

public class EnmaxTest extends BaseTest {

    EnmaxHomePage enmaxHomePage = new EnmaxHomePage();

    @Test
    public void openHomePage() {
        openPage(ConfigProperties.BASE_URL);
        enmaxHomePage.openOutagesAndSafetyPage()
                .clickSignInRegisterBtn()
                .clickRegisterBtn()
                .fillRegisterFormStepOne("test.email@a.com", "Bla_123!")
                .clickNextBtnSuccess()
                .fillRegisterFormStepTwo("", "19")
                .clickCompleteRegistrationBtnFail()
                .checkForErrorMessagePresence("The site information is not valid, please make sure your phone number and the selected identifier are correct");

    }
}