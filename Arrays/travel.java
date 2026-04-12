// File: Main.java
import vehicle.car;
import vehicle.bike;

public class travel {
    public static void main(String[] args) {

        car c = new car();
        bike b = new bike();

        c.start();
        c.stop();

        b.start();
        b.stop();
    }
}