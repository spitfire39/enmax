package Pages;

import Entities.Vacancy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EditVacancyPage extends BasePage {

    private static String jobTitle = "//app-input[@label='Job Title']//input";
    private static String role = "//app-drop-down[@label='Role']";
    private static String search = "//input[@role='searchbox']";
    private static String singleSelectDropDownList = "//ul[@role='listbox']/p-dropdownitem/li[@aria-label='%s']";
    private static String mainStacks = "//app-multiselect[@label='Main Stacks']";
    private static String multiSelectDropDownList = "//ul[@role='listbox']/p-multiselectitem/li[@aria-label='%s']";
    private static String secondaryStacks = "//app-multiselect[@label='Secondary Stacks']";
    private static String otherLanguages = "//app-drop-down[@label='Other Languages']";
    private static String otherLanguagesLevel = "//app-drop-down[@label='Level']";
    private static String preferableLocation = "//app-drop-down-location[@label='Preferable Location']";
    private static String workType = "//app-drop-down[@label='WorkType']";
    private static String hourlySalaryMin = "//app-input[@label='Hourly salary']//input";


    public EditVacancyPage createVacancy(Vacancy vacancy){
        $(By.xpath(jobTitle)).setValue(vacancy.jobTitle);
        selectDropDownListValue(role, singleSelectDropDownList, vacancy.role);
        multiSelectDropDownListValue(mainStacks, search, multiSelectDropDownList, vacancy.mainStacks);
        multiSelectDropDownListValue(secondaryStacks, search, multiSelectDropDownList, vacancy.secondaryStacks);
        selectDropDownListValue(otherLanguages, singleSelectDropDownList, vacancy.otherLanguages);
        selectDropDownListValue(otherLanguagesLevel, singleSelectDropDownList, vacancy.otherLanguagesLevel);
        selectDropDownListValue(preferableLocation, singleSelectDropDownList, vacancy.preferableLocation);
//        selectDropDownListValue(workType, search, singleSelectDropDownList, vacancy.workType);
//        selectDropDownListValue(otherLanguages, search, singleSelectDropDownList, vacancy.otherLanguages);
//        selectDropDownListValue(otherLanguagesLevel, search, singleSelectDropDownList, vacancy.otherLanguagesLevel);
//        selectDropDownListValue(preferableLocation, search, singleSelectDropDownList, vacancy.preferableLocation);
//        selectDropDownListValue(workType, search, singleSelectDropDownList, vacancy.workType);
        $(By.xpath(hourlySalaryMin)).setValue(vacancy.hourlySalaryMin);
        return this;
    }
}
