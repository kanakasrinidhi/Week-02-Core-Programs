import java.util.*;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Publication Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();
        System.out.print("Enter Author Bio: ");
        String bio = sc.nextLine();

        Author bookAuthor = new Author(title, year, authorName, bio);

        System.out.println("\nBook and Author Details:");
        bookAuthor.displayInfo();
    }
}
