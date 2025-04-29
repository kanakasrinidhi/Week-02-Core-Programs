package JavaConstrucutors;
import java.util.Scanner;

class HotelBooking {
    String guestName, roomType;
    int nights;

    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    HotelBooking(HotelBooking hb) {
        guestName = hb.guestName;
        roomType = hb.roomType;
        nights = hb.nights;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Guest Name:");
        String guestName = sc.nextLine();

        System.out.println("Enter Room Type:");
        String roomType = sc.nextLine();

        System.out.println("Enter Number of Nights:");
        int nights = sc.nextInt();

        HotelBooking booking = new HotelBooking(guestName, roomType, nights);
        booking.display();

        sc.close();
    }

    static class LIBBook {
        String title, author;
        double price;
        boolean available = true;

        LIBBook(String t, String a, double p) {
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

            LIBBook book = new LIBBook(title, author, price);
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
}
