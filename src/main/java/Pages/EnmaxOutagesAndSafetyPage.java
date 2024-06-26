package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class EnmaxOutagesAndSafetyPage extends BasePage{

    private static String signInRegisterBtn = "//a[@aria-label='Sign in/Register']";

    public EnmaxSigninPage enmaxSigninPage = new EnmaxSigninPage();

    public EnmaxSigninPage clickSignInRegisterBtn(){
        $(By.xpath(signInRegisterBtn)).click();
        switchTo().window(1);
        return enmaxSigninPage;
    }
}