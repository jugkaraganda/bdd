package jugkrg.bdd.pageobject;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {

    public void verifyPageOpen() {
        $(byText("Welcome, JavaUserGroup Karaganda")).shouldBe(visible);
    }

}
