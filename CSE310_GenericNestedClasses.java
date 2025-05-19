public class CSE310_GenericNestedClasses<T> {
    T outerValue;

    public CSE310_GenericNestedClasses(T outerValue) {
        this.outerValue = outerValue;
    }

    // Nested non-static generic class
    class InnerGenericClass<U> {
        U innerValue;

        public InnerGenericClass(U innerValue) {
            this.innerValue = innerValue;
        }

        public void display() {
            System.out.println("Outer value (T): " + outerValue);
            System.out.println("Inner value (U): " + innerValue);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Create an instance of the outer class
        CSE310_GenericNestedClasses<String> outer = new CSE310_GenericNestedClasses<>("Hello from Outer!");

        // Create an instance of the inner class using the outer instance
        CSE310_GenericNestedClasses<String>.InnerGenericClass<Integer> inner =
            outer.new InnerGenericClass<>(2025);

        // Display values
        inner.display();
    }
}
