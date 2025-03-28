import java.util.*;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends vehicle {
    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends vehicle {
    boolean hasCarrier;

    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car's max speed: ");
        int carSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Car's fuel type: ");
        String carFuel = sc.nextLine();
        System.out.print("Enter Car's seat capacity: ");
        int seats = sc.nextInt();

        System.out.print("Enter Truck's max speed: ");
        int truckSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Truck's fuel type: ");
        String truckFuel = sc.nextLine();
        System.out.print("Enter Truck's load capacity (in tons): ");
        double load = sc.nextDouble();

        System.out.print("Enter Motorcycle's max speed: ");
        int bikeSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Motorcycle's fuel type: ");
        String bikeFuel = sc.nextLine();
        System.out.print("Does Motorcycle have a carrier? (true/false): ");
        boolean carrier = sc.nextBoolean();

        vehicle[] vehicles = new vehicle[3];
        vehicles[0] = new Car(carSpeed, carFuel, seats);
        vehicles[1] = new Truck(truckSpeed, truckFuel, load);
        vehicles[2] = new Motorcycle(bikeSpeed, bikeFuel, carrier);

        System.out.println("\nVehicle Information:");
        for (vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
