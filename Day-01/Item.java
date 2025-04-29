package ClassObj;
import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double getTotalCost(int quantity) {
        return price * quantity;
    }

    void displayDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price per unit: $" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        Item item = new Item(code, name, price);
        item.displayDetails();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Total Cost: $" + item.getTotalCost(quantity));
        sc.close();
    }
}
