// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter and Setter methods (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary: " + calculateSalary());
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Implementing calculateSalary for FullTimeEmployee
    @Override
    public double calculateSalary() {
        // Full-time employee has a fixed salary (base salary)
        return getBaseSalary();
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {

    private int workHours;

    // Constructor
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    // Getter and Setter for workHours
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    // Implementing calculateSalary for PartTimeEmployee
    @Override
    public double calculateSalary() {
        // Part-time employee's salary is based on work hours
        return getBaseSalary() * workHours;
    }
}

// Interface Department
interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

// Manager subclass implementing Department interface
class Manager extends FullTimeEmployee implements Department {
    private String department;

    public Manager(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Implementing assignDepartment() from Department interface
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    // Implementing getDepartmentDetails() from Department interface
    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    // Overriding displayDetails() to include department details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employees
        Employee fullTimeEmployee = new FullTimeEmployee(101, "John", 50000);
        Employee partTimeEmployee = new PartTimeEmployee(102, "Jane", 150, 20);
        Manager manager = new Manager(103, "Alice", 70000);
        manager.assignDepartment("HR");

        // Displaying details of employees
        fullTimeEmployee.displayDetails();
        System.out.println();
        partTimeEmployee.displayDetails();
        System.out.println();
        manager.displayDetails();
    }
}
