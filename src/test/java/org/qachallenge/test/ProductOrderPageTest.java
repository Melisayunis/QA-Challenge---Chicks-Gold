package org.qachallenge.test;

import io.restassured.response.Response;
import org.qachallenge.api.OrderAPI;
import org.qachallenge.api.ProductAPI;
import org.qachallenge.data.ProductOrderData;
import org.qachallenge.model.Order;
import org.qachallenge.model.Product;
import org.qachallenge.pages.HomePage;
import org.qachallenge.pages.ProductsOrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductOrderPageTest extends BaseTest {

    // Products tests

    @Test
    public void productElementsTest() {
        HomePage homePage = getHomePage();
        ProductsOrderPage productsOrderPage = getProductsOrderPage();

        homePage.clickProductsLink();

        Assert.assertEquals(productsOrderPage.getTitleProduct(), "Product List");
    }

    @Test(dataProvider = "newProductOK", dataProviderClass = ProductOrderData.class)
    public void createNewProductTest(int id, String name, int price) {
        HomePage homePage = getHomePage();
        homePage.clickProductsLink();

        ProductsOrderPage productsOrderPage = getProductsOrderPage();
        ProductAPI productAPI = productsOrderPage.getProductAPI();
        Response response = productAPI.createProduct(id, name, price);
        Product product = response.as(Product.class);

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(product.getId(), id);
        Assert.assertEquals(product.getName(), name);
        Assert.assertEquals(product.getPrice(), price);
    }



    // Orders tests

    @Test
    public void orderElementsTest() {
        HomePage homePage = getHomePage();
        ProductsOrderPage productsOrderPage = getProductsOrderPage();

        homePage.clickOrdersLink();

        Assert.assertEquals(productsOrderPage.getOrdersTitle(), "Order List");
    }

    @Test(dataProvider = "newOrderOK", dataProviderClass = ProductOrderData.class)
    public void createNewOrderTest(int id, String productName, int quantity, String status) {
        HomePage homePage = getHomePage();
        homePage.clickOrdersLink();

        ProductsOrderPage productsOrderPage = getProductsOrderPage();
        OrderAPI productAPI = productsOrderPage.getOrderAPI();
        Response response = productAPI.createOrder(id, productName, quantity, status);
        Order order = response.as(Order.class);

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(order.getId(), id);
        Assert.assertEquals(order.getProductName(), productName);
        Assert.assertEquals(order.getQuantity(), quantity);
        Assert.assertEquals(order.getStatus(), status);
    }


}
