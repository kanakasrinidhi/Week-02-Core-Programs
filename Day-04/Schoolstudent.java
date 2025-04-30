import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(student student) {
        students.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " | Enrolled Students:");
        for (student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " | Enrolled Courses:");
        for (course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(student student) {
        students.add(student);
    }

    void showAllStudents() {
        System.out.println("School: " + schoolName + " | Students List:");
        for (student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class Schoolstudent {
    public static void main(String[] args) {
        school school = new school("Sunrise High School");

        student s1 = new student("Alice");
        student s2 = new student("Bob");

        course c1 = new course("Math");
        course c2 = new course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        school.showAllStudents();
        System.out.println();

        s1.showCourses();
        s2.showCourses();
        System.out.println();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
