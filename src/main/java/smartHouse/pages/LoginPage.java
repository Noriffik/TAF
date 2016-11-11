package smartHouse.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import smartHouse.artifacts.AbstractPage;

/**
 * Created by Pavlo_Derkach on 11/11/2016.
 */
public class LoginPage extends AbstractPage {

    @FindBy(xpath = ".//input[@ng-reflect-name='email']")
    WebElementFacade loginField;

    @FindBy(xpath = ".//input[@ng-reflect-name='password']")
    WebElementFacade passwordField;

    @FindBy(xpath = ".//button[@type='submit']")
    WebElementFacade submitButton;

    @FindBy(xpath = ".//div[@class='validation-message red-text text-darken-4']")
    WebElementFacade incorrectLoginOrPasswordNotification;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade getIncorrectLoginOrPasswordNotification() {
        return incorrectLoginOrPasswordNotification;
    }

    public WebElementFacade getLoginField() {
        return loginField;
    }

    public WebElementFacade getPasswordField() {
        return passwordField;
    }

    public WebElementFacade getSubmitButton() {
        return submitButton;
    }
}
