package practice.tests;

import practice.config.WebDriverConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    @BeforeAll
    static void setupBeforeAll() {

        if (System.getProperty("env") != null) {
            WebDriverConfig config = ConfigFactory
                    .create(WebDriverConfig.class, System.getProperties());

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);

            Configuration.browserCapabilities = capabilities;
            Configuration.browser = config.getBrowser();
            Configuration.browserVersion = config.getVersion();
            Configuration.startMaximized = true;

            if (config.isRemote()) {
                String user = config.getSelenoidUser();
                String pass = config.getSelenoidPass();
                String url = config.getRemoteUrl();
                Configuration.remote = String.format("https://%s:%s@%s", user, pass, url);
            }
        }
    }
}