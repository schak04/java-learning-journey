/*
- Java does not support multiple inheritance with classes (to avoid the "Diamond Problem").
- However, Java supports multiple inheritance through interfaces because interfaces do not contain implementation, only method signatures.
- This ensures code reusability and flexibility while avoiding the complexity of multiple class inheritance.
*/

/*
- Below we have an example of multiple inheritance using interfaces because Java allows a class to implement multiple interfaces:
*/

class OS {
    void bootSystem() {
        System.out.println("Booting operating system...");
    }
}

interface CodeEditor {
    void installEditor();
}

interface Compiler {
    void installCompiler();
}

class DevSetup extends OS implements CodeEditor, Compiler {
    @Override
    public void installEditor() {
        System.out.println("Installing VS Code...");
    }

    @Override
    public void installCompiler() {
        System.out.println("Installing JDK and build tools...");
    }

    @Override
    public void bootSystem() {
        System.out.println("Starting developer workstation setup...");
        super.bootSystem();
        installEditor();
        installCompiler();
        System.out.println("Cloning starter project from GitHub...");
        System.out.println("Running 'Hello, World!' program...");
        System.out.println("Setup complete. You're ready to code!");
    }
}

public class DevEnvironmentSetup {
    public static void main(String[] args) {
        DevSetup setup = new DevSetup();
        setup.bootSystem();
    }
}
