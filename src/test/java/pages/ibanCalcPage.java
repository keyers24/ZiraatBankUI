package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.logging.Logger;

public class ibanCalcPage extends baseTest {

    private static final Logger log = Logger.getLogger("ibanCalcPage");
    Actions actions;
    public ibanCalcPage(WebDriver driver) {
        super(driver, "src/main/resources/locator/calculationTools.json","src/main/resources/locator/ibanCalc.json");
        actions = new Actions(driver);
    }
    public void NavigateToWebsitePages(){
        checkElement(getElement("calculationTools"));
        checkElement(getElement("LoanCalculation"));
        scrollToElement(getElement("ibanCalcBtn"));
        checkElement(getElement("ibanCalcBtn"));
        click(getElement("alert"));
    }
    public void goToIbanCalculationPages(){

        click(getElement("ibanCalcBtn"));
    }
    public void sortByNamePage(){

        Assert.assertTrue(getElement("nameSearch").isSelected());
    }
    public void branchSelectionIsMadePage(String branch) throws InterruptedException {
        click(getElement("branch"));
        Thread.sleep(1000);
        sendKeysElement(getElement("inputBox"),branch);
        Thread.sleep(1000);
        keyTheKeypad(getElement("inputBox"),Keys.ENTER);
        Thread.sleep(1000);
    }
    public void customerNoIsEnteredPage(String customerNo){
        sendKeysElement(getElement("customerNo"),customerNo);
    }
    public void ekNoEnteredPage(String ekNo){
        sendKeysElement(getElement("ekNo"),ekNo);
    }
    public void enteredValuesAreIbanCalculatedPage(){
        click(getElement("calcBtn"));
    }
    public void checkTheResultPage(){
        checkElement(getElement("icon"));
        checkElement(getElement("resultText"));
    }

}
