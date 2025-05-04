/*
Every class extends the Object class by default.
*/

class Aadhaar {   // --> class Aadhaar extends Object {...code...} --> (same thing)
    int AadhaarNumber;
    Aadhaar(int AadhaarNumber) {this.AadhaarNumber = AadhaarNumber;}
    @Override
    public String toString() {
        // return Integer.toString(AadhaarNumber);
        return "Aadhaar Number: "+ AadhaarNumber;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null || this.getClass()!=obj.getClass()) return false;
        Aadhaar a = (Aadhaar) obj;
        return AadhaarNumber == a.AadhaarNumber;
    }
}

public class CSE310_ObjectClass {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Aadhaar person1 = new Aadhaar(123643739);
        Aadhaar person2 = new Aadhaar(127549739);
        String s = "378276593";
        System.out.println(person1);
        System.out.println(person1.toString());
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(null));
        System.out.println(person1.equals(s));
    }
}