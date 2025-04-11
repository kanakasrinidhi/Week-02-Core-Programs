// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter and Setter methods (Encapsulation)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Method to calculate final price (price + tax - discount)
    public double calculateFinalPrice() {
        double discount = calculateDiscount();
        double tax = calculateTax();
        return price + tax - discount;
    }

    // Abstract method to calculate tax
    public abstract double calculateTax();
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class extending Product and implementing Taxable
class Electronics extends Product implements Taxable {
    private String warrantyDetails;

    public Electronics(int productId, String name, double price, String warrantyDetails) {
        super(productId, name, price);
        this.warrantyDetails = warrantyDetails;
    }

    // Implementing calculateDiscount for Electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount on electronics
    }

    // Implementing calculateTax for Electronics
    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax on electronics
    }

    // Implementing getTaxDetails for Electronics
    @Override
    public String getTaxDetails() {
        return "18% tax on electronics.";
    }
}

// Clothing class extending Product and implementing Taxable
class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    // Implementing calculateDiscount for Clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount on clothing
    }

    // Implementing calculateTax for Clothing
    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax on clothing
    }

    // Implementing getTaxDetails for Clothing
    @Override
    public String getTaxDetails() {
        return "5% tax on clothing.";
    }
}

// Groceries class extending Product
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementing calculateDiscount for Groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount on groceries
    }

    // Implementing calculateTax for Groceries
    @Override
    public double calculateTax() {
        return getPrice() * 0.02; // 2% tax on groceries
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Electronics(101, "Laptop", 80000, "2 years warranty");
        Product shirt = new Clothing(102, "Shirt", 1200, "Medium");
        Product rice = new Groceries(103, "Rice", 200);

        // List of products
        Product[] products = {laptop, shirt, rice};

        // Calculate and print the final price for each product
        for (Product product : products) {
            System.out.println("Product: " + product.getName());
            System.out.println("Final Price (with tax and discount): " + product.calculateFinalPrice());
            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                System.out.println(taxableProduct.getTaxDetails());
            }
            System.out.println();
        }
    }
}
