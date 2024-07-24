package m12_oop_inheritance;

public class IsAvsHasARelation {
}

/*
IS-A relation.
Laptop IS-A Computer
 */
class Computer {}
class Laptop extends Computer{}

/*
HAS-A relation. Composition.
Class has variable of type of other class
Vehicle HAS-A Camera
Vehicle HAS-A Engine
 */
class Camera{}
class Engine{}
class Vehicle {
    Camera camera;
    Engine engine;
}

class Address {
    String street;
    int number;
    String city;
    String zipCode;
    String country;

    public Address(String street, int number, String city, String zipCode, String country) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }
}
class House{
    Address houseAddress;

    public static void main(String[] args) {
        House house = new House();
        house.houseAddress = new Address("Main", 100, "New York", "12345","USA");

    }
}