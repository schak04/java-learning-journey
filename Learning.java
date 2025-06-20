/*
Naming conventions:
For classes -> PascalConvention
For functions -> camelCaseConvention
*/ 

import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {
        // System.out.print("Learning Java\n"); // 'print' simply prints without \n -> doesn't move to the next line after printing
        System.out.println("Learning Java");  // 'println' ends with \n -> changes the line after printing
        // int n1 = 6;
        // int n2 = 4;
        // int n3 = 10;
        // int sum = n1+n2+n3;
        // System.out.println(sum); // sout -> shortcut for -> System.out.println()
        
        // Taking user input
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name + ".");
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();
        System.out.println("Your age is " + age + ".");
        sc.close();
        */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Your name is " + name + ".");
            System.out.print("Enter your age: ");
            byte age = sc.nextByte();
            System.out.println("Your age is " + age + ".");
        }
        /* The try (Scanner sc = new Scanner(System.in)) syntax ensures
        that the Scanner resource is closed automatically when the try block exits,
        even if an exception occurs. */ 

        // checking for int (or anything)
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter a value: ");
        // /*
        // boolean intOrNot = s.hasNextInt();
        // System.out.println(intOrNot);
        // */
        // System.out.println(s.hasNextInt());
        // s.close();
    }
}