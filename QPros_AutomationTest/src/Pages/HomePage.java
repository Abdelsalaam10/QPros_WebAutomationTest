package Pages;

import Util.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    //Elements
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/ul/li")
    WebElement Product;


    //Methods
    public void Goto_ProductPage(WebDriver driver) throws InterruptedException {

        JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
        scrolldown.executeScript("window.scrollBy(0, 800);");

        waitElementToDisplay(driver, Product, 30);
        Product.click();

    }

}
