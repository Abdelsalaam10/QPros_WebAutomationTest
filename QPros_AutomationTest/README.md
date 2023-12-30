# Web Automation Project README

## Overview

This project is designed to automate a series of test cases related to an online bookstore using Selenium WebDriver with Java. The test cases cover various scenarios, including adding a book to the shopping cart, proceeding to checkout, and placing an order with different payment methods. The project also provides flexibility in choosing the browser for test execution through the `BrowserInit` class in the `Util` package.

## Prerequisites

1. Java Development Kit (JDK) installed
2. Selenium WebDriver dependencies added to the project
3. Appropriate WebDriver executable (Edge, Chrome, or Firefox) available on the system

## Test Cases

### Test Case 1: Add Book to Cart

1. **Description:** Asserts that the "Thinking in HTML" book exists along with its price.
2. **Steps:**
   - Navigate to the website.
   - Assert the presence and price of the "Thinking in HTML" book.
   - Click on "Add to Basket" for the "Thinking in HTML" book.
   - Click on "Shopping Cart."
   - Assert that the item is added to the cart with its details.
   - Click on "Proceed to Checkout."
   - Assert that the Billing Details form is displayed.

### Test Case 2: Place Order and Pay with Credit Card

1. **Description:** Places an order and pays with a credit card.
2. **Steps:**
   - Execute Test Case 1 to add a book to the cart and proceed to checkout.
   - Fill in the Billing Details form.
   - Select "Credit Card" as the payment method.
   - Enter valid credit card details.
   - Click on "Place Order."
   - Assert that the order is successfully placed.

### Test Case 3: Place Order and Pay with PayPal

1. **Description:** Places an order and pays with PayPal.
2. **Steps:**
   - Execute Test Case 1 to add a book to the cart and proceed to checkout.
   - Fill in the Billing Details form.
   - Select "PayPal" as the payment method.
   - Log in to the PayPal account.
   - Complete the payment process.
   - Assert that the order is successfully placed.

### Test Case 4: Place Order and Pay with Bank Transfer

1. **Description:** Places an order and pays with a bank transfer.
2. **Steps:**
   - Execute Test Case 1 to add a book to the cart and proceed to checkout.
   - Fill in the Billing Details form.
   - Select "Bank Transfer" as the payment method.
   - Provide necessary bank transfer details.
   - Click on "Place Order."
   - Assert that the order is successfully placed.

## Browser Configuration

To choose the browser for test execution, modify the `BrowserInit` class in the `Util` package. In the `@BeforeMethod` annotation, change the browser type by updating the following line:

```java
driver = BrowserInit.startBrowser(URL, "edge");
```

Replace `"edge"` with `"chrome"` or `"firefox"` based on your preference. Ensure that the respective WebDriver executables are available on your system.

## Note

- The `BrowserInit` class in the `Util` package is responsible for initializing the WebDriver based on the specified browser type.
- The provided example uses "edge" as the default browser, and you can switch to "chrome" or "firefox" by modifying the mentioned line in the `@BeforeMethod` annotation.
- Please ensure that you have the appropriate WebDriver executable for your chosen browser available and accessible on your system.
- The test cases are designed to run on the Edge browser by default, as per the current laptop limitations. Adjust the browser type as needed for your testing environment.