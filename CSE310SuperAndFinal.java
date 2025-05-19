/*
Final Variable -> Cannot be reassigned.
Final Method -> Cannot be overridden.
Final Class -> Cannot be inherited.
Super Keyword -> Used to access the parent class methods and constructor.
*/

// Final class: Cannot be inherited
final class FinalClass {
    public void show() {
        System.out.println("This is a final class, cannot be extended.");
    }
}

// Parent class with final method and final variable
class Parent {
    final int CONSTANT = 50; // Final variable

    Parent() {
        System.out.println("Parent class constructor");
    }

    final void display() { // Final method (cannot be overridden)
        System.out.println("Final method in Parent class.");
    }
}

// Child class using super and final keywords
class Child extends Parent {
    Child() {
        super(); // Calls Parent class constructor
        System.out.println("Child class constructor");
    }

    void show() {
        System.out.println("Accessing final variable from Parent: " + super.CONSTANT); // Using super to access final variable
        super.display(); // Calling final method from Parent using super
    }
}

public class CSE310SuperAndFinal {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();

        // Demonstrating final class
        FinalClass fObj = new FinalClass();
        fObj.show();
    }
}
