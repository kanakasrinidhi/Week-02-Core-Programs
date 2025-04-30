package StaticInstanceopkeywords;
import java.util.Scanner;

class Employee {
    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;
    private final int id;
    private String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        Employee emp = new Employee(name, id, designation);
        emp.displayDetails();
        displayTotalEmployees();
    }
}
