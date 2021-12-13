package practice.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class UITest extends TestBase {

    @Test
    @Tag("ui")
    @DisplayName("Check for Github repo")
    public void repoCheck() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/");

        $(".header-search-input").setValue("Lena-Sazh/Lena-Sazh").submit();
        $(linkText("Lena-Sazh/Lena-Sazh")).as("Repository link").click();
        $(byText("GitHub profile README")).as("Description").isEnabled();
    }
}