package StepDefs;

import PageObjects.Q1WhichCountryDoYouLiveInPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Q1WhichCountryDoYouLiveInStepDefs extends BasePage{
    @And ("^And I select '(.+)' as the country I live in$")
    public void AndISelectTheCountryILiveIn(String country) {
        String radioChoice = null;
        switch (country) {
            case("england"):
                radioChoice = Q1WhichCountryDoYouLiveInPageElements.radioEnland;
                break;
                case("scotland"):
                radioChoice = Q1WhichCountryDoYouLiveInPageElements.radioScotland;
                break;
                case("wales"):
                radioChoice = Q1WhichCountryDoYouLiveInPageElements.radioWales;
                break;
                case("northern ireland"):
                radioChoice = Q1WhichCountryDoYouLiveInPageElements.radioNIreland;
                break;
            default:
                System.out.println("Country not recognised: " + country);
                break;
        }
        ClickOn(radioChoice);
    }
}

