package org.qachallenge.test;

import org.qachallenge.data.LoginData;
import org.qachallenge.pages.HomePage;
import org.qachallenge.pages.LoginDashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDashboardPagesTest extends BaseTest {

    @Test
    public void loginElementsTest() {
        HomePage homePage = getHomePage();
        LoginDashboardPage loginDashPage = getLoginDashPage();

        homePage.clickLoginLink();

        Assert.assertEquals(loginDashPage.getLoginTitle(), "Login");
        Assert.assertEquals(loginDashPage.getUsername(), "Username");
        Assert.assertEquals(loginDashPage.getPassword(), "Password");
        Assert.assertEquals(loginDashPage.getButtonName(), "Login");
    }

    @Test(dataProvider = "loginErrorData", dataProviderClass = LoginData.class)
    public void loginErrorTest(String username, String password) {
        HomePage homePage = getHomePage();
        LoginDashboardPage loginDashPage = getLoginDashPage();

        homePage.clickLoginLink();

        loginDashPage.setUsername(username);
        loginDashPage.setPassword(password);
        loginDashPage.clickLoginButton();

        Assert.assertEquals(loginDashPage.getReplyMessage(), "Login failed");

        loginDashPage.clearFields();
    }

    @Test(dataProvider = "loginData", dataProviderClass = LoginData.class)
    public void loginSuccessfulTest(String username, String password) {
        HomePage homePage = getHomePage();
        LoginDashboardPage loginDashPage = getLoginDashPage();

        homePage.clickLoginLink();

        loginDashPage.setUsername(username);
        loginDashPage.setPassword(password);
        loginDashPage.clickLoginButton();

        Assert.assertEquals(loginDashPage.getReplyMessage(), "Logged in with token: sampletoken");

        loginDashPage.clearFields();
    }


    @Test
    public void dashboardTest() {
        HomePage homePage = getHomePage();
        LoginDashboardPage loginDashPage = getLoginDashPage();

        homePage.clickDashboardLink();

        Assert.assertEquals(loginDashPage.getDashTitle(), "Dashboard");
        Assert.assertEquals(loginDashPage.getDashWelcome(), "Welcome to the user dashboard!");
    }


}
