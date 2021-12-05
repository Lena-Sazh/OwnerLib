package examples.config;

import org.aeonbits.owner.Config;

@Config.Sources({"file:/Users/eroshenkoam/ios.properties"})
public interface IOSConfig extends Config {

    @Key("app.location")
    String appLocation();

    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();
}
