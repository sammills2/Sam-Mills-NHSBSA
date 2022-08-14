package StepDefs;

import PageObjects.Q2IsYourGPpracticeInScotlandOrWalesPageElements;
import io.cucumber.java.en.And;

public class Q2IsYourGPpracticeInScotlandOrWalesStepDefs extends BasePage{
    @And("^I enter '(.+)' to is your GP is in Scotland or Wales$")
    public void IEnterGPScotlandOrWales(String input){
        switch (input) {
            case "yes":
                ClickOn(Q2IsYourGPpracticeInScotlandOrWalesPageElements.radioYes);
                break;
            case "no":
                ClickOn(Q2IsYourGPpracticeInScotlandOrWalesPageElements.radioNo);
                break;
            default:
                System.out.println("Unrecognised input: " + input);
                break;
        }
    }
}
