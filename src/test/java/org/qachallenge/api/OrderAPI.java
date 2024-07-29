package org.qachallenge.api;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.qachallenge.model.Order;

public class OrderAPI {

    private static final String BASE_URL = "http://localhost:5044";
    private Gson gson = new Gson();

    public Response createOrder(int id, String productName, int quantity, String status) {
        Order newOrder = new Order(id, productName, quantity, status);
        String orderJson = gson.toJson(newOrder);

        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Order")
                .header("Content-Type", "application/json")
                .body(orderJson)
                .when()
                .post()
                .then()
                .extract()
                .response();
    }

    public Response getAllOrders() {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Order")
                .when()
                .get()
                .then()
                .extract()
                .response();
    }

    public Response getOrderById(int parameterID) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Order" + parameterID)
                .when()
                .get()
                .then()
                .extract()
                .response();
    }

    public Response deleteOrderById(int parameterID) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Order" + parameterID)
                .when()
                .delete()
                .then()
                .extract()
                .response();
    }

    public Response updateOrder(int id, String productName, int quantity, String status, int parameterID) {
        Order updatedOrder = new Order(id, productName,quantity, status);
        String orderJson = gson.toJson(updatedOrder);

        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Order" + parameterID)
                .header("Content-Type", "application/json")
                .body(orderJson)
                .when()
                .put()
                .then()
                .extract()
                .response();
    }



}
