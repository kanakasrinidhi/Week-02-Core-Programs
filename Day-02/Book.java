package JavaConstrucutors;

import java.util.Scanner;

class Book {
    String title, author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
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

        sc.close();
    }
}
