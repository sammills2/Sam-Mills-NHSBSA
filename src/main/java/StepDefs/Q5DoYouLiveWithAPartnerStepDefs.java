package StepDefs;


import PageObjects.Q5DoYouLiveWithAPartnerPageElements;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

public class Q5DoYouLiveWithAPartnerStepDefs extends BasePage {
    @And("^I enter '(.+)' to do you live with a partner?$")
    public void IEnterLiveWithPartner(String input) {
        switch (input) {
            case "yes":
                ClickOn(Q5DoYouLiveWithAPartnerPageElements.radioYes);
                break;
            case "no":
                ClickOn(Q5DoYouLiveWithAPartnerPageElements.radioNo);
                break;
            default:
                System.out.println("Unrecognised input: " + input);
                break;

        }
    }
}