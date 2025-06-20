/*
- The instanceof operator checks if an object is an instance of a specific class or its subclass.
*/

// class Animal2 {}
// class Dog extends Animal2 {}

// public class InstanceOfOperatorInJava {
//     public static void main(String[] args) {
//         Animal2 a = new Dog();
//         System.out.println(a instanceof Dog);  // true
//         System.out.println(a instanceof Animal2);  // true
//         // System.out.println(a instanceof String);  // false
//     }
// }

/*
It's useful in type checking before casting:

if (a instanceof Dog) {
    Dog d = (Dog) a;  // Safe downcasting
}
*/