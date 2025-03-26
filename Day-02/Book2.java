package JavaConstrucutors;
import java.util.Scanner;

class book {
    String title, author;
    double price;
    boolean available = true;

    book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Title:");
        String title = sc.nextLine();

        System.out.println("Enter Author Name:");
        String author = sc.nextLine();

        System.out.println("Enter Book Price:");
        double price = sc.nextDouble();

        book book = new book(title, author, price);
        book.display();

        System.out.println("Do you want to borrow the book? (yes/no)");
        sc.nextLine();
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            book.borrowBook();
        }

        book.display();
        sc.close();
    }
}
