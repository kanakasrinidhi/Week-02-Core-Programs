package JavaConstrucutors;
class LibraryBook {
    private final String ISBN;
    private String title;
    private String author;

    LibraryBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
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
}

class DigitalBook extends LibraryBook {
    DigitalBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("EBook ISBN: " + getISBN());
        System.out.println("EBook Title: " + getTitle());
    }
}
