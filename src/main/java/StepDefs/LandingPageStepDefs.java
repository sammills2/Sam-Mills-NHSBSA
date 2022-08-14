package StepDefs;

import PageObjects.LandingPagePageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LandingPageStepDefs extends BasePage{

    @Given("^I navigate to the landing page$")
        public void INavigateToTheLandingPage(){
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
    }

    @And("^I click Start now$")
        public void IClickStartNow(){
        ClickOn(LandingPagePageElements.btnStartNow);
    }

}
