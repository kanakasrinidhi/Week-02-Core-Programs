package JavaConstrucutors;
import java.util.Scanner;

class Vehicle {
    String ownerName, vehicleType;
    static double registrationFee = 100.0;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Owner Name:");
        String owner = sc.nextLine();

        System.out.println("Enter Vehicle Type:");
        String type = sc.nextLine();

        Vehicle v1 = new Vehicle(owner, type);
        v1.displayVehicleDetails();

        sc.close();
    }
}
