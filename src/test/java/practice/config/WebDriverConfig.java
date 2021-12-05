package practice.config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:environment/${env}.properties",
        "classpath:environment/selenoid.properties"
})

public interface WebDriverConfig extends Config {

    @Key("driver.remote")
    boolean isRemote();

    @Key("driver.browser")
    String getBrowser();

    @Key("driver.version")
    String getVersion();

    @Key("selenoid.url")
    String getRemoteUrl();

    @Key("selenoid.user")
    String getSelenoidUser();

    @Key("selenoid.pass")
    String getSelenoidPass();

}
