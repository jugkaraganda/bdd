package jugkrg.bdd.stepdefinitions;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;

public class CommonPageStepDefinitions {

    @After
    public void close() {
        Selenide.close();
    }

}
