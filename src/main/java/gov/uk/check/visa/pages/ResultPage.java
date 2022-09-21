package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogManager().getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }

    public String verifyMessage()
    {
        WebElement result = driver.findElement(By.xpath("//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']"));
        return getTextFromElement(result);

    }
    public String verifyMessages2()
    {
        WebElement result1 = driver.findElement(By.xpath("//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']"));
        return getTextFromElement(result1);

    }
    public String verifyMassages3()
    {
        WebElement result2 = driver.findElement(By.xpath("//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']"));
        return getTextFromElement(result2);

    }

}
