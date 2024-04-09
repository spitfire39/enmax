package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CandidatesPage extends BasePage{

    private static String candidatesLabel = "//*[contains(text(),'Candidates')]";

    public CandidatesPage checkThatCandidatesPageOpened(){
        $(By.xpath(candidatesLabel)).shouldBe(visible);
        return this;
    }


//    public CandidatesPage(WebDriver driver) {
//        super(driver);
//    }
//    @FindBy(xpath = "//*[contains(text(),'Candidates')]")
//    private WebElement candidatesLabel;

//    public CandidatesPage _candidatesPageOpened(){
//        $(By.xpath("//*[contains(text(),'Candidates')]")).shouldBe(visible);
//        return this;
//    }
}
