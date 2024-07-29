package org.qachallenge.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.qachallenge.pages.HomePage;
import org.qachallenge.pages.LoginDashboardPage;
import org.qachallenge.pages.ProductsOrderPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver webDriver;
    LoginDashboardPage loginDashPage;
    ProductsOrderPage productsOrderPage;

    @BeforeTest
    public void beforeTest() {
        webDriver = new FirefoxDriver();
        webDriver.navigate().to("http://localhost:3000/");

        loginDashPage = new LoginDashboardPage(webDriver);
        productsOrderPage = new ProductsOrderPage(webDriver);
    }

    @AfterTest
    public void afterTest() {
        webDriver.close();
    }


    public HomePage getHomePage() {
        return new HomePage(webDriver);
    }

    public LoginDashboardPage getLoginDashPage() {
        return new LoginDashboardPage(webDriver);
    }

    public ProductsOrderPage getProductsOrderPage() {
        return new ProductsOrderPage(webDriver);
    }

}
