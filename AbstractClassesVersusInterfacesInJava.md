# Abstract Classes vs Interfaces in Java

## 1. Definition

- **Abstract Class**: A class that cannot be instantiated and may contain both abstract and concrete methods.
- **Interface**: A blueprint of a class that defines a contract with only abstract methods (before Java 8). From Java 8+, interfaces can have default and static methods.

## 2. Key Differences

| Feature               | Abstract Class | Interface |
|----------------------|---------------|-----------|
| **Methods**         | Can have both abstract and concrete methods. | Only abstract methods (before Java 8), can have `default` and `static` methods (Java 8+). |
| **Variables**       | Can have instance variables (any access modifier). | Only `public static final` variables (constants). |
| **Constructors**    | Can have constructors. | Cannot have constructors. |
| **Access Modifiers** | Methods can have any access modifier. | Methods are implicitly `public abstract` (before Java 8). |
| **Multiple Inheritance** | Supports single inheritance (can extend only one abstract class). | Supports multiple inheritance (a class can implement multiple interfaces). |
| **Usage** | Used to share code among related classes. | Used to define a contract that multiple classes can implement. |

## 3. Example Code

### Abstract Class Example

```java
abstract class Animal {
    String name;

    Animal(String name) { // Constructor allowed
        this.name = name;
    }

    abstract void makeSound(); // Abstract method

    void sleep() { // Concrete method
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Woof Woof!");
    }
}
```

### Interface Example

```java
interface Animal {
    void makeSound(); // Abstract method (implicitly public and abstract)

    default void sleep() { // Default method (Java 8+)
        System.out.println("Sleeping...");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
```

## 4. When to Use

- **Abstract Classes**: When you need to share state (fields) and behavior among related classes.
- **Interfaces**: When you need to enforce a contract across multiple unrelated classes.

## 5. Conclusion

- **Abstract classes** allow for some shared functionality but only support single inheritance.
- **Interfaces** define a strict contract but allow multiple inheritance through implementation.
- **Java 8+** introduces `default` and `static` methods in interfaces, making them more flexible.

By understanding these differences, you can choose the right approach based on your design needs.
