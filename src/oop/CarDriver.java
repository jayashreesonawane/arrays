package oop;

public class CarDriver {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 25000.0);

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: $" + car.getPrice());

        car.updatePrice(28000.0);
        System.out.println("Updated Price: $" + car.getPrice());

        car.updatePrice(-1000.0); // Invalid price value
    }
}

