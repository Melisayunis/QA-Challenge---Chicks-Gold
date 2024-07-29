package org.qachallenge.model;

public class Order {

    private int id;
    private String productName;
    private int quantity;
    private String status;

    public Order() {
    }

    public Order(int id, String productName, int quantity, String status) {
        this.id = id;
        this.status = status;
        this.quantity = quantity;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
