package StepDefs;

import PageObjects.Q3WhichCountryIsYourDentalPracticeInPageElements;
import io.cucumber.java.en.And;

public class Q3WhichCountryIsYourDentalPracticeInStepDefs extends BasePage{
    @And("^I enter '(.+)' to which country is your dental practice in?$")
    public void IEnterDentalPracticeCountry(String input){
        String radioChoice = null;
        switch (input) {
            case("england"):
                radioChoice = Q3WhichCountryIsYourDentalPracticeInPageElements.radioEnland;
                break;
            case("scotland"):
                radioChoice = Q3WhichCountryIsYourDentalPracticeInPageElements.radioScotland;
                break;
            case("wales"):
                radioChoice = Q3WhichCountryIsYourDentalPracticeInPageElements.radioWales;
                break;
            case("northern ireland"):
                radioChoice = Q3WhichCountryIsYourDentalPracticeInPageElements.radioNIreland;
                break;
                case("I am not registered with a dental practice"):
                radioChoice = Q3WhichCountryIsYourDentalPracticeInPageElements.radioNotRegistered;
                break;
            default:
                System.out.println("Country not recognised: " + input);
                break;
        }
        ClickOn(radioChoice);
    }
}
