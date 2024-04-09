import Pages.HomePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest{

    HomePage homePage = new HomePage();

    @Test
    @Parameters({"username", "password"})
    public void checkThatRecruiterCanLoginByUsername(String username, String password) {
        homePage.signInByRecruiter(username, password)
                .checkThatCandidatesPageOpened();
    }

    @Test
    @Parameters({"username", "password"})
    public void checkThatCandidateCanLoginByUsername(String username, String password) {
        homePage.signInByCandidate(username, password)
                .checkThatJobSearchPageOpened();
    }
}
