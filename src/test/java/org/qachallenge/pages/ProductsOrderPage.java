package org.qachallenge.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.qachallenge.api.OrderAPI;
import org.qachallenge.api.ProductAPI;

import java.util.List;

public class ProductsOrderPage extends BasePage {

    ProductAPI productAPI;
    OrderAPI orderAPI;

    public ProductsOrderPage(WebDriver webDriver) {
        super(webDriver);
        productAPI = new ProductAPI();
        orderAPI = new OrderAPI();
    }

    // Locators Products
    @FindBy(css = "h2")
    private WebElement productsTitle;

    @FindBy(css = "ul li")
    private List<WebElement> productsList;


    // Locators Orders
    @FindBy(css = "h2")
    private WebElement ordersTitle;

    @FindBy(css = "ul li")
    private List<WebElement> ordersList;


    // Products methods.

    public String getTitleProduct() {
        return this.productsTitle.getText();
    }

    public int getProductCount() {
        return this.productsList.size();
    }

    public String getProductInfo(WebElement product) {
        return product.getText().trim();
    }

    public String productName(WebElement product) {
        String productInfo = getProductInfo(product);
        String[] parts = productInfo.split(" - \\$");

        if (parts.length == 2) {
            return parts[0].trim();
        } else {
            throw new IllegalStateException("Unexpected format for product information: " + productInfo);
        }
    }

    public int productPrice(WebElement product) {
        String productInfo = getProductInfo(product);
        String[] parts = productInfo.split(" - \\$");

        if (parts.length == 2) {
            return Integer.parseInt(parts[1].trim());
        } else {
            throw new IllegalStateException("Unexpected format for product information: " + productInfo);
        }
    }

    public ProductAPI getProductAPI() {
        return this.productAPI;
    }

    // Orders methods.

    public String  getOrdersTitle() {
        return this.ordersTitle.getText();
    }

    public int getOrdersCount() {
        return this.ordersList.size();
    }

    public String getOrderInfo(WebElement order) {
        return order.getText().trim();
    }

    public OrderAPI getOrderAPI() {
        return this.orderAPI;
    }

}
