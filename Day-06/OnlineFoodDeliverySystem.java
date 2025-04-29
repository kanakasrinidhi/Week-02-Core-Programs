abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + "\nPrice: " + price + "\nQuantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double extraCharge = 1.5;  // Additional charge for non-veg items
        return getPrice() * getQuantity() + extraCharge;
    }
}

class DiscountedVegItem extends VegItem implements Discountable {
    private double discountPercentage;

    public DiscountedVegItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discountPercentage + "%";
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = super.calculateTotalPrice();
        return totalPrice - (totalPrice * discountPercentage / 100);
    }
}

class DiscountedNonVegItem extends NonVegItem implements Discountable {
    private double discountPercentage;

    public DiscountedNonVegItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discountPercentage + "%";
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = super.calculateTotalPrice();
        return totalPrice - (totalPrice * discountPercentage / 100);
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new DiscountedVegItem("Vegetable Pizza", 200, 2, 10);
        FoodItem nonVegItem = new DiscountedNonVegItem("Chicken Burger", 150, 3, 15);

        FoodItem[] items = {vegItem, nonVegItem};

        double totalPrice = 0;

        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }
            totalPrice += item.calculateTotalPrice();
            System.out.println();
        }

        System.out.println("Total Order Price: " + totalPrice);
    }
}
