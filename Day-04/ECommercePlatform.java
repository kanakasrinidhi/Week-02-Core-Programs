import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " - $" + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            p.display();
            total += p.price;
        }
        System.out.println("Total Amount: $" + total);
    }
}

class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed a new order:");
        order.showOrderDetails();
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 750.00);
        Product p2 = new Product("Mouse", 25.00);
        Product p3 = new Product("Keyboard", 45.00);

        Order order1 = new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(1002);
        order2.addProduct(p3);

        Customer c1 = new Customer("Alice");
        c1.placeOrder(order1);
        c1.placeOrder(order2);
    }
}

