package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.housingLoanPage;
import util.driverOperations;

public class housingLoanStepDefinitions {
    housingLoanPage housingLoanPage = new housingLoanPage(driverOperations.getDriver());
    
    @When("Click on the housing loan button")
    public void clickOnTheHousingLoanButton() {
        housingLoanPage.clickOnTheHousingLoanButton();
    }

    @And("The credit option is defined as a housing loan")
    public void theCreditOptionIsDefinedAsAHousingLoan() {
        housingLoanPage.theCreditOptionIsDefinedAsAHousingLoanPage();
    }
}
