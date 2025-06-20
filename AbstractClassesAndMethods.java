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

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai Parent2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class AbstractClassesAndMethods {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); // --> error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); // --> error
    }
}
