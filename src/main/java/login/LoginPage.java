package login;

import com.codeborne.selenide.SelenideElement;
import mainPage.homePage.HomePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement usernameOrEmailField = $(By.id("userName"));

    private SelenideElement passwordField = $(By.id("password"));

    private SelenideElement loginButton = $(By.id("butSubmit"));

    public LoginPage() {
    }

    private LoginPage enterUsernameOrEmailField(String text) {
        usernameOrEmailField.sendKeys(text);
        return this;
    }

    private LoginPage enterPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public HomePage login(String text, String password) {
        enterUsernameOrEmailField(text);
        enterPasswordField(password);
        loginButton.click();
        return new HomePage();
    }
}