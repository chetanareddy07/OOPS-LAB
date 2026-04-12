// Base class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Derived class
class Doctor extends Person {
    String specialization;

    // Constructor using super()
    Doctor(String name, int age, String specialization) {
        super(name, age);   // calling base class constructor
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class per {
    public static void main(String[] args) {

        Doctor d = new Doctor("Chetana", 21, "Cardiologist");
        d.display();
    }
}