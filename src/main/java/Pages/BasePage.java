package Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public void selectDropDownListValue(String field, String search, String list, String value){
        $(By.xpath(field)).click();
        $(By.xpath(search)).setValue(value);
        $(By.xpath(String.format(list, value))).click();
    }

    public void selectDropDownListValue(String field, String list, String value){
        $(By.xpath(field)).click();
        $(By.xpath(String.format(list, value))).click();
    }
    public void multiSelectDropDownListValue(String field, String search, String list, String value){
        $(By.xpath(field)).click();
        $(By.xpath(search)).setValue(value);
        $(By.xpath(String.format(list, value))).click();
        $(By.xpath(field)).click();
    }

//    WebDriver driver;
//
//    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
}