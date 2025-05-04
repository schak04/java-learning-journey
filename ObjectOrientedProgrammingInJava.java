class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class ObjectOrientedProgrammingInJava {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee sapto = new Employee(); // Instantiating a new Employee Object
        Employee solaire = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Sapto
        sapto.id = 12;
        sapto.salary = 34;
        sapto.name = "Sapto";

        // Setting Attributes for Solaire
        solaire.id = 17;
        solaire.salary = 12;
        solaire.name = "Solaire";

        // Printing the Attributes
        sapto.printDetails();
        solaire.printDetails();
        int salary = solaire.getSalary();
        System.out.println(salary);
        // System.out.println(sapto.id);
        // System.out.println(sapto.name);
    }
}


/*
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class ObjectOrientedProgrammingInJava {
    public static void main(String[] args) {
        
        // // Problem 1
        // Employee harry = new Employee();
        // harry.setName("CodeWithHarry");
        // harry.salary = 233;
        // System.out.println(harry.getSalary());
        // System.out.println(harry.getName());

        // // Problem 2
        // CellPhone asus = new CellPhone();
        // asus.callFriend();
        // asus.vibrate();
        // //asus.ring();

        // // Problem 3
        // Square sq = new Square();
        // sq.side = 3;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());

        // // Problem 5
        // Tommy player1 = new Tommy();
        // player1.fire();
        // player1.run();
        // player1.hit();
    }
}
*/