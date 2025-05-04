/*
If we create a clone of a 1D array in Java, it results in a deep copy.  
This means the actual values are copied.
On the contrary, if we create a clone of a multi-dimensional array, it results in a shallow copy.  
This is because only the references to the inner arrays are copied, not their actual contents.  
*/

public class CSE310_Arrays2 {
//     public static void PrintArray(int arr[][]) {
//         for (int i=0; i<arr.length; i++) {
//             for (int j=0; j<arr[i].length; j++) {
//                 System.out.print(arr[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.println("");
//         }
//     }
    public static void main(String[] args) {
        // PrintArray(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}});
        int a[]={1, 2, 3, 4};
        System.out.println("Array before cloning:");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        int clonea[] = a.clone();
        System.out.println("\nArray after cloning:");
        for (int i=0; i<clonea.length; i++) {
            System.out.print(clonea[i]+" ");
        }
        System.out.println("");
        System.out.println(a==clonea);
        System.out.println(a[0] = clonea[0]);
    }
}