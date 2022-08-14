package Utils.env;

import java.util.Properties;

public class EnvConfig extends Properties {
    private static String browser;
    private static Properties initProperties;

    public EnvConfig(){
        browser = System.getProperty(BROWSER_PROPERTY, DEFAULT_BROWSER);
    }

    public static String GetBrowser(){
        return browser;
    }

    public static final String BROWSER_PROPERTY = "browser";
    public static final String DEFAULT_BROWSER = initProperties.getProperty(BROWSER_PROPERTY);
}
