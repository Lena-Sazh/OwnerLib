package practice.config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/${stage}.properties",
        "classpath:config/selenide.properties"
})

public interface WebDriverConfig extends Config {

    @Key("browser.name")
    String getBrowser();

    @Key("browser.version")
    String getVersion();

    @Key("browser.remote")
    boolean isRemote();

    @Key("selenoid.url")
    String getSelenoidUrl();

    @Key("selenoid.user")
    String getSelenoidUser();

    @Key("selenoid.pass")
    String getSelenoidPass();

}
