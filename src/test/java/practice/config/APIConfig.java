package practice.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:api.properties"
})
public interface APIConfig extends Config {

    @Key("baseURL")
    String getBaseUrl();

    @Key("cookie")
    String getCookie();
}
