
import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book b : books) {
            b.display();
        }
    }
}

public class BOOKDEMO {
    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire", "A.P.J Abdul Kalam");
        Book b2 = new Book("Harry Potter", "J.K. Rowling");

        Library lib = new Library("Central Library");
        lib.addBook(b1);
        lib.addBook(b2);

        lib.showBooks();
    }
}

