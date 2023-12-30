package Pages;
import Util.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BasketPage extends PageBase{
    WebDriver driver;
    WebDriverWait wait;

    public BasketPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    //Elements
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form/table/tbody/tr[1]/td[3]/a")
    WebElement Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form/table/tbody/tr[1]/td[4]/span")
    WebElement Price;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")
    WebElement Quantity;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div/div/table/tbody/tr[1]/td/span")
    WebElement SubTotal;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div/div/table/tbody/tr[2]/td/span")
    WebElement Tax;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div/div/table/tbody/tr[3]/td/strong/span")
    WebElement Total;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div/div/div/a")
    WebElement ProceedToCheckoutButton;

    //Methods
    public String CheckName(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, Name, 30);
        String Product_Name = Name.getText();

        return Product_Name;
    }

    public String CheckPrice(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, Price, 30);
        String Product_Price = Price.getText();

        return Product_Price;
    }

    public String CheckQuantity(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, Quantity, 30);
        String Product_Quantity = Quantity.getAttribute("value");

        return Product_Quantity;
    }

    public String CheckSubTotal(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, SubTotal, 30);
        String Product_SubTotal = SubTotal.getText();

        return Product_SubTotal;
    }

    public String CheckTax(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, Tax, 30);
        String Product_Tax = Tax.getText();

        return Product_Tax;
    }

    public String CheckTotal(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, Total, 30);
        String Product_Total = Total.getText();

        return Product_Total;
    }

    public void ProceedToCheckOut(WebDriver driver) throws InterruptedException {

        waitElementToBeClickable(driver, ProceedToCheckoutButton, 30);
        ProceedToCheckoutButton.click();

    }



}
