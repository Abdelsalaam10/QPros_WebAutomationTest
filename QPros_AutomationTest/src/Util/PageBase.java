package Util;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageBase {

    protected WebDriver driver;
    protected Actions builder;
    protected 	JavascriptExecutor js =  null;

    public PageBase(WebDriver driver ) {
        PageFactory.initElements(driver, this);
        builder = new Actions(driver);
    }

    public void waitElementToDisplay(WebDriver driver , WebElement until , int timeInSeconds)
    {
        //Duration.ofSeconds(timeInSeconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOf(until));
    }

    public void waitElementToBeClickable(WebDriver driver , WebElement until , int timeInSeconds)
    {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(until));
    }

    public void switchTab(WebDriver driver)
    {
        Iterator<String> handleIterator =  driver.getWindowHandles().iterator();
        while (handleIterator.hasNext())
        {
            String handle = handleIterator.next();
            if (!handleIterator.hasNext())
            {
                driver.switchTo().window(handle);
            }
        }
    }

    public Alert switchAlert(WebDriver driver){

        return driver.switchTo().alert();
    }


}
