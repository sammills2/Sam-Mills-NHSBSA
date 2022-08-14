package Utils;

import Utils.env.Env;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
public static WebDriver driver = Env.CreateWebDriver(Env.GetBrowserName());

    }
