package Pages;
import Util.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ProductPage extends PageBase{
    WebDriver driver;
    WebDriverWait wait;


    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    //Elements
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div[2]/h1")
    WebElement Productname;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/p/ins/span")
    WebElement ProductPrice;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div[2]/form/button")
    WebElement AddtoBasketbutton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div[1]")
    WebElement AddToBasketSuccessMessage;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a/span[1]")
    WebElement ShoppingCart;


    //Methods
    public String CheckProductName(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, Productname, 30);
        String ProductName = Productname.getText();

        return ProductName;
    }

    public String CheckProductPrice(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, ProductPrice, 30);
        String Price = ProductPrice.getText();

        return Price;

    }

    public void AddToBasket(WebDriver driver) throws InterruptedException {

        waitElementToBeClickable(driver, AddtoBasketbutton, 30);
        AddtoBasketbutton.click();

    }

    public String SuccessMessageAfterAddingProduct(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, AddToBasketSuccessMessage, 30);
        String SuccessMessage = AddToBasketSuccessMessage.getText();

        return SuccessMessage;

    }

    public void GoTo_ShoppingCart(WebDriver driver) throws InterruptedException {

        waitElementToBeClickable(driver, ShoppingCart, 30);
        ShoppingCart.click();

    }
}
