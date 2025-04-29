package ClassObj;

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket() {
        System.out.println("\nTicket Booked Successfully!");
    }

    void displayTicket() {
        System.out.println("\nMovie Ticket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        MovieTicket ticket = new MovieTicket(movie, seat, price);
        ticket.bookTicket();
        ticket.displayTicket();

        sc.close();
    }
}

