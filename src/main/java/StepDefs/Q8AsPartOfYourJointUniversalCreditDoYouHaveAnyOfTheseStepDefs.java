package StepDefs;

import PageObjects.Q6DoYouOrYourPartnerClaimAnyBenefitsOrTaxCreditsPageElements;
import PageObjects.Q8AsPartOfYourJointUniversalCreditDoYouHaveAnyOfThesePageElements;
import io.cucumber.java.en.And;

public class Q8AsPartOfYourJointUniversalCreditDoYouHaveAnyOfTheseStepDefs extends BasePage{
    @And("^I enter '(.+)' to as part of your joint Universal Credit, do you have any of these?$")
    public void IEnterUniversalCreditThese(String input) {
        switch (input) {
            case "yes":
                ClickOn(Q8AsPartOfYourJointUniversalCreditDoYouHaveAnyOfThesePageElements.radioYes);
                break;
            case "no":
                ClickOn(Q8AsPartOfYourJointUniversalCreditDoYouHaveAnyOfThesePageElements.radioNo);
                break;
            default:
                System.out.println("Unrecognised input: " + input);
                break;

        }
    }
}
