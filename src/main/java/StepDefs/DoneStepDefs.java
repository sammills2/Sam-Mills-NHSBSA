package StepDefs;

import PageObjects.DonePageElements;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class DoneStepDefs extends BasePage {
    @Then("^free '(.+)' is displayed$")
    public void ThenFreeIsDisplayed(String input) {
        String target = null;
        switch (input) {
            case "NHS prescriptions":
                target = DonePageElements.labelFreePrescriptions;
                break;
            case "NHS dental check-ups and treatment":
                target = DonePageElements.labelFreeDental;
                break;
            case "sight tests":
                target = DonePageElements.labelFreePrescriptions;
                break;
            case "NHS wigs and fabric supports":
                target = DonePageElements.labelFreeWigs;
                break;
            default:
                System.out.println("Invalid Input: " + input);
        }
        GetPageElement(target);
    }

    @Then("^money off '(.+)' is displayed$")
    public void ThenMoneyOffIsDisplayed(String input) {
        String target = null;
        switch (input) {
            case "new glasses or contact lenses":
                target = DonePageElements.labelMoneyOffGlasses;
                break;
            case "repairing or replacing your glasses or contact lenses":
                target = DonePageElements.labelMoneyOffRepairs;
                break;
            case "travel for NHS treatment":
                target = DonePageElements.labelMoneyOffTravel;
                break;
            default:
                System.out.println("Invalid Input: " + input);
        }
        GetPageElement(target);
    }

    @Then("^you could get as part of the Healthy Start scheme '(.+)' is displayed$")
    public void ThenHealthyStartIsDisplayed(String input) {
        String target = null;
        switch (input) {
            case "£4.25 each week of your pregnancy from the 10th week":
                target = DonePageElements.labelHealthy425From10thWeek;
                break;
            case "£8.50 each week for children from birth to 1 year old":
                target = DonePageElements.labelHealthy850To1Year;
                break;
            case "£4.25 each week for children between 1 and 4 years old":
                target = DonePageElements.labelHealthy425Between1And4;
                break;
            default:
                System.out.println("Invalid Input: " + input);
        }
        GetPageElement(target);
    }
}


