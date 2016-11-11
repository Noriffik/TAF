package smartHouse.steps;

import net.thucydides.core.annotations.Step;
import smartHouse.pages.LoginPage;

/**
 * Created by Pavlo_Derkach on 11/11/2016.
 */
public class LoginPageSteps {

    LoginPage loginPage;

    @Step
    public void validUserLogin(String login, String password) {
        loginPage.getLoginField().type(login);
        loginPage.getPasswordField().type(password);
    }

    @Step
    public void pressSubmitButton() {
        loginPage.getSubmitButton().click();
    }
}
