package StaticInstanceopkeywords;
import java.util.Scanner;

class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Updated Grade for " + name + ": " + grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        Student student = new Student(roll, name, grade);
        student.displayDetails();

        System.out.print("Enter new grade to update: ");
        String newGrade = sc.nextLine();
        student.updateGrade(newGrade);

        displayTotalStudents();
    }
}
