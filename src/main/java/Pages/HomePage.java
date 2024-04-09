package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

@Component
public class HomePage extends BasePage{

    private static String signInBtn = "//*[contains(text(),'Sign in')]";
    private static String emailField = "email";
    private static String passwordField = "password";
    private static String signInSubmitBtn = "button.p-button-rounded-sm";
    private static String signUpBtn = "//div/span[contains(text(),'Sign up')]";

    public HomePage clickSingInBtn(){
        $(By.xpath(signInBtn)).click();
        $(By.id(emailField)).should(appear);
        return this;
    }

    public HomePage switchToSignUpForm(){
        $(By.xpath(signUpBtn)).click();
//        $(By.id(emailField)).should(appear);
        return this;
    }

    public HomePage openSingInAndFillUsernameAndPassword(String username, String password){
        clickSingInBtn();
        $(By.id(emailField)).setValue(username);
        $(By.id(passwordField)).setValue(password);
        $(By.cssSelector(signInSubmitBtn)).shouldBe(enabled);
        return this;
    }
    public CandidatesPage signInByRecruiter(String username, String password){
        openSingInAndFillUsernameAndPassword(username, password);
        $(By.cssSelector(signInSubmitBtn)).click();
        return new CandidatesPage();
    }

    public JobSearchPage signInByCandidate(String username, String password){
        openSingInAndFillUsernameAndPassword(username, password);
        $(By.cssSelector(signInSubmitBtn)).click();
        return new JobSearchPage();
    }

    //    public HomePage(WebDriver driver) {
//        super(driver);
//    }

//    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
//    private WebElement signInBtn;
//    @FindBy(id = "email")
//    private WebElement emailField;
//    @FindBy(id = "password")
//    private WebElement passwordField;
//    @FindBy(css = "button.p-button-rounded-sm")
//    private WebElement signInSubmitBtn;


    //    public CandidatesPage signInByRecruiter(String username, String password){
//        $(signInBtn).click();
//        $(emailField).should(appear);
//        $(emailField).setValue(username);
//        $(passwordField).setValue(password);
//        $(signInSubmitBtn).click();
//        return new CandidatesPage(driver);
//    }
}
