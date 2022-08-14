package StepDefs;

import PageObjects.Q6DoYouOrYourPartnerClaimAnyBenefitsOrTaxCreditsPageElements;
import io.cucumber.java.en.And;

public class Q6DoYouOrYourPartnerClaimAnyBenefitsOrTaxCreditsStepDefs extends BasePage{
    @And("^I enter '(.+)' to do you or your partner claim any benefits or tax credits?$")
    public void IEnterBenefitsOrTaxCredits(String input) {
        switch (input) {
            case "yes":
                ClickOn(Q6DoYouOrYourPartnerClaimAnyBenefitsOrTaxCreditsPageElements.radioYes);
                break;
            case "no":
                ClickOn(Q6DoYouOrYourPartnerClaimAnyBenefitsOrTaxCreditsPageElements.radioNo);
                break;
            default:
                System.out.println("Unrecognised input: " + input);
                break;

        }
    }
}
