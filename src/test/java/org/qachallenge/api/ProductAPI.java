package org.qachallenge.api;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.qachallenge.model.Product;

public class ProductAPI {

    private static final String BASE_URL = "http://localhost:5044";
    private Gson gson = new Gson();

    public Response createProduct(int id, String name, int price) {
        Product newProduct = new Product(id, name, price);
        String productJson = gson.toJson(newProduct);

        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Product")
                .header("Content-Type", "application/json")
                .body(productJson)
                .when()
                .post()
                .then()
                .extract()
                .response();
    }

    public Response getAllProducts() {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Product")
                .when()
                .get()
                .then()
                .extract()
                .response();
    }

    public Response getProductById(int id) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Product" + id)
                .when()
                .get()
                .then()
                .extract()
                .response();
    }

    public Response deleteProductById(int id) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Product" + id)
                .when()
                .delete()
                .then()
                .extract()
                .response();
    }

    public Response updateProduct(int id, String name, int price) {
        Product updatedProduct = new Product(id, name, price);
        String productJson = gson.toJson(updatedProduct);

        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/api/Product" + id)
                .header("Content-Type", "application/json")
                .body(productJson)
                .when()
                .put()
                .then()
                .extract()
                .response();
    }


}
