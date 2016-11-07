package smartHouse.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import smartHouse.artifacts.AbstractPage;

@DefaultUrl("http://garage-it-smart-house.herokuapp.com")
public class DashBoardPage extends AbstractPage {

public DashBoardPage(WebDriver driver){super(driver);}

}