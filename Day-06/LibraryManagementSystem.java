
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getItemDetails() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem {
    private int loanDuration;

    public Book(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author);
        this.loanDuration = loanDuration;
    }

    @Override
    public int getLoanDuration() {
        return loanDuration;
    }
}

class Magazine extends LibraryItem {
    private int loanDuration;

    public Magazine(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author);
        this.loanDuration = loanDuration;
    }

    @Override
    public int getLoanDuration() {
        return loanDuration;
    }
}

class DVD extends LibraryItem {
    private int loanDuration;

    public DVD(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author);
        this.loanDuration = loanDuration;
    }

    @Override
    public int getLoanDuration() {
        return loanDuration;
    }
}

class BookReservable extends Book implements Reservable {
    public BookReservable(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author, loanDuration);
    }

    @Override
    public void reserveItem() {
        System.out.println("The book has been reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true; // Assuming the book is available
    }
}

class MagazineReservable extends Magazine implements Reservable {
    public MagazineReservable(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author, loanDuration);
    }

    @Override
    public void reserveItem() {
        System.out.println("The magazine has been reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true; // Assuming the magazine is available
    }
}

class DVReservable extends DVD implements Reservable {
    public DVReservable(String itemId, String title, String author, int loanDuration) {
        super(itemId, title, author, loanDuration);
    }

    @Override
    public void reserveItem() {
        System.out.println("The DVD has been reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true; // Assuming the DVD is available
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new BookReservable("B001", "Java Programming", "John Doe", 14);
        LibraryItem magazine = new MagazineReservable("M001", "Tech Monthly", "Jane Doe", 7);
        LibraryItem dvd = new DVReservable("D001", "Java for Beginners", "Alex Smith", 5);

        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem();
                System.out.println("Availability: " + reservableItem.checkAvailability());
            }
            System.out.println();
        }
    }
}
