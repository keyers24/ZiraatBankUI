package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import util.locatorReader;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class baseTest {
    WebDriver driver;
    WebDriverWait wait;
    private locatorReader locatorReader;
    Actions actions;

    public baseTest(WebDriver driver,String... jsonFilePaths){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        this.actions=new Actions(driver);
        List<String> filePathList = Arrays.asList(jsonFilePaths);
        this.locatorReader = new locatorReader(filePathList);

    }

    protected WebElement getElement(String elementName) {
        if (locatorReader == null) {
            throw new IllegalStateException("LocatorReader is not initialized. Please call initLocatorReader() first.");
        }

        String locatorType = locatorReader.getLocatorType(elementName);
        String locatorValue = locatorReader.getLocatorValue(elementName);

        switch (locatorType) {
            case "id":
                return driver.findElement(By.id(locatorValue));
            case "xpath":
                return driver.findElement(By.xpath(locatorValue));
            case "css":
                return driver.findElement(By.cssSelector(locatorValue));
            case "name":
                return driver.findElement(By.name(locatorValue));
            default:
                throw new IllegalArgumentException("Invalid locator type: " + locatorType);
        }
    }

    public WebElement checkElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element) {
        WebElement visibleElement = checkElement(element);
        wait.until(ExpectedConditions.elementToBeClickable(visibleElement)).click();
    }

    public void sendKeysElement(WebElement element, String text) {
        checkElement(element).sendKeys(text);
    }

    public void keyTheKeypad(WebElement element, Keys keyboard) {
        checkElement(element).sendKeys(keyboard);
    }


    public void scrollToElement(WebElement element) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",element);
    }

}
