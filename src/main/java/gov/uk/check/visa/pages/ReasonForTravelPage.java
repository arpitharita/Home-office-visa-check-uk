package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility{

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ReasonForTravelPage(){
        PageFactory.initElements(driver, this) ;}

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement radio;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement radiowork;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement radioJoin;

    public void selectRadio()
    {
        clickOnElement(radio);

    }
    public void selectRadio2()
    {
        clickOnElement(radiowork);

    }
    public void selectRadio3()
    {
        clickOnElement(radioJoin);

    }


}
