import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class SportsCar extends Car {
    double accelerationTime;

    SportsCar(String brand, int speed, String fuelType, double accelerationTime) {
        super(brand, speed, fuelType);
        this.accelerationTime = accelerationTime;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Acceleration Time (0-100 km/h): " + accelerationTime + " seconds");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Speed (km/h): ");
        int speed = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuelType = sc.nextLine();

        System.out.print("Enter Acceleration Time (seconds): ");
        double acceleration = sc.nextDouble();

        SportsCar car = new SportsCar(brand, speed, fuelType, acceleration);

        System.out.println("\n--- Vehicle Details ---");
        car.displayDetails();

        sc.close();
    }
}