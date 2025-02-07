package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.vehicleLoanPage;
import util.driverOperations;

public class vehicleLoanStepDefinitions {
    vehicleLoanPage vehicleLoanPage = new vehicleLoanPage(driverOperations.getDriver());
    
    @When("Click on the vehicle loan button")
    public void clickOnTheVehicleLoanButton() {
        vehicleLoanPage.clickOnTheVehicleLoanButton();
    }

    @And("The credit option is defined as a vehicle loan")
    public void theCreditOptionIsDefinedAsAVehicleLoan() {
        vehicleLoanPage.theCreditOptionIsDefinedAsAVehicleLoanPage();
    }
}
