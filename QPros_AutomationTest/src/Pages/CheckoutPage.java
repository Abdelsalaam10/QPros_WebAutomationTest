package Pages;
import Util.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckoutPage extends PageBase {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }


    //Elements

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/h3")
    WebElement BillingDetailsHeader;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[1]/input")
    WebElement FirstNameInput;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[2]/input")
    WebElement LastNameInput;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[3]/input")
    WebElement CompanyName;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[4]/input")
    WebElement EmailAddress;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[5]/input")
    WebElement PhoneNumber;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[6]/div/a/span[2]/b")
    WebElement ListCountries;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/ul/li[67]/div")
    WebElement Country;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[7]/input")
    WebElement Address;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[9]/input")
    WebElement City;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[10]/input")
    WebElement State;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[1]/div[1]/div/p[11]/input")
    WebElement PostalCode;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[2]/div/ul/li[1]/input")
    WebElement PaymentTransferMethod1;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[2]/div/ul/li[2]/input")
    WebElement PaymentTransferMethod2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[2]/div/ul/li[3]/input")
    WebElement PaymentTransferMethod3;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/form[3]/div[2]/div/ul/li[4]/input")
    WebElement PaymentTransferMethod4;

    @FindBy(how = How.XPATH, using = "//*[@id=\"place_order\"]")
    WebElement ContinueToPaymentButton;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/p[1]")
    WebElement OrderplacedSuccessfullyMessage;







    //Methods
    public String CheckBillingDetailsForm(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, BillingDetailsHeader, 30);
        String BillingDetails = BillingDetailsHeader.getText();

        return BillingDetails;
    }

    public void InsertFirstName(WebDriver driver, String firstname) throws InterruptedException {
        waitElementToBeClickable(driver, FirstNameInput, 30);
        FirstNameInput.sendKeys(firstname);
    }

    public void InsertLastName(WebDriver driver, String lastname) throws InterruptedException {
        waitElementToBeClickable(driver, LastNameInput, 30);
        LastNameInput.sendKeys(lastname);
    }

    public void InsertCompanyName(WebDriver driver, String companyname) throws InterruptedException {
        waitElementToBeClickable(driver, CompanyName, 30);
        CompanyName.sendKeys(companyname);
    }

    public void InsertEmailAddress(WebDriver driver, String email) throws InterruptedException {
        waitElementToBeClickable(driver, EmailAddress, 30);
        EmailAddress.sendKeys(email);
    }

    public void InsertPhoneNumber(WebDriver driver, String phone) throws InterruptedException {
        waitElementToBeClickable(driver, PhoneNumber, 30);
        PhoneNumber.sendKeys(phone);
    }

    public void ListCountries(WebDriver driver) throws InterruptedException {

        waitElementToBeClickable(driver, ListCountries, 20);
        ListCountries.click();
    }

    public void SelectCountry(WebDriver driver) throws InterruptedException {

        waitElementToBeClickable(driver, Country, 20);
        Country.click();
    }

    public void InsertAddress(WebDriver driver, String address) throws InterruptedException {
        waitElementToBeClickable(driver, Address, 30);
        Address.sendKeys(address);
    }

    public void InsertCity(WebDriver driver, String city) throws InterruptedException {
        waitElementToBeClickable(driver, City, 30);
        City.sendKeys(city);
    }

    public void InsertState(WebDriver driver, String state) throws InterruptedException {
        waitElementToBeClickable(driver, State, 30);
        State.sendKeys(state);
    }

    public void InsertPostalCode(WebDriver driver, String postalcode) throws InterruptedException {
        waitElementToBeClickable(driver, PostalCode, 30);
        PostalCode.sendKeys(postalcode);
    }

    public void ChoosePaymentMethod_DirectBankTransfer(WebDriver driver) throws InterruptedException {
        waitElementToBeClickable(driver, PaymentTransferMethod1, 30);
        PaymentTransferMethod1.click();
    }

    public void ChoosePaymentMethod_CheckPayments(WebDriver driver) throws InterruptedException {
        waitElementToBeClickable(driver, PaymentTransferMethod2, 30);
        PaymentTransferMethod2.click();
    }

    public void ChoosePaymentMethod_COD(WebDriver driver) throws InterruptedException {
        waitElementToBeClickable(driver, PaymentTransferMethod3, 30);
        PaymentTransferMethod3.click();
    }

    public void ChoosePaymentMethod_PayPal(WebDriver driver) throws InterruptedException {
        waitElementToBeClickable(driver, PaymentTransferMethod4, 30);
        PaymentTransferMethod4.click();
    }

    public void ContinueToPayment(WebDriver driver) throws InterruptedException {

        waitElementToBeClickable(driver, ContinueToPaymentButton, 30);
        ContinueToPaymentButton.click();
    }

    public String SuccessfullOrderMessage(WebDriver driver) throws InterruptedException {

        waitElementToDisplay(driver, OrderplacedSuccessfullyMessage, 30);
        String Order_successMessage = OrderplacedSuccessfullyMessage.getText();
        return Order_successMessage;
    }
}
