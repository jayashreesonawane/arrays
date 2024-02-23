package oop;
public class Car1 {
    private String name;
    private String model;
    private int year;
    private double price;

    Car1() {
    	System.out.println("Default Consturctor");
    }

    public Car1(String name, String model) {
    	this();
        this.name= name;
        this.model = model;
    }

    public Car1(String name, String model, int year, double price) {
    	
        this(name,model);
        this.year = year;
        this.price = price;
    }

    public void displayCar() {
    	
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}
