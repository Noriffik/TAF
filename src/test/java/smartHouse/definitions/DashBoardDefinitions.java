package smartHouse.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import smartHouse.steps.DashBoardSteps;

public class DashBoardDefinitions {

    @Steps
    DashBoardSteps dashBoardSteps;

    @Given("the user is on the smartHouse dashBoard page")
    public void openDashBoardPage() {
        dashBoardSteps.openDashBoardPage();
    }

    @When("the user clicks on devices tab")
    public void navigateToDevices() {
        dashBoardSteps.clickOnDevicesTab();
    }
}
