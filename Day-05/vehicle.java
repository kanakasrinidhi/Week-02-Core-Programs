interface Refuelable {
    void refuel();
}

class vehicle {
    String model;
    int maxSpeed;

    vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void showDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Charging electric vehicle...");
    }

    void display() {
        System.out.println("Type: Electric Vehicle");
        showDetails();
        charge();
    }
}

class PetrolVehicle extends vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
    }

    void display() {
        System.out.println("Type: Petrol Vehicle");
        showDetails();
        refuel();
    }

    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        ev.display();
        System.out.println();
        pv.display();
    }
}
