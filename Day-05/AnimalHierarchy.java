import java.util.*;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dog's name: ");
        String dogName = sc.nextLine();
        System.out.print("Enter Dog's age: ");
        int dogAge = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Cat's name: ");
        String catName = sc.nextLine();
        System.out.print("Enter Cat's age: ");
        int catAge = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Bird's name: ");
        String birdName = sc.nextLine();
        System.out.print("Enter Bird's age: ");
        int birdAge = sc.nextInt();

        Animal dog = new Dog(dogName, dogAge);
        Animal cat = new Cat(catName, catAge);
        Animal bird = new Bird(birdName, birdAge);

        System.out.println("\nAnimal Sounds:");
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
