package StepDefs;

import PageObjects.Q4WhatIsYourDateOfBirthPageElements;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

public class Q4WhatIsYourDateOfBirthStepDefs extends BasePage{
    @And("^I enter '(.+)' as my date of birth$")
    public void IEnterDateOfBirth(String input){
        String[] dateOfBirth = input.split("/");
        WebElement[] fields = null;
        fields[0] = GetPageElement(Q4WhatIsYourDateOfBirthPageElements.txtDay);
        fields[1] = GetPageElement(Q4WhatIsYourDateOfBirthPageElements.txtMonth);
        fields[2] = GetPageElement(Q4WhatIsYourDateOfBirthPageElements.txtYear);
        for (int i = 0; i <3; i++) {
            fields[i].clear();
            fields[i].sendKeys(dateOfBirth[i]);
        }

    }
}
