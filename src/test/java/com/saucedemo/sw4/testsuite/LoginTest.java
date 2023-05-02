package com.saucedemo.sw4.testsuite;

import com.saucedemo.sw4.pages.LoginPage;
import com.saucedemo.sw4.pages.ProductPage;
import com.saucedemo.sw4.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginP = new LoginPage();

    ProductPage product = new ProductPage();

    @Test
    public void loginPage() {
        loginP.clickOnUserNameField("standard_user");                                  // Enter “standard_user” username
        loginP.clickOnPasswordField("secret_sauce");                                // Enter “secret_sauce” password
        loginP.clickOnLoginButton();                                                         // Click on ‘LOGIN’ button
    }

    @Test
    public void productPage() {
        loginP.clickOnUserNameField("standard_user");                                  // Enter “standard_user” username
        loginP.clickOnPasswordField("secret_sauce");                                // Enter “secret_sauce” password
        loginP.clickOnLoginButton();                                                         // Click on ‘LOGIN’ button
        Assert.assertEquals(product.getErrorMessage(), "Products", "Error message not displayed");//Verifying the actual and expected text
        product.verifyThatSixProductsAreDisplayedOnPage();                                  // Verify that six products are displayed on page


    }
}