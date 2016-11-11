package smartHouse.widgetsImpl;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import smartHouse.artifacts.AbstractWidgetImpl;
import smartHouse.widgets.TopCommonWidget;

/**
 * Created by Pavlo_Derkach on 11/4/2016.
 */

public class TopCommonWidgetImpl extends AbstractWidgetImpl implements TopCommonWidget {

    @FindBy(xpath = ".//a[@ng-reflect-router-link='/devices']")
    WebElementFacade devicesTab;

    public TopCommonWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public WebElementFacade getDevicesTab() {
        return devicesTab;
    }
}
