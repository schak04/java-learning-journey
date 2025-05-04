/*
Functional Interfaces in Java:
A functional interface is an interface that contains only one abstract method.
However, it can have multiple default or static methods.
Functional interfaces enable Lambda Expressions and Method References.
Key Points:
- Functional interfaces have a single functionality to exhibit.
- Can be annotated with @FunctionalInterface.
- Common built-in functional interfaces include:
1. Consumer<T>
   - Accepts an input and performs an operation but does not return any result.
   - Method: accept(T t)
2. Supplier<T>
   - Takes no input and returns a result of type T.
   - Method: get()
3. Function<T, R>
   - Takes an input of type T and returns a result of type R.
   - Method: apply(T t)
4. Predicate<T>
   - Takes an input and returns a boolean value.
   - Method: test(T t)
*/

/* ------------------------------------------------------------------------------------------------------------- */

// interface Consumer {
//     void convert(String str, String b);
// }

// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         Consumer example = (str,b)->System.out.println(str.toUpperCase()+"\n"+b.toLowerCase());
//         example.convert("hello","HelLO");
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.util.function.Consumer;

// public class CSE310_FunctionalInterfaces{
//     public static void main(String[] args) {
//         Consumer<String> example = (str)->System.out.println(str.toUpperCase());
//         example.accept("hello");
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// interface Supplier {
//     double convert();
// }
// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         Supplier example = ()->Math.random();
//         System.out.println(example.convert());
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.util.function.Supplier;

// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         Supplier<Double> example = ()->Math.random();
//         System.out.println(example.get());
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// interface Function {
//     int square(int num);
// }
// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         Function example = (num)->num*num;
//         System.out.println(example.square(5));
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.util.function.Function;

// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         Function<Integer, Integer> example = (num)->num*num;
//         System.out.println(example.apply(5));
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.util.function.Predicate;

// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         Predicate<Integer> example = (num)->num%2==0;
//         System.out.println(example.test(4));
//         System.out.println(example.test(7));
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

/* Additional Functional Interfaces */ 

/*
5. BiConsumer<T, U>
   - Accepts two inputs and performs an operation without returning any result.
   - Method: accept(T t, U u)
*/

// import java.util.function.BiConsumer;

// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         BiConsumer<String, String> example = (a, b) -> System.out.println(a + " " + b);
//         example.accept("Hello", "World");
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

/*
6. BiFunction<T, U, R>
   - Takes two arguments and produces a result.
   - Method: apply(T t, U u)
*/

// import java.util.function.BiFunction;

// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         BiFunction<Integer, Integer, Integer> example = (a, b) -> a + b;
//         System.out.println(example.apply(5, 3));
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

/*
7. UnaryOperator<T>
   - A specialization of Function<T, T> that takes one argument and returns a result of the same type.
   - Method: apply(T t)
*/

// import java.util.function.UnaryOperator;

// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         UnaryOperator<Integer> example = (num) -> num * num;
//         System.out.println(example.apply(6));
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

/*
8. BinaryOperator<T>
   - A specialization of BiFunction<T, T, T> that takes two arguments and returns a result of the same type.
   - Method: apply(T t1, T t2)
*/

// import java.util.function.BinaryOperator;

// public class CSE310_FunctionalInterfaces {
//     public static void main(String[] args) {
//         BinaryOperator<Integer> example = (a, b) -> a * b;
//         System.out.println(example.apply(4, 5));
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */