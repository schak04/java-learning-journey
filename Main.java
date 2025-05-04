import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            System.out.println("Integer input");
        }
        else {
            System.out.println("No Integer input");
        }
        sc.close();
    }
}