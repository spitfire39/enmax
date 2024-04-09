import Pages.HomePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserRegistrationTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void checkThatItIsPossibleRegisterByRecruiter(String username, String password) {
        homePage.signInByRecruiter(username, password)
                .checkThatCandidatesPageOpened();
    }
}
