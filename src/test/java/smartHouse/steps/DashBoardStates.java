package smartHouse.steps;

import net.thucydides.core.annotations.Step;
import org.apache.log4j.Logger;
import smartHouse.pages.DevicesPage;

/**
 * Created by Pavlo_Derkach on 11/4/2016.
 */
public class DashBoardStates {
    Logger log = Logger.getLogger(getClass().getName());
    DevicesPage devicesPage;

    @Step
    public boolean checkDevicesListForPresence() {
        boolean isDevicesListPresent = false;
        if (!devicesPage.getDevicesList().isEmpty()) {
            isDevicesListPresent = true;
            log.info("Devices list present");
        }
        return isDevicesListPresent;
    }
}
