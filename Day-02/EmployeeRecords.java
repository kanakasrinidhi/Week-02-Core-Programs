package JavaConstrucutors;
import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Department:");
        String dept = sc.nextLine();

        System.out.println("Enter Salary:");
        double sal = sc.nextDouble();

        Manager mgr = new Manager(id, dept, sal);
        mgr.display();
        mgr.displayManagerDetails();

        sc.close();
    }
}
