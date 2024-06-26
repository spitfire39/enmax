package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class EnmaxHomePage extends BasePage{

    private static String outagesAndSafetyBtn = "//a[@aria-label='Outages & Safety' and contains(@class, 'body-medium-bold')]";

    EnmaxOutagesAndSafetyPage enmaxOutagesAndSafetyPage = new EnmaxOutagesAndSafetyPage();

    public EnmaxOutagesAndSafetyPage openOutagesAndSafetyPage(){
        $(By.xpath(outagesAndSafetyBtn)).click();
        return enmaxOutagesAndSafetyPage;
    }
}
