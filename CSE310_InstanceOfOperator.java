/*
- The instanceof operator in Java is used to check whether an object is an
  instance of a specific class or a subclass of that class.
*/

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow! Meow!");
    }
}

public class CSE310_InstanceOfOperator {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Upcasting

        // Checking using instanceof
        if (myAnimal instanceof Dog) {
            System.out.println("myAnimal is an instance of Dog");
            Dog myDog = (Dog) myAnimal;  // Downcasting
            myDog.bark();
        }

        if (myAnimal instanceof Animal) {
            System.out.println("myAnimal is an instance of Animal");
        }

        if (myAnimal instanceof Cat) {
            System.out.println("myAnimal is an instance of Cat");
        } else {
            System.out.println("myAnimal is NOT an instance of Cat");
        }
    }
}
