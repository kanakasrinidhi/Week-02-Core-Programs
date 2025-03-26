package JavaConstrucutors;

import java.util.Scanner;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Name:");
        String name = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        Product p1 = new Product(name, price);
        p1.displayProductDetails();
        Product.displayTotalProducts();

        sc.close();
    }
}
