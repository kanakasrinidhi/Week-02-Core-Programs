package JavaConstrucutors;
import java.util.Scanner;

class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of the Circle:");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.display();

        sc.close();
    }
}
