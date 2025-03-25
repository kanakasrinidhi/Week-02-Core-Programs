package ClassObj;

import java.util.Scanner;

class MobilePhone {
    String brand, model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand Name: ");
        String brand = sc.nextLine();
        System.out.print("Enter Model Name: ");
        String model = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayDetails();
        sc.close();
    }
}
