package jugkrg.bdd.stepdefinitions;

import cucumber.api.java.en.Then;
import jugkrg.bdd.pageobject.MyAccountPage;

public class MyAccountPageStepDefinitions {

    private MyAccountPage page = new MyAccountPage();

    @Then("'my account' page is open")
    public void myAccountPageIsOpen() {
        page.verifyPageOpen();
    }

}
