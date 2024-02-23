package oop;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
            System.out.println("Price updated successfully.");
        } else {
            System.out.println("Invalid price value.");
        }
    }
}



