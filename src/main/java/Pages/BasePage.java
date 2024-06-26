package Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public void submitCaptcha(String iFrame, String locator){
        SelenideElement iFrameCaptcha = $(By.xpath(iFrame));
        switchTo().frame(iFrameCaptcha);
        $(By.xpath(locator)).click();
    }
}