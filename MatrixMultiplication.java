import java.util.*;

public class MatrixMultiplication {
    public static void inputMatrix(int matrix[][], int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    
    public static void multiplyMatrices(int A[][], int B[][], int C[][], int r1, int c1, int r2, int c2) {
        for (int i = 0; i < r1; ++i) {
            for (int j = 0; j < c2; ++j) {
                C[i][j] = 0;
                for (int k = 0; k < c1 /* c1 or r2 -> same thing */; ++k) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }
    
    public static void displayMatrix(int matrix[][], int rows, int cols) {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[10][10];
        int B[][] = new int[10][10];
        int C[][] = new int[10][10];
        int r1, c1, r2, c2;
    
        System.out.print("Enter rows and columns of first matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.print("Enter rows and columns of second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible.");
        }

        System.out.println("Enter elements of first matrix:");
        inputMatrix(A, r1, c1);
        System.out.println("Enter elements of second matrix:");
        inputMatrix(B, r2, c2);
        
        multiplyMatrices(A, B, C, r1, c1, r2, c2);
        
        System.out.println("Resultant matrix:");
        displayMatrix(C, r1, c2);
    
        sc.close();
    }
}
