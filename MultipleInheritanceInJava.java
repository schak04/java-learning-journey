/*
- Java does not support multiple inheritance with classes (to avoid the "Diamond Problem").
- However, Java supports multiple inheritance through interfaces because interfaces do not contain implementation, only method signatures.
- This ensures code reusability and flexibility while avoiding the complexity of multiple class inheritance.
*/

/*
- Below we have an example of multiple inheritance using interfaces because Java allows a class to implement multiple interfaces.
- MyRecipe implements Maa and Maasi, meaning it must provide implementations for the addSpices() and addPaneer() methods.
*/

class Nani {
    void aalooKaParantha() {
        System.out.println("The secret recipe of Paranthe is...");
    }
}

interface Maa {
    void addSpices();
}
interface Maasi {
    void addPaneer();
}

class MyRecipe extends Nani implements Maa, Maasi {
    @Override
    public void addSpices() {
        System.out.println("Add fennel seeds");
    }
    @Override
    public void addPaneer() {
        System.out.println("Add grated paneer");
    }
    @Override
    public void aalooKaParantha() {
        System.out.println("Let's start with nani's secret recipe");
        super.aalooKaParantha();
        addSpices();
        addPaneer();
        System.out.println("Add dried fenugreek leaves");
        System.out.println("Add butter");
        System.out.println("Serve with boondi ki raita, lassi, achaar and chutney");
    }
}

public class MultipleInheritanceInJava {
    public static void main(String[] args) {
        MyRecipe Paranthe = new MyRecipe();
        Paranthe.aalooKaParantha();
    }
}
