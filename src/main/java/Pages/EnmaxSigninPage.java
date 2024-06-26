package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EnmaxSigninPage extends BasePage{

    private static String registerBtn = "//button[contains(text(),'Register Now')]";

    public EnmaxRegisterPage enmaxRegisterPage = new EnmaxRegisterPage();

    public EnmaxRegisterPage clickRegisterBtn(){
        $(By.xpath(registerBtn)).click();
        return enmaxRegisterPage;
    }
}
