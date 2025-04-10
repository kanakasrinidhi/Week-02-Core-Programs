package JavaConstrucutors;

import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        Person person1 = new Person(name, age);
        Person person2 = new Person(person1); // Copying details

        System.out.println("Original Person:");
        person1.display();

        System.out.println("Copied Person:");
        person2.display();

        sc.close();
    }
}
