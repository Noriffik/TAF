package smartHouse.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import smartHouse.steps.LoginPageSteps;

/**
 * Created by Pavlo_Derkach on 11/11/2016.
 */
public class LoginPageDefinitions {
    @Steps
    LoginPageSteps loginPageSteps;

    @Given("user entered a valid <email> and <password> AND it's a valid employee ID")
    @Alias("user entered an invalid <email> and <password> (e.g. user does not exist)")
    public void typeLoginAndPassword(String email, String password) {
        loginPageSteps.validUserLogin(email, password);
    }

    @When("user clicks Submit button")
    public void submit(){
        loginPageSteps.pressSubmitButton();
    }
}
