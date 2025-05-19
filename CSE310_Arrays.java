/* HW: Why do we need jagged arrays? */

import java.util.*;

public class CSE310_Arrays {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int a[][] = new int[3][];
        // a[0] = new int[2];
        // a[1] = new int[4];
        // a[2] = new int[3];
        // System.out.print("Enter the elements of your jagged matrix: ");
        // for (int i=0; i<a.length; i++) {
        //     for (int j=0; j<a[i].length; j++) {
        //         a[i][j] = input.nextInt();
        //     }
        // }
        // System.out.println("Here's your jagged matrix: ");
        // for (int i=0; i<a.length; i++) {
        //     for (int j=0; j<a[i].length; j++) {
        //         System.out.print(a[i][j]+"  ");
        //     }
        //     System.out.println();
        // }
        // input.close();

        int a[] = {2, 7, 5, 6};
        System.out.println(Arrays.toString(a));
        int b[][] = {{1, 4, 7, 8},{3, 6, 7, 8}};
        System.out.println(Arrays.deepToString(b));

        String copyfrom[]={"Hello","protein shake","is","here","Sapto"};
        String copyto[]=new String[5];
        System.arraycopy(copyfrom, 1, copyto, 0, 4);
        for(int i=0;i<copyto.length-1;i++){
            System.out.println(copyto[i]);
        }
        System.out.println(copyfrom[1]==copyto[2]);
        
    }
}