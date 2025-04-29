package JavaConstrucutors;

import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int roll, String n, double c) {
        rollNumber = roll;
        name = n;
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        CGPA = newCGPA;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int roll, String n, double c) {
        super(roll, n, c);
    }

    void showName() {
        System.out.println("Postgraduate Student Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll Number:");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter CGPA:");
        double cgpa = sc.nextDouble();

        PostgraduateStudent student = new PostgraduateStudent(roll, name, cgpa);
        student.display();

        sc.close();
    }
}
