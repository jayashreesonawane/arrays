package oop;

public class ProductDriver {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 999.99, 5);

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        product.updateQuantity(10);
        System.out.println("Updated Quantity: " + product.getQuantity());

        product.updateQuantity(-2); // Invalid quantity value
    }

}
