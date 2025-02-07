package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.consumerLoanPage;
import util.driverOperations;

public class consumerLoanStepDefinitions {

    consumerLoanPage consumerLoanPage = new consumerLoanPage(driverOperations.getDriver());

    @Given("Navigate to website")
    public void NavigateToWebsite(){

        consumerLoanPage.NavigateToWebsitePage();
    }

    @When("Click on the consumer loan button")
    public void clickOnTheConsumerLoanButton() {

        consumerLoanPage.clickOnTheConsumerLoanButtonPage();
    }

    @And("The credit option is defined as a consumer loan")
    public void theCreditOptionIsDefinedAsAConsumerLoan() {

        consumerLoanPage.theCreditOptionIsDefinedAsAConsumerLoanPage();
    }

    @And("Enter the {string} information")
    public void enterTheInformation(String amount) {

        consumerLoanPage.enterTheInformationPage(amount);
    }
    @And("Enter the {string} date information")
    public void enterTheInformations(String maturity) {

        consumerLoanPage.enterTheInformations(maturity);
    }

    @And("Enter the {string} rate")
    public void enterTheRate(String interest) {

        consumerLoanPage.enterTheRatePage(interest);
    }

    @And("Entered values are calculated")
    public void enteredValuesAreCalculated() {

        consumerLoanPage.enteredValuesAreCalculatedPage();
    }

    @Then("Values are verified")
    public void valuesAreVerified() {

        consumerLoanPage.valuesAreVerifiedPage();
    }


}
