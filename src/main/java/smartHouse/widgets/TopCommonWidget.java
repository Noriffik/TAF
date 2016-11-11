package smartHouse.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import smartHouse.artifacts.AbstractWidget;
import smartHouse.widgetsImpl.TopCommonWidgetImpl;

/**
 * Created by Pavlo_Derkach on 11/4/2016.
 */
@ImplementedBy(TopCommonWidgetImpl.class)
public interface TopCommonWidget extends AbstractWidget{

    WebElementFacade getDevicesTab();

    WebElementFacade getLoginTab();
}
