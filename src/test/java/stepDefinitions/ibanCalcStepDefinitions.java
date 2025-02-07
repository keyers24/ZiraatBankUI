package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ibanCalcPage;
import util.driverOperations;

public class ibanCalcStepDefinitions {

    ibanCalcPage ibanCalcPage = new ibanCalcPage(driverOperations.getDriver());

    @Given("Navigate To Website")
    public void navigateToWebsite() {
        ibanCalcPage.NavigateToWebsitePages();
    }

    @When("Go to iban calculation page")
    public void goToIbanCalculationPage() {
        ibanCalcPage.goToIbanCalculationPages();
    }

    @And("Sorted by name")
    public void sortedBy() {
        ibanCalcPage.sortByNamePage();
    }

    @And("{string} selection is made")
    public void branchSelectionIsMade(String branch) throws InterruptedException {
        ibanCalcPage.branchSelectionIsMadePage(branch);
    }

    @And("{string} is entered")
    public void isEntered(String customerNo) {
        ibanCalcPage.customerNoIsEnteredPage(customerNo);
    }

    @And("{string} entered")
    public void ekNoEntered(String ekNo) {
        ibanCalcPage.ekNoEnteredPage(ekNo);
    }

    @And("The entered values for iban are calculated")
    public void enteredValuesAreIbanCalculated() {
        ibanCalcPage.enteredValuesAreIbanCalculatedPage();
    }

    @Then("Check the result")
    public void checkTheResult() {
        ibanCalcPage.checkTheResultPage();
    }

}
