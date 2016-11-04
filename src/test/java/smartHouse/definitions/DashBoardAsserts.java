package smartHouse.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import smartHouse.steps.DashBoardStates;

/**
 * Created by Pavlo_Derkach on 11/4/2016.
 */
public class DashBoardAsserts {
    @Steps
    DashBoardStates dashBoardStates;

    @Then("list of existing devices is opened on devices tab")
    public void isListOfDevicesPresent() {
        Assert.assertTrue("user isn`t on Devices tab or list of devices is null",dashBoardStates.checkDevicesListForPresence());
    }
}
