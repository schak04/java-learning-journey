/*
1. Exception: 
   - An event that occurs during the execution of a program that disrupts the normal flow of instructions.
   - Examples: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

2. Error:
   - A serious problem that a reasonable application should not try to catch.
   - These typically represent problems that are outside the control of the application, like JVM crashes.
   - Example: `OutOfMemoryError`, `StackOverflowError`.

3. Exception Handling:
   - A mechanism to handle runtime errors, allowing the program to continue its normal flow instead of crashing.
   - Using `try-catch` blocks allows graceful recovery from errors.

4. try-catch block:
   - A block of code that attempts to execute a piece of code and catches any exceptions that may occur.
   - Syntax:
     ```java
     try {
         // risky code that might throw an exception
     } catch (ExceptionType e) {
         // code to handle the exception
     }
     ```

5. finally block:
   - A block of code that executes after the try-catch block, regardless of whether an exception was thrown or not.
   - Often used for cleanup (like closing files, releasing resources).
   - Even if an exception is thrown or caught, the `finally` block will always run.
   - Example:
     ```java
     try {
         // risky code
     } catch (Exception e) {
         // exception handling
     } finally {
         // cleanup code (e.g., close file, release resources)
     }
     ```

6. throw:
   - Used to explicitly throw an exception from within the program.
   - Syntax:
     ```java
     throw new ExceptionType("Error message");
     ```
   - Example:
     ```java
     if (age < 0) {
         throw new IllegalArgumentException("Age cannot be negative");
     }
     ```

7. throws:
   - Used in method signatures to declare that a method may throw an exception.
   - It allows a method to propagate the exception to the calling method instead of handling it.
   - Syntax:
     ```java
     public void myMethod() throws IOException {
         // risky code
     }
     ```
   - It’s typically used with **checked exceptions** like `IOException`, `SQLException`.

8. Custom Exception:
   - A user-defined exception that extends the `Exception` class (or `RuntimeException` for unchecked exceptions).
   - Allows you to create exceptions specific to your application.
   - Example:
     ```java
     class NegativeAgeException extends Exception {
         public NegativeAgeException(String message) {
             super(message);
         }
     }
     ```

9. **printStackTrace():**
   - A method from the `Throwable` class (which `Exception` and `Error` both extend).
   - Prints the stack trace of an exception to the console, which shows:
     - The type of exception
     - The exact line where it occurred
     - The sequence of method calls leading to the exception (stack trace)
   - Helps in debugging by providing clear information on the origin of the exception.
   - Example:
     ```java
     try {
         int result = 10 / 0;
     } catch (ArithmeticException e) {
         e.printStackTrace();
     }
     ```

---

## **Additional Concepts**

### Exception Hierarchy in Java:
   - `Throwable` is the superclass of all errors and exceptions.
     - **Error**: Usually fatal issues that cannot be recovered from (e.g., `OutOfMemoryError`).
     - **Exception**: Issues that a program can handle or recover from.
       - **Checked Exceptions**: These must be either caught or declared in the method signature (e.g., `IOException`, `SQLException`).
       - **Unchecked Exceptions**: These are runtime exceptions that are not required to be caught or declared (e.g., `NullPointerException`, `ArrayIndexOutOfBoundsException`).

### **Try-with-resources** (Java 7+):
   - Used to automatically close resources (like files or database connections) when they are no longer needed, avoiding the need to explicitly call `finally`.
   - Resources that implement `AutoCloseable` can be used.
   - Example:
     ```java
     try (FileReader fr = new FileReader("file.txt")) {
         // file handling code
     } catch (IOException e) {
         e.printStackTrace();
     }
     ```
   - Here, `FileReader` will be automatically closed after the try block, even if an exception occurs.

### **Exception Propagation:**
   - Exceptions propagate through the call stack until they are caught or the program terminates.
   - If a method throws an exception, it can either handle it with a `try-catch` block, propagate it using `throws`, or the caller can handle it.
   - Example:
     ```java
     public void method1() throws IOException {
         method2(); // Propagate exception
     }

     public void method2() throws IOException {
         throw new IOException("An I/O error occurred");
     }
     ```

---

## **Assertions in Java**

1. **Assertions:**
   - Assertions are used to check if a **condition is true** in your code, mainly for debugging purposes. They are not intended for handling runtime errors.
   - Assertions are typically used to ensure your assumptions are correct during development.
   - By default, assertions are **disabled** at runtime. You can enable them using the `-ea` flag while running your Java program.

2. **Syntax:**
   - Basic assertion:
     ```java
     assert condition;
     ```
   - Assertion with a custom message:
     ```java
     assert condition : "Error message";
     ```
   - Example:
     ```java
     public void setAge(int age) {
         assert age > 0 : "Age must be positive";
         this.age = age;
     }
     ```

3. **When to Use Assertions:**
   - Used to test **invariants** (conditions that should always be true in your code).
   - Good for catching logic bugs, incorrect assumptions, or preconditions in your code.
   - Example: You can assert that a number is always positive:
     ```java
     assert num > 0 : "Number must be positive";
     ```

4. **Enabling Assertions:**
   - By default, assertions are **disabled** in Java. To enable them, you must use the JVM argument `-ea` (enable assertions) when running the program:
     ```sh
     java -ea MyClass
     ```

5. **Disabling Assertions:**
   - You can disable assertions with the `-da` option:
     ```sh
     java -da MyClass
     ```

6. **Assertion Failures:**
   - If the condition in the assertion is false, an `AssertionError` is thrown.
   - Example of assertion failure:
     ```java
     assert num > 0 : "Number should be positive"; // if num <= 0, AssertionError is thrown
     ```

7. **Important Notes:**
   - **Assertions** are primarily used in development and debugging, not in production environments.
   - They should not be used for handling runtime errors like `IOException` or `NullPointerException`.
*/


// public class CSE310_ExceptionHandling {
//     public static void main(String[] args) {
//         try {
//             int c=10, d=0, e;
//             e=c/d;
//             int a[] = new int[-5];
//             a[6] = e;
//             System.out.println(a[6]);
//         }
//         catch(Exception e) {
//             System.out.println("Exception: "+e);
//         }
//         finally {
//             System.out.println("No matter whether there is an exception or not, I'll always be executed.");
//         }
//     }
// }

// public class CSE310_ExceptionHandling {
//     public static void main(String[] args) {
//         try {
//             try {
//                 int a[] = {10, 20, 30};
//                 System.out.println(a[5]);
//             }
//             catch(Exception e) {
//                 System.out.println(e);
//             }
//             System.out.println(10/0);
//         }
//         catch(ArithmeticException e) {
//             System.out.println(e);
//         }
//         System.out.println("Hello");
//     }
// }

// public class CSE310_ExceptionHandling {
//     public static void main(String[] args) {
//         try {
//             System.out.println(10/0);
//         }
//         catch(Exception e) {
//             try {
//                 String s = null;
//                 System.out.println(s.length());
//             }
//             catch(NullPointerException npe) {
//                 System.out.println("Can't find null value");
//             }
//         }
//         System.out.println("Bye bye main");
//     }
// }

// public class CSE310_ExceptionHandling {
//     public static void main(String[] args) {
//         try {
//             System.out.println("NT, start studying NOW!!!");
//             int a=10, b=0, c;
//             c=a/b;
//             System.out.println(c);
//             System.out.println("NT says no");
//         }
//         // catch(Exception e) {
//         //     int x=20, y=0, z;
//         //     z = x/y;
//         //     System.out.println(z);
//         //     System.out.println("Can't divide by zero");
//         // }
//         finally {
//             System.out.println("Final Warning: STUDY!!");
//         }
//         System.out.println("Main method ends here");
//     }
// }

// public class CSE310_ExceptionHandling {
//     static void checkAge(int age) {
//         if (age<18) {
//             // System.out.println("The candidate is underage, so there's no use of doing the paperwork.");
//             throw new ArithmeticException("The candidate is underage, so there's no use of doing the paperwork.");
//         }
//     }
//     public static void main(String[] args) {
//         checkAge(15);
//         System.out.println("Who cares?! We'll still do the paperwork");
//     }
// }

// public class CSE310_ExceptionHandling {
//     static void divide(int a, int b) throws ArithmeticException {
//         if (b == 0) {
//             throw new ArithmeticException("Can't perform division");
//         }
//         System.out.println("Result: " + (a / b));
//     }

//     public static void main(String[] args) {
//         try {
//             divide(10, 0); // This will trigger the exception
//         } catch (ArithmeticException e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         }

//         System.out.println("Program continues...");
//     }
// }

public class CSE310_ExceptionHandling {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            int x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            e.printStackTrace();  // Prints error details
        }
    }
}
