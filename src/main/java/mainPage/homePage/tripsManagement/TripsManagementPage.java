package mainPage.homePage.tripsManagement;

import com.codeborne.selenide.*;
import mainPage.homePage.BrokerHomePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TripsManagementPage extends BrokerHomePage {

    private SelenideElement quickReservationButton = $(By.id("createNewQuickTripRequestBtn"));
}
