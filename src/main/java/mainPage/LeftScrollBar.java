package mainPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import mainPage.homePage.HomePage;
import org.openqa.selenium.By;
import utills.enums.EMainScrollBarSize;
import utills.enums.EMainScrollBar;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LeftScrollBar {

    private final int userButton = 0;

    private ElementsCollection leftPanelList = $$(By.xpath("//div[@id='mCSB_1_container']/*"));
    private String scrollBarButton = "//div[@id='mCSB_1_container']/li[@data-title='%s']";

    public LeftScrollBar() {
    }

    protected void clickScrollBarButton(EMainScrollBar buttonName){
        String formatLocatorResult = String.format(scrollBarButton, buttonName);
        SelenideElement result = $(By.xpath(formatLocatorResult));
        result.click();
    }

    protected ElementsCollection scrollBarCountElements(EMainScrollBarSize size) {
        return leftPanelList.shouldHave(size(size.getSize()));
    }
}
