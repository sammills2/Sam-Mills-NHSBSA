package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
WebDriver driver = CreateDriver(Env.GetBrowser);

    WebDriver CreateDriver(String Browser) {
        switch (Browser){
            case "Chrome":
            System.setProperty("webdriver.chrome.driver", Env.GetChromePath());
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            break;
            case "Firefox":
                System.setProperty("webdriver.chrome.driver", Env.GetFirefoxPath());
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.out.println("Browser not supported: " + Browser);
                break;
        }
        return driver;
    }
}