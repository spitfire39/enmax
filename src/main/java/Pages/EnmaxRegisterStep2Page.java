package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class EnmaxRegisterStep2Page extends BasePage{

    private static String phoneNumberField = "//input[@type='tel']";
    private static String houseNumberField = "register-accountTypeInfo";
    private static String imNotRobotCheckbox = "//div[@class='recaptcha-checkbox-border']";
    private static String completeRegistrationBtn = "//button[contains(text(),'Complete registration')]";
    private static String registerErrorMessage = "//div[contains(@class, 'Register_main')]/div[contains(@class, 'Register_error')]";
    private static String iFrame = "//iframe[@title='reCAPTCHA']";

    SelenideElement iFrameCaptcha = $(By.xpath("//iframe[@title='reCAPTCHA']"));

    public EnmaxRegisterStep2Page fillRegisterFormStepTwo(String phone, String houseNumber){
        $(By.xpath(phoneNumberField)).sendKeys(phone);
        $(By.id(houseNumberField)).sendKeys(houseNumber);
        submitCaptcha(iFrame, imNotRobotCheckbox);
        return this;
    }

    public EnmaxRegisterStep2Page clickCompleteRegistrationBtnSuccess() {
        $(By.xpath(completeRegistrationBtn)).click();
        return this;
    }

    public EnmaxRegisterStep2Page clickCompleteRegistrationBtnFail(){
        $(By.xpath(completeRegistrationBtn)).click();
        return this;
    }

    public boolean checkForErrorMessagePresence(String errorMessage){
        $(By.xpath(registerErrorMessage)).shouldBe(visible);
        return $(By.xpath(registerErrorMessage)).getText().contains(errorMessage);
    }
}
