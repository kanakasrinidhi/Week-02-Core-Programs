import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int durationInMonths;

    Intern(String name, int id, double salary, int durationInMonths) {
        super(name, id, salary);
        this.durationInMonths = durationInMonths;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationInMonths + " months");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager's name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Manager's ID: ");
        int mId = sc.nextInt();
        System.out.print("Enter Manager's Salary: ");
        double mSalary = sc.nextDouble();
        System.out.print("Enter Team Size: ");
        int mTeamSize = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Developer's name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Developer's ID: ");
        int dId = sc.nextInt();
        System.out.print("Enter Developer's Salary: ");
        double dSalary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter Programming Language: ");
        String dLang = sc.nextLine();

        System.out.print("Enter Intern's name: ");
        String iName = sc.nextLine();
        System.out.print("Enter Intern's ID: ");
        int iId = sc.nextInt();
        System.out.print("Enter Intern's Salary: ");
        double iSalary = sc.nextDouble();
        System.out.print("Enter Internship Duration (in months): ");
        int iDuration = sc.nextInt();

        System.out.println("\nManager Details:");
        Employee manager = new Manager(mName, mId, mSalary, mTeamSize);
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        Employee developer = new Developer(dName, dId, dSalary, dLang);
        developer.displayDetails();

        System.out.println("\nIntern Details:");
        Employee intern = new Intern(iName, iId, iSalary, iDuration);
        intern.displayDetails();
    }
}
