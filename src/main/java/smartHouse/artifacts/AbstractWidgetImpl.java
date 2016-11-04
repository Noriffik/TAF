package smartHouse.artifacts;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

/**
 * Created by Pavlo_Derkach on 11/4/2016.
 */
public class AbstractWidgetImpl extends WidgetObjectImpl implements AbstractWidget {

    public AbstractWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }
}
