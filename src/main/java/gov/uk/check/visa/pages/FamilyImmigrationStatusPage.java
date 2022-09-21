package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "")
    WebElement immigration;

    public void immigrationStatus(){
        clickOnElement(immigration);
    }
}
