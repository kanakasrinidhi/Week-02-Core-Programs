package StaticInstanceopkeywords;

import java.util.Scanner;

class Vehicle {
    private static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Registration Number: ");
        String regNumber = sc.nextLine();
        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();

        Vehicle vehicle = new Vehicle(regNumber, owner, type);
        vehicle.displayDetails();

        System.out.print("Enter new Registration Fee to update: ");
        double newFee = sc.nextDouble();
        updateRegistrationFee(newFee);
    }
}
