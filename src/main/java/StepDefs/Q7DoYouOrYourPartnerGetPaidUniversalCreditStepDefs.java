package StepDefs;


import PageObjects.Q7DoYouOrYourPartnerGetPaidUniversalCreditPageElements;
import io.cucumber.java.en.And;

public class Q7DoYouOrYourPartnerGetPaidUniversalCreditStepDefs extends BasePage{
    @And("^I enter '(.+)' to do you or your partner get paid Universal Credit?$")
    public void IEnterUniversalCredit(String input) {
        switch (input) {
            case "yes, we receive Universal Credit payments":
                ClickOn(Q7DoYouOrYourPartnerGetPaidUniversalCreditPageElements.radioYes);
                break;
            case "not yet, but we've applied":
                ClickOn(Q7DoYouOrYourPartnerGetPaidUniversalCreditPageElements.radioNotYet);
                break;
            case "no, we get a different benefit":
                ClickOn(Q7DoYouOrYourPartnerGetPaidUniversalCreditPageElements.radioNo);
                break;
            default:
                System.out.println("Unrecognised input: " + input);
                break;

        }
    }
}
