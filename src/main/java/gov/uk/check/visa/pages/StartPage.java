package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogManager().getLogger(StartPage.class.getName());

    public StartPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//section[@class='govuk-!-margin-bottom-6']/a[1]")
    WebElement start;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement selectRadio;


    public void setSelectRadio(){
        clickOnElement(selectRadio);
    }
    public void clickonStartNow() {
        clickOnElement(start);

    }

}
