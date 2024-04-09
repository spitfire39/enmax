package Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public void selectDropDownListValue(String field, String list, String value){
        $(By.xpath(field)).click();
        $(By.xpath(String.format(list, value))).click();
    }

//    WebDriver driver;
//
//    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
}