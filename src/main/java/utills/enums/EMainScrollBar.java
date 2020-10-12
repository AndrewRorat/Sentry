package utills.enums;

public enum EMainScrollBar {

    TRIPS_MANAGEMENT("Trips Management"),
    TRIP_HISTORY("Trip History"),
    TRIP_AUTHORIZATION("Trip Authorization"),
    TP_PAYMENT("TP Payment"),
    EDI("EDI"),
    REPORTS("Reports"),
    COMPLAINTS("Complaints"),
    REFERENCES("References"),
    ADMINISTRATION("Administration"),
    TOOLS("Tools"),
    ADMIN_TOOLS("Admin Tools"),
    LOG_OUT("LogOut");

    private String buttonName;

    EMainScrollBar(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }

}
