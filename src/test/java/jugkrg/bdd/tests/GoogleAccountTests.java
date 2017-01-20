package jugkrg.bdd.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import jugkrg.bdd.utils.Highlighter;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/googleaccount.feature",
        glue = "jugkrg.bdd.stepdefinitions",
        format = {"pretty", "html:report"},
        tags = {"~@ignore"}
)
public class GoogleAccountTests {

    private static final String CHROME_DRIVER_PATH = GoogleAccountTests.class.getResource("/driver/chromedriver.exe").getPath();

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.baseUrl = "";

        WebDriverRunner.addListener(new Highlighter());
        Configuration.fastSetValue = true;
        //Configuration.timeout = 8000;
    }

}
