package smartHouse.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import smartHouse.artifacts.AbstractPage;

import java.util.List;

/**
 * Created by Pavlo_Derkach on 11/4/2016.
 */
public class DevicesPage extends AbstractPage {

    @FindBy(xpath = ".//div[@class='sensors-list']//tbody[@class='sensors-list-table__body']")
    List<WebElementFacade> devicesList;

    public DevicesPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElementFacade> getDevicesList() {
        return devicesList;
    }
}
