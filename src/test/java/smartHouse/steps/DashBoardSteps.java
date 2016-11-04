package smartHouse.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.log4j.Logger;
import smartHouse.pages.DashBoardPage;

public class DashBoardSteps extends ScenarioSteps {

    Logger log = Logger.getLogger(getClass().getName());
    DashBoardPage dashBoardPage;

    @Step
    public void openDahBoardPage() {
        dashBoardPage.open();
        log.info("We are on dashBoard page");
    }

    @Step
    public void clickOnDevicesTab() {
        dashBoardPage.getTopCommonWidget().getDevicesTab().click();
        log.info("Devices tab was pressed");
    }
}