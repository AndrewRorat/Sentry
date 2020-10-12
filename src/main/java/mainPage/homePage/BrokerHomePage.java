package mainPage.homePage;

import utills.enums.EMainScrollBar;

public class BrokerHomePage extends HomePage{

    public TripsManagementPage clickTripsManagementButton(EMainScrollBar btnName){
        clickScrollBarButton(btnName);
        return new TripsManagementPage();
    }

}
