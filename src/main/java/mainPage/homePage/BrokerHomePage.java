package mainPage.homePage;

import mainPage.homePage.tripsManagement.TripsManagementPage;
import utills.enums.EMainScrollBar;

public class BrokerHomePage extends HomePage{

    public TripsManagementPage clickTripsManagementButton(EMainScrollBar btnName){
        clickScrollBarButton(btnName);
        return new TripsManagementPage();
    }

}
