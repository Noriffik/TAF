package smartHouse.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import smartHouse.steps.LoginPageStates;

/**
 * Created by Pavlo_Derkach on 11/11/2016.
 */
public class LoginPageAsserts {
    @Steps
    LoginPageStates loginPageStates;

    @Then("user sees a screen with the such elements: username (i.e. email) text field, password field, action button to submit credentials")
    public void isSpecifiedElementsPresent() {
        Assert.assertTrue("Needed elements is not present on login page", loginPageStates.isNeededElementsPresent());
    }

    @Then("user is logged in")
    public void isUserLoggedIn() {
        Assert.assertTrue("User isn't logged in", loginPageStates.isUserLoggedIn());
    }

    @Then("error message shown")
    public void isNotificationDisplayed() {
        Assert.assertTrue("Notification wasn't shown", loginPageStates.isNotificationShown());
    }

    @Then("user remains on login page")
    public void isOnLoginPage(){
        Assert.assertTrue("User isn't on login page", loginPageStates.isOnLoginPage());
    }
}