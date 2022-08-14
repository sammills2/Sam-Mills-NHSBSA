package StepDefs;

import PageObjects.Q8AsPartOfYourJointUniversalCreditDoYouHaveAnyOfThesePageElements;
import PageObjects.Q9DidYouAndYourPartnerHaveACombinedTakeHomePayOf935OrLessPageELements;
import io.cucumber.java.en.And;

public class Q9DidYouAndYourPartnerHaveACombinedTakeHomePayOf935OrLessStepDefs extends BasePage{
    @And("^I enter '(.+)' to did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?$")
    public void IEnterCombinedPay(String input) {
        switch (input) {
            case "yes":
                ClickOn(Q9DidYouAndYourPartnerHaveACombinedTakeHomePayOf935OrLessPageELements.radioYes);
                break;
            case "no":
                ClickOn(Q9DidYouAndYourPartnerHaveACombinedTakeHomePayOf935OrLessPageELements.radioNo);
                break;
            default:
                System.out.println("Unrecognised input: " + input);
                break;

        }
    }
}
