package jugkrg.bdd.stepdefinitions;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jugkrg.bdd.utils.PasswordHelper;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GoogleAccountStepDefinitions {

    @Given("user is on google accounts page")
    public void userIsOnTheMainGmailPage() {
        open("https://accounts.google.com");
    }

    @When("user enters '(.+)' email")
    public void userEntersEmail(String email) {
        sleep(2000);
        $(by("placeholder", "Введите адрес электронной почты")).setValue(email);
    }

    @And("user goes to next page")
    public void userGoesToNextPage() {
        sleep(2000);
        $(by("value", "Далее")).click();
    }

    @And("user enters their password")
    public void userEntersPassword() {
        sleep(2000);
        $(by("placeholder", "Пароль")).setValue(PasswordHelper.getPassword());
    }

    @And("user clicks Enter button")
    public void userClicksEnterButton() {
        sleep(2000);
        $(by("value", "Войти")).click();
    }

    @Then("user appears on myaccount page")
    public void userAppearsOnMyAccountPage() {
        sleep(2000);
        $(byText("Welcome, JavaUserGroug Karaganda")).should(appear);
    }

    @Then("login fails with message about unknown email")
    public void loginFailsWithMessageAboutUnknownEmail() {
        $(byText("Войдите, используя аккаунт Google")).shouldBe(visible);
        $(byText("Не удалось распознать адрес электронной почты.")).should(appear);
    }

    @After
    public void close() {
        Selenide.close();
    }
}
