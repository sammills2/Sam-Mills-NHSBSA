package StepDefs;

import PageObjects.GenericPageElements;
import io.cucumber.java.en.And;

public class GenericStepDefs extends BasePage{
    @And("^I click next$")
    public void IClickNext(){
        ClickOn(GenericPageElements.btnNext);
    }
}
