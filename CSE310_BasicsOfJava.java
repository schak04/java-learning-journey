import java.util.Scanner;

public class CSE310_BasicsOfJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Conversions
        int i = 83;
        char c = (char) i;
        System.out.println("int to char: " + c);

        char c1 = 'S';
        int i1 = c1;
        System.out.println("char to int: " + i1);

        // Input
        System.out.print("Enter your first name: ");
        String fName = sc.next();

        // Clear the newline character from the input buffer
        sc.nextLine(); 

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter your roll no.: ");
        int rollNo = sc.nextInt();

        // Validate first name length
        if (fName.length() == 0 || fName.length() > 8) {
            System.out.print("Enter a nickname for yourself: ");
            fName = sc.next();
        }

        // Output
        System.out.println(fName + "'s full name is " + fullName);
        System.out.println(fName + "'s roll no. is " + rollNo);

        sc.close();
    }
}
