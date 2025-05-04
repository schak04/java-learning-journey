import java.util.*;

public class Practice {
    // static void multiplicationTable(int n) {
    //     for (int i=1; i<=10; i++) {
    //         System.out.println(n + " x " + i + " = " + n*i);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int a = sc.nextInt();
    //     sc.close();        
    //     multiplicationTable(a);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}