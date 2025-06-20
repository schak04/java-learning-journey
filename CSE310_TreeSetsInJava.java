/*
Interfaces: Comparable and Comparator
*/

/* Comparable */

// import java.util.TreeSet;

// class Student3 implements Comparable<Student3> {
//     int rollNo;
//     String name;

//     public Student3(int rollNo, String name) {
//         this.rollNo = rollNo;
//         this.name = name;
//     }

//     @Override
//     public int compareTo(Student3 s) {
//         return this.rollNo - s.rollNo;
//     }

//     public String toString() {
//         return rollNo + " " + name;
//     }
// }

// public class CSE310_TreeSetsInJava {
    //     public static void main(String[] args) {
        //         TreeSet<Student3> students = new TreeSet<>();
        //         students.add(new Student3(48, "Sapto"));
        //         students.add(new Student3(47, "Aman"));
        //         students.add(new Student3(49, "Rounik"));
        
        //         for (Student3 s : students) {
            //             System.out.println(s);
            //         }
//     }
// }

/* Comparator */

// import java.util.*;

// class Student3 {
//     int rollNo;
//     String name;

//     public Student3(int rollNo, String name) {
//         this.rollNo = rollNo;
//         this.name = name;
//     }

//     public String toString() {
//         return rollNo + " " + name;
//     }
// }

// class NameSort implements Comparator<Student3> {
//     public int compare(Student3 a, Student3 b) {
//         return a.name.compareTo(b.name);
//     }
// }

// public class CSE310_TreeSetsInJava {
//     public static void main(String[] args) {
//         TreeSet<Student3> students = new TreeSet<>(new NameSort());
//         students.add(new Student3(3, "Solaire"));
//         students.add(new Student3(2, "Chosen Undead"));
//         students.add(new Student3(1, "Gwyn"));
//         for (Student3 s : students) {
//             System.out.println(s);
//         }
//     }
// }

