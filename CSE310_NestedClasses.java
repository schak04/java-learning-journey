/*
In Java, nested classes are classes that are declared within another class.
They help in logically grouping related classes, improving encapsulation, and
increasing code readability. There are four types of nested classes:

1. Static Nested Class:
   Declared as static inside the outer class.
   Can access only static members of the outer class.
   Does not require an instance of the outer class to be instantiated.

2. Member Inner Class or Non-static (Inner) Class:
   A normal class inside another class.
   Requires an instance of the outer class to be instantiated.
   Can access both static and non-static members of the outer class.
    
3. Local Inner Class:
   Defined inside a method or block.
   Can access variables of the method only if they are final or effectively final.
    
4. Anonymous Inner Class:
   A class with no name, declared and instantiated in a single expression.
   Used for implementing interfaces or extending classes inline.
    
Note:
   Java doesn’t allow declaring a class directly inside a loop because class definitions
   are part of the compilation stage, while loops execute at runtime.
*/

/* ----------------------------------------------------------- */
// 1. Static Nested Class
/* ----------------------------------------------------------- */

// class MobilePhone {
//     @SuppressWarnings("unused")
//     private String BrandName;

//     static class SimCard {  // --> Static Nested Class
//         private String SimNumber;

//         SimCard(String SimNumber) {
//             this.SimNumber = SimNumber;
//         }

//         static void checkNetwork() {
//             System.out.println("Network is available");
//         }

//         void showSimDetails() {
//             System.out.println("Sim Number: " + SimNumber);
//         }
//     }

//     MobilePhone(String BrandName) {
//         this.BrandName = BrandName;
//     }
// }

// public class CSE310_NestedClasses {
//     public static void main(String[] args) {
//         @SuppressWarnings("unused")
//         MobilePhone myPhone = new MobilePhone("Samsung");

//         // Accessing static method of static nested class
//         MobilePhone.SimCard.checkNetwork();

//         // Creating an instance of the static nested class
//         MobilePhone.SimCard sim1 = new MobilePhone.SimCard("346293092");
//         sim1.showSimDetails();
//     }
// }

/* ----------------------------------------------------------- */
// 2. Non-static (Inner) Class
/* ----------------------------------------------------------- */

// class Adhar {
//     private String Name;
//     private int AdharNumber;

//     class Biometric {  // --> Non-static (Inner) Class
//         private String Fingerprint;
//         private String IrisScan;

//         Biometric(String Fingerprint, String IrisScan) {
//             this.Fingerprint = Fingerprint;
//             this.IrisScan = IrisScan;
//         }

//         void BiometricDisplay() {
//             System.out.println("Fingerprint: " + Fingerprint + ", Iris Scan: " + IrisScan);
//         }
//     }

//     Adhar(String Name, int AdharNumber) {
//         this.Name = Name;
//         this.AdharNumber = AdharNumber;
//     }

//     void AdharDisplay() {
//         System.out.println("Name: " + Name + ", Adhar Number: " + AdharNumber);
//     }
// }

// public class CSE310_NestedClasses {
//     public static void main(String[] args) {
//         Adhar person = new Adhar("Prabh", 1234567890);
//         Adhar.Biometric record = person.new Biometric("Right Hand", "Black Eyes");

//         person.AdharDisplay();
//         record.BiometricDisplay();
//     }
// }

/* ----------------------------------------------------------- */
/* 3. Local Inner Class */
/* ----------------------------------------------------------- */ 

// class PizzaOrder {
//     private String customerName;

//     PizzaOrder(String customerName) {
//         this.customerName = customerName;
//     }

//     void orderPizza(int price) {
//         // Local Inner Class inside a method
//         class DiscountCoupon {  // --> Local Inner Class
//             int applyDiscount() {
//                 return price - 50;
//             }
//         }

//         DiscountCoupon coupon = new DiscountCoupon();
//         int finalPrice = coupon.applyDiscount();
//         System.out.println(customerName + " Final price: ₹" + finalPrice);
//     }
// }

// public class CSE310_NestedClasses {
//     public static void main(String[] args) {
//         PizzaOrder order = new PizzaOrder("Sapto");
//         order.orderPizza(300);
//     }
// }

/* ----------------------------------------------------------- */ 
/* 4. Anonymous Inner Class */
/* ----------------------------------------------------------- */ 

// abstract class Shape {
//     abstract void draw();
// }

// public class CSE310_NestedClasses {
//     public static void main(String[] args) {
//         // Anonymous Inner Class that extends Shape class
//         Shape circle = new Shape() {
//             void draw() {
//                 System.out.println("Drawing a Circle");
//             }
//         };
//         circle.draw();

//         // Anonymous Inner Class that implements Runnable interface
//         Runnable task = new Runnable() {
//             @Override
//             public void run() {
//                 System.out.println("Running in a new thread");
//             }
//         };
//         new Thread(task).start();
//     }
// }

class AnonymousExample {
    interface HelloWorld {
        void greet();
    }
    class English implements HelloWorld {
        public void greet() {
            System.out.println("Hello World");
        }
    }
    HelloWorld shabd = new HelloWorld() {
        public void greet() {
            System.out.println("Namaste Duniya");
        }
    };
}

public class CSE310_NestedClasses {
    public static void main(String[] args) {
        AnonymousExample obj = new AnonymousExample();
        AnonymousExample.English word = obj.new English();
        word.greet();
        obj.shabd.greet();
    }
}

/* ----------------------------------------------------------- */ 
/* 5. Inner Class Inside Loop (Concept Demonstration) */ 
/* ----------------------------------------------------------- */ 

// class Company {
//     String founder;
//     double netWorth;

//     Company(String founder, double netWorth) {
//         this.founder = founder;
//         this.netWorth = netWorth;
//     }

//     class Department {  // --> Inner Class
//         String departmentName;
//         int employeeCount;

//         Department(String departmentName, int employeeCount) {
//             this.departmentName = departmentName;
//             this.employeeCount = employeeCount;
//         }

//         void displayDepartment() {
//             System.out.println("Name of the department: " + departmentName);
//             System.out.println("Number of employees in " + departmentName + ": " + employeeCount);
//         }
//     }

//     void createDepartments() {
//         for (int i = 1; i <= 5; i++) {
//             Department dep = new Department("Department " + i, i * 100);
//             System.out.println("Details of " + dep.departmentName + ":");
//             dep.displayDepartment();
//         }
//     }
// }

// public class CSE310_NestedClasses {
//     public static void main(String[] args) {
//         Company myCompany = new Company("XYZ", 98797006700.00);
//         myCompany.createDepartments();
//     }
// }