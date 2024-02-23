package oop;

public class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Invalid quantity value.");
        }
    }
}




