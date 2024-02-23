package oop;

public class AddressDriver {

    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Cityville", "CA", "12345");
        Person person = new Person("John Doe", 30, address);

        System.out.println(person.toString());
    }
}

