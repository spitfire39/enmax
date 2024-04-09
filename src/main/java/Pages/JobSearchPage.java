package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class JobSearchPage extends BasePage {
    private static String jobSearchLabel = "//*[contains(text(),'Job Search')]";

    public JobSearchPage checkThatJobSearchPageOpened(){
        $(By.xpath(jobSearchLabel)).shouldBe(visible);
        return this;
    }
}
