
import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    void displayEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String companyName;
    ArrayList<department> departments = new ArrayList<>();

    Company(String name) {
        this.companyName = name;
    }

    void addDepartment(department dept) {
        departments.add(dept);
    }

    void showStructure() {
        System.out.println("Company: " + companyName);
        for (department d : departments) {
            d.displayEmployees();
        }
    }

    void deleteCompany() {
        departments.clear();
        System.out.println("Company and all its departments and employees deleted.");
    }
}

public class COM{
    public static void main(String[] args) {
        Company comp = new Company("TechNova");

        department dev = new department("Development");
        dev.addEmployee("Alice");
        dev.addEmployee("Bob");

        department hr = new department("HR");
        hr.addEmployee("Carol");

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showStructure();

        // Simulating deletion of company
        comp.deleteCompany();
    }
}




