package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EnmaxRegisterPage extends BasePage{

    private static String emailField = "register-email";
    private static String passwordField = "register-password";
    private static String confirmPasswordField = "register-password-repeat";
    private static String nextBtn = "//button[contains(text(),'Next')]";

    EnmaxRegisterStep2Page enmaxRegisterStep2Page = new EnmaxRegisterStep2Page();

    public EnmaxRegisterPage fillRegisterFormStepOne(String email, String password){
        $(By.id(emailField)).sendKeys(email);
        $(By.id(passwordField)).sendKeys(password);
        $(By.id(confirmPasswordField)).sendKeys(password);
        return this;
    }

    public EnmaxRegisterStep2Page clickNextBtnSuccess(){
        $(By.xpath(nextBtn)).click();
        return enmaxRegisterStep2Page;
    }
    public EnmaxRegisterPage clickNextBtnFail(){
        $(By.xpath(nextBtn)).click();
        return this;
    }


}
