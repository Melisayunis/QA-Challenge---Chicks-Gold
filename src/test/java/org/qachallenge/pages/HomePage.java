package org.qachallenge.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    // Locators
    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(linkText = "Dashboard")
    private WebElement dashboardLink;

    @FindBy(linkText = "Products")
    private WebElement productsLink;

    @FindBy(linkText = "Orders")
    private WebElement ordersLink;

    // Methods
    public void clickLoginLink() {
        this.loginLink.click();
    }

    public void clickDashboardLink() {
        this.dashboardLink.click();
    }

    public void clickProductsLink() {
        this.productsLink.click();
    }

    public void clickOrdersLink() {
        this.ordersLink.click();
    }


}
