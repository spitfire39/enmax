package Pages;

import Entities.Vacancy;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@Component
public class ProjectsPage extends BasePage {
    private static String createVacancyBtn = ".general__container-inner .create__vacancy";

    public EditVacancyPage clickCreateVacancyBtn(){
        $(By.cssSelector(createVacancyBtn)).shouldBe(visible);
        $(By.cssSelector(createVacancyBtn)).click();
        return new EditVacancyPage();
    }
}
