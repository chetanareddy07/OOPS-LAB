import java.util.Scanner;

// Parent class
class Shape {
    double length, breadth;

    // Constructor to initialize dimensions
    Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

// Rectangle class
class Rectangle extends Shape {

    // Constructor calling parent constructor
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class rect {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);
        r.calculateArea();
    }
}