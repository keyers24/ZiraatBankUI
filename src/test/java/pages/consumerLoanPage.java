package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.logging.Logger;

public class consumerLoanPage extends baseTest{

    private static final Logger log = Logger.getLogger("consumerLoanPage");
    Actions actions;

    public consumerLoanPage(WebDriver driver) {
        super(driver, "src/main/resources/locator/consumerLoan.json","src/main/resources/locator/calculationTools.json");
        actions = new Actions(driver);
    }

    public void NavigateToWebsitePage(){
        checkElement(getElement("calculationTools"));
        checkElement(getElement("LoanCalculation"));
        click(getElement("alert"));
    }
    public void clickOnTheConsumerLoanButtonPage(){
        click(getElement("consumerLoan"));

    }

    public void theCreditOptionIsDefinedAsAConsumerLoanPage(){

        if (getElement("mainDropdown").getText().contains("Tüketici Kredisi")) {
            log.info("Tüketici Kredisi sekmesi SEÇİLİ.");
        } else {
            log.info("Tüketici Kredisi sekmesi SEÇİLİ DEĞİL!");
                click(getElement("mainDropdown"));
                click(getElement("consumerLoanOption"));
        }

        if (getElement("subDropdown").getText().contains("Tüketici Kredisi")) {
            log.info("Tüketici Kredisi sekmesi SEÇİLİ.");
        } else {
            log.info("Tüketici Kredisi sekmesi SEÇİLİ DEĞİL!");
            click(getElement("mainDropdown"));
            click(getElement("consumerLoanOption"));
        }

    }
    public void enterTheInformationPage(String amount){
        getElement("calcAmount").clear();
        sendKeysElement( getElement("calcAmount"),String.valueOf(amount));

    }
    public void enterTheInformations(String Maturity){
        getElement("calcMaturity").clear();
        sendKeysElement( getElement("calcMaturity"),String.valueOf(Maturity));

    }
    public void enterTheRatePage(String interest) {
        getElement("interest");
        sendKeysElement( getElement("interest"),String.valueOf(interest));

    }
    public void enteredValuesAreCalculatedPage(){
        click(getElement("calculation"));
    }

    public void valuesAreVerifiedPage(){
        checkElement(getElement("iconOk"));
        checkElement(getElement("instalmentAmount"));
        checkElement(getElement("interestRate"));
        checkElement(getElement("costRate"));
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
