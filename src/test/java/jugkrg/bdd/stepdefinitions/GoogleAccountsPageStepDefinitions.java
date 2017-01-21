package jugkrg.bdd.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jugkrg.bdd.pageobject.GoogleAccountsPage;
import jugkrg.bdd.utils.PasswordHelper;

import static com.codeborne.selenide.Selenide.sleep;

public class GoogleAccountsPageStepDefinitions {

    private GoogleAccountsPage page = new GoogleAccountsPage();

    @Given("user is on 'google accounts' page")
    public void userIsOnTheGoogleAccountsPage() {
        page.open();
    }

    @When("user enters '(.+)' email")
    public void userEntersEmail(String email) {
        sleep(2000);
        page.enterEmail(email);
    }

    @And("user submits email")
    public void userGoesToNextPage() {
        sleep(2000);
        page.submitEmail();
    }

    @And("user enters their password")
    public void userEntersPassword() {
        sleep(2000);
        page.enterPassword(PasswordHelper.getPassword());
    }

    @And("user submits password")
    public void userSubmitPasswords() {
        sleep(2000);
        page.submitPassword();
    }

    @Then("'google accounts' page is open")
    public void googleAccountsPageIsOpen() {
        sleep(2000);
        page.verifyPageOpen();
    }

    @And("unknown email message is present")
    public void unknownEmailMessageIsPresent() {
        sleep(2000);
        page.verifyUnknownEmailMessagePresent();
    }
}
