package JavaConstrucutors;
import java.util.Scanner;

class CarRental {
    String customerName, carModel;
    int rentalDays;
    double rate = 50.0;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double totalCost() {
        return rentalDays * rate;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();

        System.out.println("Enter Car Model:");
        String carModel = sc.nextLine();

        System.out.println("Enter Number of Rental Days:");
        int rentalDays = sc.nextInt();

        CarRental rental = new CarRental(customerName, carModel, rentalDays);
        rental.display();

        sc.close();
    }
}
