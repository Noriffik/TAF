package smartHouse.steps;

import net.thucydides.core.annotations.Step;
import smartHouse.logging.Logger;
import smartHouse.pages.LoginPage;

/**
 * Created by Pavlo_Derkach on 11/11/2016.
 */
public class LoginPageStates {

    LoginPage loginPage;

    @Step
    public boolean isNeededElementsPresent() {
        boolean isNeededElementsPresent = false;
        if (loginPage.getLoginField().isPresent()) {
            isNeededElementsPresent = true;
            Logger.out.info("Login field present");
        }
        return isNeededElementsPresent;
    }

    @Step
    public boolean isUserLoggedIn() {
        boolean isUserLoggedIn = true;
        Logger.out.info("Implementation of logged user behavior is not yet described");
        return isUserLoggedIn;
    }

    @Step
    public boolean isNotificationShown() {
        boolean isNotificationDisplayed = false;
        if (loginPage.getIncorrectLoginOrPasswordNotification().isPresent()) {
            isNotificationDisplayed = true;
            Logger.out.info("Incorrect login or password notification was displayed");
        }
        return isNotificationDisplayed;
    }

    @Step
    public boolean isOnLoginPage() {
        boolean isOnLoginPage = false;
        if (loginPage.getTitle().equals("login")) {
            isOnLoginPage = true;
            Logger.out.info("User is still on login page");
        }
        return isOnLoginPage;
    }
}
