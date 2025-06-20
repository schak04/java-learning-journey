/*
Abstract Class:
  A class that cannot be instantiated (i.e., you can't create objects from it).
  It may or may not contain abstract methods.
  It can have both abstract (without a body) and concrete (with a body) methods.

Abstract Method:
  A method that has no body and is declared using the abstract keyword.
  Must be implemented by any subclass (child class).

Why Use Abstract Classes?
  To define common behavior for related classes.
  To force subclasses to provide their own implementation for certain methods.

- Abstract classes act as a blueprint for other classes.
- Abstract methods must be implemented by child classes.
- You cannot create objects of an abstract class.
- Abstract classes can have both abstract and concrete methods.
*/

/*
// Abstract class
abstract class Animal {
    // Abstract method (to be implemented by subclasses)
    abstract void makeSound();

    // Concrete method (has a body)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Providing implementation for abstract method
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

// Main class
public class CSE310_AbstractClassesAndMethods {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ERROR: Cannot instantiate abstract class
        Dog d = new Dog();
        d.makeSound(); // Calls overridden method
        d.sleep();     // Calls concrete method from parent class
    }
}
*/

abstract class AadhaarForm {
    String name;
    int age;
    AadhaarForm(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printDetails() {
        System.out.println("Name: "+name+"\nAge: "+age);
    }
    abstract void stateVerification();
}

class WestBengalAadhaar extends AadhaarForm {
    WestBengalAadhaar(String name, int age) {
        super(name, age);
    }
    @Override
    void stateVerification() {
        System.out.println("West Bengal verification: Ration card required");
    }
}

class DelhiAadhaar extends AadhaarForm {
    DelhiAadhaar(String name, int age) {
        super(name, age);
    }
    @Override
    void stateVerification() {
        System.out.println("Delhi verification: ELectricity bill required.");
    }
}

public class CSE310_AbstractClassesAndMethods {
    public static void main(String[] args) {
        AadhaarForm person1 = new WestBengalAadhaar("Some Bengali guy", 20);
        person1.printDetails();
        person1.stateVerification();

        AadhaarForm person2 = new DelhiAadhaar("Some Delhi guy", 30);
        person2.printDetails();
        person2.stateVerification();
    }
}