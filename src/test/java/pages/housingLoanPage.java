package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.logging.Logger;

public class housingLoanPage extends baseTest {
    private static final Logger log = Logger.getLogger("housingLoanPage");
    Actions actions;

    public housingLoanPage(WebDriver driver) {
        super(driver, "src/main/resources/locator/calculationTools.json","src/main/resources/locator/housingLoan.json");
        actions = new Actions(driver);
    }

    public void clickOnTheHousingLoanButton(){

        click(getElement("housingLoan"));

    }

    public void theCreditOptionIsDefinedAsAHousingLoanPage(){

        if (getElement("mainDropdown").getText().contains("Konut Kredisi")) {
            log.info("Konut Kredisi sekmesi SEÇİLİ.");
        } else {
            log.info("Konut Kredisi sekmesi SEÇİLİ DEĞİL!");
            click(getElement("mainDropdown"));
            click(getElement("housingOption"));
        }

        if (getElement("subDropdown").getText().contains("Konut Kredisi")) {
            log.info("Konut Kredisi sekmesi SEÇİLİ.");
        } else {
            log.info("Konut Kredisi sekmesi SEÇİLİ DEĞİL!");
            click(getElement("mainDropdown"));
            click(getElement("vehicleOption"));
        }

    }
}
