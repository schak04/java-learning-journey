import java.util.Scanner;

public class RecursionInJava {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)

    // static int factorial(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     else{
    //         return n * factorial(n-1);
    //     }
    // }
    // static int factorial_iterative(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     else{
    //         int product = 1;
    //         for (int i=1;i<=n;i++){ // 1 to n
    //             product *= i;
    //         }
    //         return product;
    //     }
    // }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // int x = 0;
        // System.out.println("The value of factorial x is: " + factorial(x));
        // System.out.println("The value of factorial x is: " + factorial_iterative(x));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci series upto " + number + " terms: ");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
