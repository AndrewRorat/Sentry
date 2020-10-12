package mainPage.homePage;

import com.codeborne.selenide.ElementsCollection;
import mainPage.LeftScrollBar;
import utills.enums.EMainScrollBarSize;

public class HomePage extends LeftScrollBar {
    public HomePage() {
    }


    public ElementsCollection scrollBarSize(EMainScrollBarSize elementsCount) {
        return scrollBarCountElements(elementsCount);
    }
}
