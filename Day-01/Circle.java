package ClassObj;

import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayDetails();
        sc.close();
    }
}
