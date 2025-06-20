/*
StringBuilder and StringBuffer in Java
--------------------------------------
- Both are mutable classes used to manipulate strings efficiently.
- StringBuilder is faster but not thread-safe, making it ideal for single-threaded applications.
- StringBuffer is thread-safe and synchronized, making it suitable for multi-threaded applications.
- Both classes provide similar methods like append(), insert(), replace(), delete(), and reverse().
- The capacity of these objects can be managed dynamically using capacity() and ensureCapacity().
- Both can be converted to a String using the toString() method.
*/

public class StringBuilderAndBufferClassesInJava {
    public static void main(String[] args) {
        /* StringBuilder */

        // Demonstrating StringBuilder
        System.out.println("--- StringBuilder Demonstration ---");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial String: " + sb);

        // Append method - adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert method - inserts at specified index
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace method - replaces a part of the string
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb);

        // Delete method - removes characters from index 6 to 12
        sb.delete(6, 12);
        System.out.println("After delete: " + sb);

        // Reverse method - reverses the string
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse(); // Reverting back for further operations

        // Capacity method - returns the current capacity of StringBuilder
        System.out.println("Current capacity: " + sb.capacity());

        // Ensuring capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // Convert StringBuilder to String
        String sbString = sb.toString();
        System.out.println("Converted to String: " + sbString);

        /* StringBuffer */

        // Demonstrating StringBuffer (Similar to StringBuilder but Thread-Safe)
        System.out.println("\n--- StringBuffer Demonstration ---");
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println("Initial StringBuffer: " + sbf);

        // Append
        sbf.append(" Programming");
        System.out.println("After append: " + sbf);

        // Insert
        sbf.insert(5, "Language ");
        System.out.println("After insert: " + sbf);

        // Replace
        sbf.replace(5, 13, "Script");
        System.out.println("After replace: " + sbf);

        // Delete
        sbf.delete(5, 12);
        System.out.println("After delete: " + sbf);

        // Reverse
        sbf.reverse();
        System.out.println("After reverse: " + sbf);
        sbf.reverse();

        // Capacity
        System.out.println("Current capacity: " + sbf.capacity());
        sbf.ensureCapacity(40);
        System.out.println("Capacity after ensureCapacity(40): " + sbf.capacity());

        // Convert StringBuffer to String
        String sbfString = sbf.toString();
        System.out.println("Converted to String: " + sbfString);
    }
}