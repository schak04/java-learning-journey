/*
Initializer Blocks in Java

1. Instance Initializer Block:
- Runs every time an object of the class is created.
- Runs *after* field initializations and *before* the constructor.
- Useful for common code shared across all constructors.

Syntax:
{
    // instance initialization code
}

2. Static Initializer Block:
- Runs only once when the class is first loaded.
- Used to initialize static variables or run setup code.
- Runs before main() or any static method/constructor is called.

Syntax:
static {
    // static initialization code
}

Why use Initializer Blocks?
- To reduce code duplication across multiple constructors.
- For initializing static data or loading configurations.
*/

class InitializerBlockExample {
    static int staticCount;
    int instanceValue;

    // Static initializer block
    static {
        System.out.println("Static block executed (runs once, when the class is loaded)");
        staticCount = 100; // Initialize static variable
    }

    // Instance initializer block
    {
        System.out.println("Instance block executed (runs every time an object is created)");
        instanceValue = 42; // Initialize instance variable
    }

    // Constructor
    public InitializerBlockExample() {
        System.out.println("Constructor executed. instanceValue = " + instanceValue);
    }
    public InitializerBlockExample(int i) {
        instanceValue = i;
        System.out.println("Constructor executed. instanceValue = " + instanceValue);
    }
}

public class InitializerBlocksInJava {  
@SuppressWarnings("unused")
public static void main(String[] args) {
    InitializerBlockExample obj1 = new InitializerBlockExample(69);
    System.out.println("Creating object obj1");
    
    InitializerBlockExample obj2 = new InitializerBlockExample();
    System.out.println("Creating object obj2");

    // Create a third object to see repeated execution of instance initializer block
    InitializerBlockExample obj3 = new InitializerBlockExample(96);
    System.out.println("Creating object obj3");
}
}