public class Loops {
    public static void main(String[] args) {

        /* while loops */
        
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        
        System.out.println("Using Loops:");
        int i = 100;
        while(i<=200){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop!");
        
        // while(true){
            // System.out.println("I am an infinite while loop!");
            // }
            

        /* do-while loops */
        
        // int a = 0;
        // while(a<5){
            //     System.out.println(a);
            //     a++;
            // }
            int b = 10;
            do {
                System.out.println(b);
                b++;
            }while(b<5);
            
            int c = 1;
            do{
                System.out.println(c);
                c++;
            }while(c<=45);
        
            
        /* for loops */
        
        // for (int i=1; i<=10; i++){
        //     System.out.println(i);
        // }
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        // int n = 3;
        // for (int i =0; i<n; i++){
        //     System.out.println(2*i+1);
        // }

        // for(int i=5; i!=0; i--){
        //     System.out.println(i);
        // }

    }
}