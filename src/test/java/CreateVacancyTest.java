import Entities.Vacancy;
import Pages.EditVacancyPage;
import Pages.HomePage;
import Pages.ProjectsPage;
import Utils.ConfigProperties;
import Utils.GenerateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class CreateVacancyTest extends BaseTest{

    @Autowired
    HomePage homePage = new HomePage();
    @Autowired
    ProjectsPage projectsPage = new ProjectsPage();
    @Autowired
    EditVacancyPage editVacancyPage = new EditVacancyPage();
    @Autowired
    GenerateEntity generateEntity = new GenerateEntity();

    @Test
    public void createVacancyWithMinData() {
        Vacancy vacancy = generateEntity.generateMinVacancy();
        homePage.signInByRecruiter(ConfigProperties.RECRUITER2_USERNAME, ConfigProperties.RECRUITER2_PWD);
        openPage(ConfigProperties.BASE_URL + ConfigProperties.PROJECTS_ACTIVE_TAB);
        projectsPage.clickCreateVacancyBtn()
                .createVacancy(vacancy);

    }

    @Test
    public void testCase(){
        int var = 12;
        int newVar = 0;
        for (int i = 1; i <= var; i++){
            newVar = newVar + i;
        }
        System.out.println(newVar);
    }

    @Test
    public void testCase2(){
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+=*,.;:?])(?!=password).+$");
        System.out.println( pattern.matcher("aA1password+").matches());
    }

}
