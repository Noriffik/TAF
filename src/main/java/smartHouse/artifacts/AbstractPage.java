package smartHouse.artifacts;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import smartHouse.widgets.TopCommonWidget;

/**
 * Created by Pavlo_Derkach on 11/4/2016.
 */
public abstract class AbstractPage extends PageObject {
    @FindBy(xpath = ".//nav[@class='main-nav']")
    TopCommonWidget topCommonWidget;

    public AbstractPage(WebDriver driver) {
        super(driver);
    }

    public TopCommonWidget getTopCommonWidget() {
        return topCommonWidget;
    }
}
