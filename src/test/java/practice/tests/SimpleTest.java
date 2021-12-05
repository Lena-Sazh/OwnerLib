package practice.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SimpleTest extends TestBase {

    @Test
    public void repoCheck() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/");

        $(".header-search-input").setValue("Lena-Sazh/SovaCapital").submit();
        $(linkText("Lena-Sazh/SovaCapital")).as("Repository link").click();
        $(byText("QA Guru / HW №13 - Simple UI Tests")).as("Description").isEnabled();
    }
}