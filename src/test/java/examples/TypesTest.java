package examples;

import examples.config.Browser;
import examples.config.TypesConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TypesTest {

    private TypesConfig config;

    @Test
    public void testInteger() {
        System.setProperty("integer", "10");

        config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);
    }

    @Test
    public void testBoolean() {
        System.setProperty("boolean", "false");

        config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(false);
    }

    @Test
    public void testDouble() {
        System.setProperty("double", "20.55");

        config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(20.55);
    }

    @Test
    public void testEnum() {
        System.setProperty("enum", "FIREFOX");

        config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.FIREFOX);
    }
}
