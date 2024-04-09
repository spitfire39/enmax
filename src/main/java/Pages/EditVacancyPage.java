package Pages;

import Entities.Vacancy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EditVacancyPage extends BasePage {

    private static String jobTitle = "//app-input[@label='Job Title']//input";
    private static String role = "//app-drop-down[@label='Role']";
    private static String roleDropDownList = "//ul[@role='listbox']/p-dropdownitem/li[@aria-label='%s']";
    private static String mainStacks = "//app-multiselect[label='Main Stacks]";
    private static String mainStacksDownList = "//ul[@role='listbox']/p-multiselectitem/li[@aria-label='%s']";
    private static String secondaryStacks = "";
    private static String otherLanguages = "";
    private static String otherLanguagesLevel = "";
    private static String preferableLocation = "";
    private static String workType = "";
    private static String hourlySalaryMin = "";


    public EditVacancyPage createVacancy(Vacancy vacancy){
        $(By.xpath(jobTitle)).setValue(vacancy.jobTitle);
        selectDropDownListValue(role, roleDropDownList, vacancy.role);
        selectDropDownListValue(mainStacks, mainStacksDownList, vacancy.mainStacks);
//        $(By.xpath(role)).click();
//        $(By.xpath(String.format(roleDropDownList, vacancy.role))).click();
        return this;
    }
}
