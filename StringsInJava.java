import java.util.Scanner;

public class StringsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking string input from the user
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        System.out.println("You entered: " + inputString);

        // Demonstrating various String methods
        System.out.println("Character at index 2: " + inputString.charAt(2)); // Returns character at index 2
        System.out.println("Substring from index 2 to 5: " + inputString.substring(2, 5)); // Extracts substring from index 2 to 5 (exclusive)
        System.out.println("String in uppercase: " + inputString.toUpperCase()); // Converts string to uppercase
        System.out.println("String in lowercase: " + inputString.toLowerCase()); // Converts string to lowercase
        System.out.println("String length: " + inputString.length()); // Returns the length of the string
        System.out.println("String with 'a' replaced by 'o': " + inputString.replace('a', 'o')); // Replaces all occurrences of 'a' with 'o'
        System.out.println("Does the string start with 'Sa'? " + inputString.startsWith("Sa")); // Checks if the string starts with 'Sa'
        System.out.println("Does the string end with 'to'? " + inputString.endsWith("to")); // Checks if the string ends with 'to'
        System.out.println("Index of 'a': " + inputString.indexOf('a')); // Finds first occurrence index of 'a'
        System.out.println("Last index of 'a': " + inputString.lastIndexOf('a')); // Finds last occurrence index of 'a'
        System.out.println("Trimmed string: " + inputString.trim()); // Removes leading and trailing spaces
        System.out.println("Does the string equal 'Sapto'? " + inputString.equals("Sapto")); // Checks exact string equality
        System.out.println("Does the string equal 'Sapto' (ignore case)? " + inputString.equalsIgnoreCase("Sapto")); // Case-insensitive comparison
        System.out.println("Does the string contain 'Pro'? " + inputString.contains("Pro")); // Checks if substring exists within the string
        System.out.println("Comparing 'Java' with 'java' (case-sensitive): " + "Java".compareTo("java")); // Lexicographically compares two strings
        System.out.println("Comparing 'Java' with 'Java' (case-insensitive): " + "Java".compareToIgnoreCase("java")); // Case-insensitive comparison
        
        // Demonstrating valueOf method
        int number = 123;
        String numberString = String.valueOf(number); // Converts integer to string
        System.out.println("String representation of number: " + numberString);

        boolean bool = true;
        String boolString = String.valueOf(bool); // Converts boolean to string
        System.out.println("String representation of boolean: " + boolString);

        char character = 'A';
        String charString = String.valueOf(character); // Converts char to string
        System.out.println("String representation of char: " + charString);

        // Exploring more String methods
        String sample = "   Java Programming   ";
        System.out.println("Original string: '" + sample + "'");
        System.out.println("Trimmed string: '" + sample.trim() + "'"); // Removes spaces from beginning and end
        System.out.println("Substring from index 5: " + sample.substring(5, 8)); // Extracts substring from index 5 to end
        System.out.println("Replacing 'Java' with 'Python': " + sample.replace("Java", "Python")); // Replaces substring "Java" with "Python"
        System.out.println("Index of 'Programming': " + sample.indexOf("Programming")); // Returns the index of substring "Programming"
        System.out.println("Last index of 'a': " + sample.lastIndexOf('a')); // Finds last occurrence index of 'a'
        System.out.println("String split by space: " + java.util.Arrays.toString(sample.split(" "))); // Splits string by spaces into an array
        System.out.println("String hash code: " + sample.hashCode()); // Returns hash code of the string

        // Escape sequences in Java Strings
        System.out.println("I am an escape sequence example: \n \" <- this is a double quote.");

        sc.close(); // Closing the scanner to avoid resource leaks
    }
}
