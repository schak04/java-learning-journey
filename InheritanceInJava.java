/*
Inheritance Basics:
  A subclass inherits variables and methods from its superclass.
  If a subclass does not redefine a variable, it directly uses the inherited one.

Variable Shadowing:
  If a subclass declares a variable with the same name as the superclass, it creates a new variable in the subclass.
  The superclass variable remains unchanged and can still be accessed using super.variableName.
*/


class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    
    Base(){
        System.out.println("Base");
    }
}

class Derived extends Base{
    public int y;
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        System.out.println("I am in derived and setting y now");
        this.y = y;
    }

    Derived() {
        System.out.println("Derived");
    }
}

public class InheritanceInJava {
    public static void main(String[] args) {
        // Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}