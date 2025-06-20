public class VariableArgumentsInJava {
    static int add(int ...arr){
        int result = 0;
        for (int a : arr){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args){
    System.out.println(add(1));
    System.out.println(add(2,3));
    System.out.println(add(3,4,5));
    System.out.println(add(4,5,6,7));
    System.out.println(add(5,6,7,8,9));
    System.out.println(add(6,7,8,9,10,11));
    System.out.println(add(7,8,9,10,11,12,13));
    System.out.println(add(8,9,10,11,12,13,14,15));
    System.out.println(add(9,10,11,12,13,14,15,16,17));
    System.out.println(add(10,11,12,13,14,15,16,17,18,19));
    System.out.println(add(11,12,13,14,15,16,17,18,19,20,21));
    System.out.println(add(12,13,14,15,16,17,18,19,20,21,22,23));
    System.out.println(add(13,14,15,16,17,18,19,20,21,22,23,24,25));
    }    
}
