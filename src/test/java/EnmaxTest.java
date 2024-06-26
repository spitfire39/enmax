import Entities.NewEmaxUser;
import Pages.EnmaxHomePage;
import Utils.ConfigProperties;
import Utils.GenerateEntity;
import org.testng.annotations.Test;

public class EnmaxTest extends BaseTest {

    EnmaxHomePage enmaxHomePage = new EnmaxHomePage();
    GenerateEntity generateEntity = new GenerateEntity();

    @Test
    public void checkThatErrorMessageAppearForRegistrationFail() {
        String errorMessage = "The site information is not valid, please make sure your phone number and the selected identifier are correct";
        NewEmaxUser user = generateEntity.generateEnmaxUser();

        enmaxHomePage.openOutagesAndSafetyPage()
                .clickSignInRegisterBtn()
                .clickRegisterBtn()
                .fillRegisterFormStepOne(user.email, user.password, user.password)
                .clickNextBtnSuccess()
                .fillRegisterFormStepTwo(user.phone, user.houseNumber)
                .clickCompleteRegistrationBtnFail()
                .checkForErrorMessagePresence(errorMessage); // please note, since captcha is displayed images - test might fail
    }
    @Test
    public void checkThatErrorMessageAppearForNotMatchingPasswords() {
        NewEmaxUser user = generateEntity.generateEnmaxUser();
        enmaxHomePage.openOutagesAndSafetyPage()
                .clickSignInRegisterBtn()
                .clickRegisterBtn()
                .fillRegisterFormStepOne(user.email, user.password, user.password+"1")
                .checkNextBtnIsDisabled();
    }
}