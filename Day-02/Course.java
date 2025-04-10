package JavaConstrucutors;
import java.util.Scanner;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Academy";

    Course(String name, int dur, double f) {
        courseName = name;
        duration = dur;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Course Name:");
        String name = sc.nextLine();

        System.out.println("Enter Duration (in months):");
        int duration = sc.nextInt();

        System.out.println("Enter Fee:");
        double fee = sc.nextDouble();

        Course c1 = new Course(name, duration, fee);
        c1.displayCourseDetails();

        sc.close();
    }
}
