// Abstract class
abstract class Vehicle {
    abstract void start();
    abstract void fuelType();
}

// Car class
class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }

    void fuelType() {
        System.out.println("Fuel Type: Petrol/Diesel");
    }
}

// ElectricBike class
class ElectricBike extends Vehicle {

    void start() {
        System.out.println("Electric Bike starts with button");
    }

    void fuelType() {
        System.out.println("Fuel Type: Electric");
    }
}

// Main class
public class electric {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricBike();

        v1.start();
        v1.fuelType();

        v2.start();
        v2.fuelType();
    }
}