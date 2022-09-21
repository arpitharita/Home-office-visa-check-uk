package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {

    @CacheLookup
   // @FindBy(xpath = "//div[@id='global-cookie-message']/div[1]/div[1]/div[2]/button")
    @FindBy(xpath = "//div[@id='global-cookie-message']/div[1]/div[1]/div[2]/button[1]")
    WebElement accept;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationality;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement contine;


    public void clickAccept(){

        clickOnElement(accept);
    }

    public void selectNationality(String nation){

        selectByVisibleTextFromDropDown(nationality,nation);

    }

    public void ClickContinue(){
        clickOnElement(contine);
    }


}
