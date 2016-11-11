package smartHouse.steps;

import net.thucydides.core.annotations.Step;
import smartHouse.logging.Logger;
import smartHouse.pages.DevicesPage;


/**
 * Created by Pavlo_Derkach on 11/4/2016.
 */
public class DashBoardStates {
    DevicesPage devicesPage;

    @Step
    public boolean checkDevicesListForPresence() {
        boolean isDevicesListPresent = false;
        if (!devicesPage.getDevicesList().isEmpty()) {
            isDevicesListPresent = true;
            Logger.out.info("Devices list present");
        }
        return isDevicesListPresent;
    }
}
