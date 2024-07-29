package org.qachallenge.test;

import org.qachallenge.pages.HomePage;
import org.qachallenge.pages.LoginDashboardPage;
import org.qachallenge.pages.ProductsOrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void loginLinkAccessTest() {
        HomePage homePage = getHomePage();
        LoginDashboardPage loginDashPage = getLoginDashPage();

        homePage.clickLoginLink();

        Assert.assertEquals(loginDashPage.getLoginTitle(), "Login");
    }

    @Test
    public void dashboardLinkAccessTest() {
        HomePage homePage = getHomePage();
        LoginDashboardPage loginDashPage = getLoginDashPage();

        homePage.clickDashboardLink();

        Assert.assertEquals(loginDashPage.getDashTitle(), "Dashboard");
    }

    @Test
    public void productLinkAccessTest() {
        HomePage homePage = getHomePage();
        ProductsOrderPage productOrderPage = getProductsOrderPage();

        homePage.clickProductsLink();

        Assert.assertEquals(productOrderPage.getTitleProduct(), "Product List");
    }

    @Test
    public void orderLinkAccessTest() {
        HomePage homePage = getHomePage();
        ProductsOrderPage productOrderPage = getProductsOrderPage();

        homePage.clickOrdersLink();

        Assert.assertEquals(productOrderPage.getOrdersTitle(), "Order List");
    }

}
