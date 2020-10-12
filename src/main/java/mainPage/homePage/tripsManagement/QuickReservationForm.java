package mainPage.homePage.tripsManagement;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class QuickReservationForm {

    private SelenideElement reservationTab = $(By.id("reservationSectionTab_title"));
    private SelenideElement tripLegsTab = $(By.id("legsContent_title"));
    private SelenideElement startDateCalendar = $(By.xpath("//div[@class = 'col-sm-3 col-date']"));
    private SelenideElement orderingProviderDropDown = $(By.id("clientInsurance"));
    private SelenideElement firstNameField = $(By.id("clientFirstName"));
    private SelenideElement lastNameField = $(By.id("clientLastName"));
    private SelenideElement phoneField = $(By.id("homePhone"));
    private SelenideElement tripReasonDropDown = $(By.id("trip-reason"));
    private SelenideElement levelOfServiceDropDown = $(By.id("serv-lev"));
    private SelenideElement pcaDropDown = $(By.id("pca"));
    private SelenideElement adultEscortsDropDown = $(By.id("ad-esc"));
}
