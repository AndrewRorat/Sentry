import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utills.enums.EMainScrollBarSize;

@Report
@Listeners(TextReport.class)
public class LoginTest extends BaseTest {


    @Test
    public void login() {
        loginPage
                .login("brokerak", "123456789")
                .scrollBarSize(EMainScrollBarSize.BROKER);
    }
}
