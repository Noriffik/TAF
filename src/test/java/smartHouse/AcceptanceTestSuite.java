package smartHouse;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.ScenarioType;

import static smartHouse.properties.CommonProperties.SMARTHOUSE_STORY_PATTERN;

public class AcceptanceTestSuite extends SerenityStories {

    public AcceptanceTestSuite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavlo_Derkach\\chromedriver\\chromedriver_win32\\chromedriver.exe");

        final String storiesPattern = System.getProperty(SMARTHOUSE_STORY_PATTERN);

        if (storiesPattern != null) {
            findStoriesCalled(storiesPattern);
        }
    }

    @BeforeScenario(uponType = ScenarioType.ANY)
    public void beforeScenario() {
        ThucydidesWebDriverSupport.getDriver().manage().window().maximize();
    }
}
