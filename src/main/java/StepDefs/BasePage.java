package StepDefs;

import Utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends BaseTest {

    WebElement GetByID(String ID){
        WebElement webElement = null;
        if (ID.contains("\\")){
            webElement = driver.findElement(By.xpath(ID));
        } else {
            webElement = driver.findElement(By.id(ID));
        }
        return webElement;
    }
    void Assert(){

    }//TODO

    void ClickOn(String ID){
        if (ID.contains("\\")){
            driver.findElement(By.xpath(ID)).click();
        } else {
            driver.findElement(By.id(ID)).click();
        }
    }
    void FindOnPage(){

    }//TODO

}
