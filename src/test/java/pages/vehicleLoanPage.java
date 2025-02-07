package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.logging.Logger;

public class vehicleLoanPage extends baseTest {
    private static final Logger log = Logger.getLogger("vehicleLoanPage");
    Actions actions;

    public vehicleLoanPage(WebDriver driver) {
        super(driver, "src/main/resources/locator/calculationTools.json","src/main/resources/locator/vehicleLoan.json");
        actions = new Actions(driver);
    }

    public void clickOnTheVehicleLoanButton(){

        click(getElement("vehicleLoan"));

    }

    public void theCreditOptionIsDefinedAsAVehicleLoanPage(){

        if (getElement("mainDropdown").getText().contains("Taşıt Kredisi")) {
            log.info("Taşıt Kredisi sekmesi SEÇİLİ.");
        } else {
            log.info("Taşıt Kredisi sekmesi SEÇİLİ DEĞİL!");
            click(getElement("mainDropdown"));
            click(getElement("vehicleOption"));
        }

        if (getElement("subDropdown").getText().contains("Taşıt Kredisi")) {
            log.info("Tüketici Kredisi sekmesi SEÇİLİ.");
        } else {
            log.info("Tüketici Kredisi sekmesi SEÇİLİ DEĞİL!");
            click(getElement("mainDropdown"));
            click(getElement("vehicleOption"));
        }

    }
}
