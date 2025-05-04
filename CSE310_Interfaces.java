/*
Interfaces in Java:
  An interface in Java is a reference type that defines a contract that a class must follow.
  It contains abstract methods (methods without a body) and constants (variables that are
  implicitly public, static and final). Interfaces help achieve abstraction and
  multiple inheritance in Java.
Key Features of Interfaces:
  Methods are abstract by default (before Java 8).
  Fields are public, static, and final by default.
  A class implements an interface using the implements keyword.
  A class can implement multiple interfaces, allowing multiple inheritance.
  Interfaces can have default and static methods (introduced in Java 8).
*/

interface Animal1 {
    void makeSound();
    void eat();
}

class Dog1 implements Animal1 {
    public void makeSound() {
        System.out.println("Woof");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat1 implements Animal1 {
    public void makeSound() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }
}

public class CSE310_Interfaces {
    public static void main(String[] args) {
        Animal1 dog = new Dog1();
        Animal1 cat = new Cat1();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}

/*
A class can implement multiple interfaces:

interface A {
    void methodA();
}

interface B {
    void methodB();
}

// Class implementing both interfaces
class C implements A, B {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    public void methodB() {
        System.out.println("Method B from Interface B");
    }
}

public class MultipleInterfacesExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();  // Output: Method A from Interface A
        obj.methodB();  // Output: Method B from Interface B
    }
}
*/

/*
When to Use Interfaces?
When multiple classes need to follow the same behavior but with different implementations.
When you need multiple inheritance since Java does not support multiple class inheritance.
When designing loosely coupled systems where implementation details can change without affecting the dependent code.
*/