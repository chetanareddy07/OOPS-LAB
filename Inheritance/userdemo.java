import java.util.Scanner;

class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Buyer extends User {
    double amount;

    Buyer(String name, String email, double amount) {
        super(name, email);
        this.amount = amount;
    }

    void transaction() {
        System.out.println("Buyer Transaction Amount: " + amount);
    }
}

class Seller extends User {
    double amount;

    Seller(String name, String email, double amount) {
        super(name, email);
        this.amount = amount;
    }

    void transaction() {
        System.out.println("Seller Transaction Amount: " + amount);
    }
}

public class UserDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Transaction Amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. Buyer");
        System.out.println("2. Seller");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                Buyer b = new Buyer(name, email, amount);
                b.display();
                b.transaction();
                break;

            case 2:
                Seller s = new Seller(name, email, amount);
                s.display();
                s.transaction();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}