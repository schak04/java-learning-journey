public class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        // Relational Operators

        int num1 =1;
        int num2 = 2;
        System.out.println("num1 > num2 is " + (num1 > num2));
        System.out.println("num1 < num2 is " + (num1 < num2));
        System.out.println("num1 >= num2 is " + (num1 >= num2));
        System.out.println("num1 <= num2 is " + (num1 <= num2));
        System.out.println("num1 == num2 is " + (num1 == num2));
        System.out.println("num1 != num2 is " + (num1 != num2));


        // Logical Operators
        
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        // if (a && b){
        //     System.out.println("Y");
        // }
        // else{
        //     System.out.println("N");
        // }

        System.out.println("For Logical OR...");

        // if (a || b){
        //     System.out.println("Y");
        // }
        // else{
        //     System.out.println("N");
        // }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);

    }
}
