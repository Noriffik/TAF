package smartHouse.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smartHouse.logging.Logger;
import smartHouse.pages.DashBoardPage;

public class DashBoardSteps extends ScenarioSteps {

    DashBoardPage dashBoardPage;

    @Step
    public void openDashBoardPage() {
        dashBoardPage.open();
        Logger.out.info("We are on dashBoard page");
    }

    @Step
    public void clickOnDevicesTab() {
        dashBoardPage.getTopCommonWidget().getDevicesTab().click();
        Logger.out.info("Devices tab was pressed");
    }
}