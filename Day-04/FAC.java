import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class department {
    String deptName;
    ArrayList<Faculty> deptFaculties = new ArrayList<>();

    department(String deptName) {
        this.deptName = deptName;
    }

    void addFaculty(Faculty f) {
        deptFaculties.add(f);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Faculty f : deptFaculties) {
            f.showFaculty();
        }
    }
}

class University {
    String name;
    ArrayList<department> departments = new ArrayList<>();
    ArrayList<Faculty> allFaculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addFaculty(Faculty f) {
        allFaculties.add(f);
    }

    void addDepartment(department d) {
        departments.add(d);
    }

    void assignFacultyToDepartment(Faculty f, department d) {
        if (allFaculties.contains(f)) {
            d.addFaculty(f);
        }
    }

    void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (department d : departments) {
            d.showDepartment();
        }

        System.out.println("All Faculties (Including Unassigned):");
        for (Faculty f : allFaculties) {
            f.showFaculty();
        }
    }

    void deleteUniversity() {
        departments.clear();     // Composition - departments gone with university
        allFaculties.clear();    // Aggregation - for now we're removing faculty too, but logically, they could be reused
        System.out.println("\nUniversity deleted. All departments and faculties removed.");
    }
}

public class FAC {
    public static void main(String[] args) {
        University uni = new University("Smart India University");

        Faculty f1 = new Faculty("Dr. Neha");
        Faculty f2 = new Faculty("Prof. Ajay");
        Faculty f3 = new Faculty("Dr. Kavya");

        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);

        department d1 = new department("Computer Science");
        department d2 = new department("Mathematics");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.assignFacultyToDepartment(f1, d1);
        uni.assignFacultyToDepartment(f2, d2);

        uni.showUniversity();

        uni.deleteUniversity();
    }
}
