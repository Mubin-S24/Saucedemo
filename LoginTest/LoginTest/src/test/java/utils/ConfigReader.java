package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties props;

    public static Properties loadProperties() {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            props = new Properties();
            props.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return props;
    }

    public static String get(String key) {
        if (props == null) {
            loadProperties();
        }
        return props.getProperty(key);
    }
}
