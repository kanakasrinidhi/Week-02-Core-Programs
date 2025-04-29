package ClassObj;

import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " more items added.");
    }

    void removeItem(int qty) {
        if (qty > quantity) {
            System.out.println("Not enough items to remove!");
        } else {
            quantity -= qty;
            System.out.println(qty + " items removed.");
        }
    }

    void displayTotalCost() {
        System.out.println("\nCart Summary:");
        System.out.println("Item: " + itemName);
        System.out.println("Total Cost: $" + (price * quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        CartItem cart = new CartItem(name, price, qty);
        cart.addItem(2);
        cart.removeItem(1);
        cart.displayTotalCost();

        sc.close();
    }
}

