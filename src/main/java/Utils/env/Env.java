package Utils.env;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class Env extends Properties {
    static String browserName = null;
    static WebDriver driver = null;

    public static String GetBrowserName() {
        browserName = EnvConfig.GetBrowser();
        if (browserName == null) {
            browserName = "chrome";
        }
        return browserName;
    }

    public static WebDriver CreateWebDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                String chromeDriverPath = "src//test//drivers//drivers//chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "firefox":
                String firefoxDriverPath = "src//test//drivers//drivers//geckodriver.exe";
                System.setProperty("webdriver.chrome.driver", firefoxDriverPath);
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.out.println("Browser not supported: " + browser);
                break;
        }
        return driver;
    }


}

