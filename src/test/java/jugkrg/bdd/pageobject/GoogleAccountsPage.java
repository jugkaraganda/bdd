package jugkrg.bdd.pageobject;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GoogleAccountsPage {

    public GoogleAccountsPage() {
    }

    public void open() {
        Selenide.open("https://accounts.google.com");
    }

    public void enterEmail(String email) {
        $(by("placeholder", "Введите адрес электронной почты")).setValue(email);
    }

    public void submitEmail() {
        $(by("value", "Далее")).click();
    }

    public void enterPassword(String password) {
        $(by("placeholder", "Пароль")).setValue(password);
    }

    public void submitPassword() {
        $(by("value", "Войти")).click();
    }

    public void verifyPageOpen() {
        $(byText("Войдите, используя аккаунт Google")).shouldBe(visible);
    }

    public void verifyUnknownEmailMessagePresent() {
        $(byText("Не удалось распознать адрес электронной почты.")).shouldBe(visible);
    }
}
