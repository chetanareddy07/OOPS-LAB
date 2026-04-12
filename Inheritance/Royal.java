import java.util.Scanner;

class Reservation {

    String guestName;
    String roomType;
    int floorNumber;
    double ratePerNight;

    // 1️⃣ Default Constructor (Walk-in Guest)
    Reservation() {
        guestName = "Walk-in Guest";
        roomType = "Standard Room";
        floorNumber = 0;
        ratePerNight = 2000;
    }

    // 2️⃣ Parameterized Constructor (Advance Booking)
    Reservation(String guestName, String roomType, int floorNumber, double ratePerNight) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.floorNumber = floorNumber;
        this.ratePerNight = ratePerNight;
    }

    // 3️⃣ Copy Constructor (Refer a Friend)
    Reservation(Reservation existingGuest, String newGuestName) {
        this(newGuestName,
             existingGuest.roomType,
             existingGuest.floorNumber,
             existingGuest.ratePerNight);
    }

    void display() {
        System.out.println("\n----- Reservation Details -----");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("Rate per Night: ₹" + ratePerNight);
    }
}

public class Royal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RoyalStay Reservation System");
        System.out.println("1. Walk-in Guest");
        System.out.println("2. Advance Booking");
        System.out.println("3. Refer a Friend");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Reservation reservation = null;

        switch (choice) {

            case 1:
                // Walk-in Guest
                reservation = new Reservation();
                break;

            case 2:
                // Advance Booking
                System.out.print("Enter Guest Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Room Type: ");
                String room = sc.nextLine();

                System.out.print("Enter Floor Number: ");
                int floor = sc.nextInt();

                System.out.print("Enter Nightly Rate: ");
                double rate = sc.nextDouble();

                reservation = new Reservation(name, room, floor, rate);
                break;

            case 3:
                // Refer a Friend
                System.out.println("Enter Existing Guest Details:");

                System.out.print("Enter Guest Name: ");
                String oldName = sc.nextLine();

                System.out.print("Enter Room Type: ");
                String oldRoom = sc.nextLine();

                System.out.print("Enter Floor Number: ");
                int oldFloor = sc.nextInt();

                System.out.print("Enter Nightly Rate: ");
                double oldRate = sc.nextDouble();
                sc.nextLine();

                Reservation existing =
                        new Reservation(oldName, oldRoom, oldFloor, oldRate);

                System.out.print("Enter New Guest Name: ");
                String newName = sc.nextLine();

                reservation = new Reservation(existing, newName);
                break;

            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        reservation.display();

        sc.close();
    }
}