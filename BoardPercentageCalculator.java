import java.util.Scanner;

public class BoardPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3, s4, s5;
        System.out.println("Enter your marks for the 5 subjects (out of 100):");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();
        int sum = s1+s2+s3+s4+s5;
        float perc = (sum/500.0f)*100;
        System.out.print("Percentage: ");
        System.out.print((int)perc);
        System.out.println("%");
        sc.close();
    }
}
