package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;
import org.junit.Assert;

public class VisaConfirmation {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Start button$")
    public void iClickOnStartButton() {
        new StartPage().clickonStartNow();
    }

    @And("^I select a Nationality \"([^\"]*)\"$")
    public void iSelectANationality(String nationality) {

        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().ClickContinue();
    }

    @And("^I select reason Tourism \"([^\"]*)\"$")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectRadio();
    }

    @And("^I select reason work \"([^\"]*)\"$")
    public void iSelectReasonWork(String arg0) {
        new ReasonForTravelPage().selectRadio2();

    }

    @And("^Select intendent to stay for \"([^\"]*)\"$")
    public void selectIntendentToStayFor(String arg0) {
        new DurationOfStayPage().SelectMoreThanSixMonth();

    }

    @And("^I select have planning to work for \"([^\"]*)\"$")
    public void iSelectHavePlanningToWorkFor(String arg0) {
        new ReasonForTravelPage().selectRadio();
    }

    @Then("^I verify resultfirst \"([^\"]*)\"$")
    public void iVerifyResultfirst(String resultfrist) {
        Assert.assertEquals(resultfrist,new ResultPage().verifyMessages2());



    }

    @And("^I select reason join \"([^\"]*)\"$")
    public void iSelectReasonJoin(String arg0) {
        new StartPage().setSelectRadio();

    }

    @And("^I select state My partner of family member have uk immigration status \"([^\"]*)\"$")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String arg0) {
        new FamilyImmigrationStatusPage().immigrationStatus();

    }

    @Then("^I verify resultsecond \"([^\"]*)\"$")
    public void iVerifyResultsecond(String resultsec)   {
        Assert.assertEquals(resultsec,new ResultPage().verifyMassages3());
    }
}
