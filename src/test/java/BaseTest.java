import com.codeborne.selenide.Configuration;
import login.LoginPage;
import mainPage.homePage.HomePage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private final String URL = "https://test.ambulette.com:12/login";
    protected LoginPage loginPage;
    protected HomePage homePage;


    @BeforeSuite
    public void config() {
        Configuration.fastSetValue = true;
    }

    @BeforeTest
    public void setup() {
        open(URL);
        loginPage = new LoginPage();
        homePage = new HomePage();
    }
}
