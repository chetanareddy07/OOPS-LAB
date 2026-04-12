import java.util.Scanner;

class Appliance {
    String name;

    Appliance(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Appliance Name: " + name);
    }

    void voiceCommand(String command) {
        System.out.println("Voice Command: " + command);
    }
}

class SmartLight extends Appliance {

    SmartLight(String name) {
        super(name);
    }

    void voiceCommand(String command) {
        System.out.println("SmartLight executing command: " + command);
    }
}

class SmartThermostat extends Appliance {

    SmartThermostat(String name) {
        super(name);
    }

    void voiceCommand(String command) {
        System.out.println("SmartThermostat executing command: " + command);
    }
}

public class SmartHome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Appliance Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Voice Command: ");
        String command = sc.nextLine();

        System.out.println("1. Smart Light");
        System.out.println("2. Smart Thermostat");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                SmartLight light = new SmartLight(name);
                light.display();
                light.voiceCommand(command);
                break;

            case 2:
                SmartThermostat thermo = new SmartThermostat(name);
                thermo.display();
                thermo.voiceCommand(command);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}