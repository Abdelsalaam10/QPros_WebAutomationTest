package TestCases;

import Pages.BasketPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.ProductPage;
import Util.Browserinit;
import Util.PageBase;
import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tests {
    public String URL = "https://practice.automationtesting.in/"; //URL
    WebDriver driver;
    PageBase pagebase;
    HomePage homePage;
    ProductPage productPage;
    BasketPage basketPage;
    CheckoutPage checkoutPage;
    String Firstname = "Mohamed";
    String Lastname = "Abdelsalam";
    String Companyname = "QPros";
    String Email = "mohamed@gmail.com";
    String Phonenumber = "01145512828";
    String Address = "Degla Maadi";
    String City = "Maadi";
    String State = "Egypt";
    String Postcode = "11272";


    @BeforeMethod
    public void beforemethod () throws InterruptedException {
        driver = Browserinit.startbrowser( URL ,"edge");
        pagebase= new PageBase(driver);
        homePage= new HomePage(driver);
        productPage = new ProductPage(driver);
        basketPage = new BasketPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @AfterMethod
    public void aftermethod() throws InterruptedException {
        driver.close();
    }


    @Test()
    public void HappyCaseScenario() throws Exception {
        homePage.Goto_ProductPage(driver);
        Assert.assertEquals(productPage.CheckProductName(driver),"Thinking in HTML");
        Assert.assertEquals(productPage.CheckProductPrice(driver),"₹400.00");
        productPage.AddToBasket(driver);
        Assert.assertEquals(productPage.SuccessMessageAfterAddingProduct(driver).substring(12),"“Thinking in HTML” has been added to your basket.");
        productPage.GoTo_ShoppingCart(driver);
        Assert.assertEquals(basketPage.CheckName(driver),"Thinking in HTML");
        Assert.assertEquals(basketPage.CheckPrice(driver),"₹400.00");
        Assert.assertEquals(basketPage.CheckQuantity(driver),"1");
        Assert.assertEquals(basketPage.CheckSubTotal(driver),"₹400.00");
        Assert.assertEquals(basketPage.CheckTax(driver),"₹8.00");
        Assert.assertEquals(basketPage.CheckTotal(driver),"₹408.00");
        basketPage.ProceedToCheckOut(driver);
        Assert.assertEquals(checkoutPage.CheckBillingDetailsForm(driver), "Billing Details");


    }

    @Test()
    public void PlaceOrderWithPaymentMethod_DirectBankTransfer() throws Exception {
        homePage.Goto_ProductPage(driver);
        Assert.assertEquals(productPage.CheckProductName(driver),"Thinking in HTML");
        Assert.assertEquals(productPage.CheckProductPrice(driver),"₹400.00");
        productPage.AddToBasket(driver);
        Assert.assertEquals(productPage.SuccessMessageAfterAddingProduct(driver).substring(12),"“Thinking in HTML” has been added to your basket.");
        productPage.GoTo_ShoppingCart(driver);
        Assert.assertEquals(basketPage.CheckName(driver),"Thinking in HTML");
        Assert.assertEquals(basketPage.CheckPrice(driver),"₹400.00");
        Assert.assertEquals(basketPage.CheckQuantity(driver),"1");
        Assert.assertEquals(basketPage.CheckSubTotal(driver),"₹400.00");
        Assert.assertEquals(basketPage.CheckTax(driver),"₹8.00");
        Assert.assertEquals(basketPage.CheckTotal(driver),"₹408.00");
        basketPage.ProceedToCheckOut(driver);
        Assert.assertEquals(checkoutPage.CheckBillingDetailsForm(driver), "Billing Details");
        checkoutPage.InsertFirstName(driver,Firstname);
        checkoutPage.InsertLastName(driver,Lastname);
        checkoutPage.InsertCompanyName(driver,Companyname);
        checkoutPage.InsertEmailAddress(driver,Email);
        checkoutPage.InsertPhoneNumber(driver,Phonenumber);
        checkoutPage.ListCountries(driver);
        checkoutPage.SelectCountry(driver);
        checkoutPage.InsertAddress(driver,Address);
        checkoutPage.InsertCity(driver,City);
        checkoutPage.InsertState(driver,State);
        checkoutPage.InsertPostalCode(driver,Postcode);
        checkoutPage.ChoosePaymentMethod_DirectBankTransfer(driver);
        checkoutPage.ContinueToPayment(driver);
        Assert.assertEquals(checkoutPage.SuccessfullOrderMessage(driver),"Thank you. Your order has been received.");

    }

    @Test()
    public void PlaceOrderWithPaymentMethod_CheckPayments() throws Exception {
        homePage.Goto_ProductPage(driver);
        Assert.assertEquals(productPage.CheckProductName(driver),"Thinking in HTML");
        Assert.assertEquals(productPage.CheckProductPrice(driver),"₹400.00");
        productPage.AddToBasket(driver);
        Assert.assertEquals(productPage.SuccessMessageAfterAddingProduct(driver).substring(12),"“Thinking in HTML” has been added to your basket.");
        productPage.GoTo_ShoppingCart(driver);
        Assert.assertEquals(basketPage.CheckName(driver),"Thinking in HTML");
        Assert.assertEquals(basketPage.CheckPrice(driver),"₹400.00");
        Assert.assertEquals(basketPage.CheckQuantity(driver),"1");
        Assert.assertEquals(basketPage.CheckSubTotal(driver),"₹400.00");
        Assert.assertEquals(basketPage.CheckTax(driver),"₹8.00");
        Assert.assertEquals(basketPage.CheckTotal(driver),"₹408.00");
        basketPage.ProceedToCheckOut(driver);
        Assert.assertEquals(checkoutPage.CheckBillingDetailsForm(driver), "Billing Details");
        checkoutPage.InsertFirstName(driver,Firstname);
        checkoutPage.InsertLastName(driver,Lastname);
        checkoutPage.InsertCompanyName(driver,Companyname);
        checkoutPage.InsertEmailAddress(driver,Email);
        checkoutPage.InsertPhoneNumber(driver,Phonenumber);
        checkoutPage.ListCountries(driver);
        checkoutPage.SelectCountry(driver);
        checkoutPage.InsertAddress(driver,Address);
        checkoutPage.InsertCity(driver,City);
        checkoutPage.InsertState(driver,State);
        checkoutPage.InsertPostalCode(driver,Postcode);
        checkoutPage.ChoosePaymentMethod_CheckPayments(driver);
        checkoutPage.ContinueToPayment(driver);
        Assert.assertEquals(checkoutPage.SuccessfullOrderMessage(driver),"Thank you. Your order has been received.");

    }

    @Test()
    public void PlaceOrderWithPaymentMethod_CashOnDelivery() throws Exception {
        homePage.Goto_ProductPage(driver);
        Assert.assertEquals(productPage.CheckProductName(driver),"Thinking in HTML");
        Assert.assertEquals(productPage.CheckProductPrice(driver),"₹400.00");
        productPage.AddToBasket(driver);
        Assert.assertEquals(productPage.SuccessMessageAfterAddingProduct(driver).substring(12),"“Thinking in HTML” has been added to your basket.");
        productPage.GoTo_ShoppingCart(driver);
        Assert.assertEquals(basketPage.CheckName(driver),"Thinking in HTML");
        Assert.assertEquals(basketPage.CheckPrice(driver),"₹400.00");
        Assert.assertEquals(basketPage.CheckQuantity(driver),"1");
        Assert.assertEquals(basketPage.CheckSubTotal(driver),"₹400.00");
        Assert.assertEquals(basketPage.CheckTax(driver),"₹8.00");
        Assert.assertEquals(basketPage.CheckTotal(driver),"₹408.00");
        basketPage.ProceedToCheckOut(driver);
        Assert.assertEquals(checkoutPage.CheckBillingDetailsForm(driver), "Billing Details");
        checkoutPage.InsertFirstName(driver,Firstname);
        checkoutPage.InsertLastName(driver,Lastname);
        checkoutPage.InsertCompanyName(driver,Companyname);
        checkoutPage.InsertEmailAddress(driver,Email);
        checkoutPage.InsertPhoneNumber(driver,Phonenumber);
        checkoutPage.ListCountries(driver);
        checkoutPage.SelectCountry(driver);
        checkoutPage.InsertAddress(driver,Address);
        checkoutPage.InsertCity(driver,City);
        checkoutPage.InsertState(driver,State);
        checkoutPage.InsertPostalCode(driver,Postcode);
        checkoutPage.ChoosePaymentMethod_COD(driver);
        checkoutPage.ContinueToPayment(driver);
        Assert.assertEquals(checkoutPage.SuccessfullOrderMessage(driver),"Thank you. Your order has been received.");
    }
}
