class Student {
    int Roll;
    String Name;
    static String Department = "CSE";
    Student(int r, String n) {
        Roll=r;
        Name=n;
    }
    void display() {
        System.out.println(Roll+" "+Name+" "+Department);
    }
}

public class CSE310_BasicsOfJava2 {
    public static void main(String[] args) {
        Student S1 = new Student(1, "Tony Stark");
        S1.display();
        Student S2 = new Student(2, "Clint Barton");
        S2.display();
        Student S3 = new Student(3, "Bucky Barnes");
        S3.display();
        Student S4 = new Student(4, "Thor Odinson");
        S4.display();
        Student S5 = new Student(5, "Loki");
        S5.display();
        Student S6 = new Student(6, "Natasha Romanoff");
        S6.display();
        Student S7 = new Student(7, "Bruce Banner");
        S7.display();
    }
}