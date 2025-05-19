/*
What are Object Stream Classes?
  Object streams are part of the java.io package and allow you to:
  - Write an entire object to a file
  - Read that object back, exactly as it was
  Think of it as saving and loading a game character — not just the stats (ints, floats),
  but the whole object with all its fields.

Serialization:
  This is the process of converting a Java object into a byte stream,
  so that it can be:
  - saved to a file,
  - sent over a network, and
  - stored in a database.
  ObjectOutputStream --> Used to write (serialize) objects

Deserialization:
  This is the process of converting a byte stream back into a Java object.
  It recreates the original object with a saved state.
  ObjectInputStream --> Used to read (deserialize) objects

TL;DR: Save an object --> Load it back later = easy!

How to Use:
Your class must implement Serializable
Serializable is a marker interface — it tells Java: "This class can be written to a file".

Important Notes:
  - You must implement Serializable, or Java will throw a NotSerializableException.
  - If you change your class after saving the object (like adding/removing fields), reading it back might fail.
  - Only non-transient and non-static fields are serialized.
    - Use transient to mark any field that should not be saved.
        transient String password; // -> will not be saved
    - static fields are inherently 'transient'.
  - If a class contains a reference to another object, that object must also be serializable.
*/

/* Writing the object to a file */

// import java.io.*;
// import java.io.Serializable;

// class Player implements Serializable {
//     String name;
//     int score;
    
//     Player(String name, int score) {
//         this.name = name;
//         this.score = score;
//     }
// }

// public class CSE310_ObjectStreams {
//     public static void main(String[] args) throws IOException {
//         Player p = new Player("Sapto", 9000);

//         ObjectOutputStream out = new ObjectOutputStream(
//             new FileOutputStream("player.dat")
//         );

//         out.writeObject(p); // save entire object!
//         out.close();
//     }
// }

/* Reading the object back  */

// import java.io.*;
// import java.io.Serializable;

// class Player implements Serializable {
//     String name;
//     int score;
    
//     Player(String name, int score) {
//         this.name = name;
//         this.score = score;
//     }
// }

// public class CSE310_ObjectStreams {
//     public static void main(String[] args) throws IOException, ClassNotFoundException {
//         ObjectInputStream in = new ObjectInputStream(
//             new FileInputStream("player.dat")
//         );

//         Player p = (Player) in.readObject(); // load the object
//         System.out.println("Name: " + p.name + ", Score: " + p.score);
//         in.close();
//     }
// }


/* More Examples */

/* 1 */

// import java.io.*;

// class Student1 implements Serializable {
//     int roll;
//     String name;
//     double marks;

//     public Student1(int roll, String name, double marks) {
//         this.roll = roll;
//         this.name = name;
//         this.marks = marks;
//     }

//     void display() {
//         System.out.println("Roll: "+roll+", Name: "+name+", Marks: "+marks);
//     }
// }

// public class CSE310_ObjectStreams {
//     public static void main(String[] args) throws Exception {
//         Student1 s1 = new Student1(101, "Sapto", 90.5);

//         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentData.txt"));
//         oos.writeObject(s1);
//         oos.close();
//         System.out.println("Student object saved");

//         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentData.txt"));
//         Student1 s2 = (Student1) ois.readObject();
//         ois.close();

//         System.out.println("Student object read from file: ");
//         s2.display();
//     }
// }

/* 2 */

// import java.io.*;

// class Student2 implements Serializable {
//     private static final long serialVersionUID = 1L;

//     String name;
//     int age;
//     transient String password;
//     static String college = "LPU";

//     public Student2(String name, int age, String password) {
//         this.name = name;
//         this.age = age;
//         this.password = password;
//     }

//     void display() {
//         System.out.println("Name: "+name);
//         System.out.println("Age: "+age);
//         System.out.println("Password (transient): "+password);
//         System.out.println("College (static): "+college);
//     }
// }

// public class CSE310_ObjectStreams {
//     public static void main(String[] args) throws Exception {
//         Student2 s1 = new Student2("Sapto", 20, "12345");
//         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
//         oos.writeObject(s1);
//         oos.close();
//         Student2.college = "Changed University";
//         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
//         Student2 deserialized = (Student2) ois.readObject();
//         ois.close();
//         System.out.println("After Deserialization: ");
//         deserialized.display();
//     }
// }