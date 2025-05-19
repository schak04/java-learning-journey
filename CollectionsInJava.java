/*
Collections in Java:
- The Collections Framework provides a set of interfaces and classes to store and manipulate groups of data as objects.
- Key interfaces: List, Set, Map, and Queue.
- Implementations include: ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, Deque, etc.

Why use Generics with Collections?
- Enforces type safety at compile time and reduces runtime errors like ClassCastException.
- Eliminates the need for explicit casting.
- Improves code readability, reusability, and maintainability.
- Example: List<String> names = new ArrayList<>();

Interfaces and their Purpose:
- List: Ordered collection with duplicates allowed.
- Set: Unordered collection that does not allow duplicates.
- Map: Key-value pairs, keys are unique.
- Queue/Deque: Used for processing elements in FIFO or LIFO order.

Implementations and Their Descriptions:
- ArrayList: 
  - A resizable array implementation of the `List` interface.
  - Allows duplicate elements and maintains the order of insertion.
  - Provides fast random access, but can be slower in inserting/removing elements from the middle due to shifting.
  - Example: `ArrayList<String> list = new ArrayList<>();`
- TreeSet: 
  - A Set implementation based on a Red-Black tree.
  - It stores elements in sorted order (according to their natural ordering or by a comparator).
  - Does not allow duplicates and ensures that elements are unique.
  - Example: `TreeSet<Integer> treeSet = new TreeSet<>();`
  Comparable in Java:
    - Used for defining the natural ordering of objects.
    - Implementing `compareTo()` allows objects to be sorted automatically (e.g., in collections like ArrayList, TreeSet).
  Comparator in Java:
    - Used to define a custom sorting order for objects.
    - A Comparator is often used for sorting based on multiple criteria or when sorting cannot be done within the class itself.
- HashMap: 
  - An implementation of the `Map` interface using a hash table.
  - Stores key-value pairs and allows `null` values and `null` keys (only one null key is allowed).
  - Provides fast lookups based on key hashcode but does not guarantee order.
  - Example: `HashMap<String, Integer> map = new HashMap<>();`
- Deque: 
  - Stands for "Double-Ended Queue" and extends `Queue`.
  - Supports element insertion and removal at both ends (FIFO and LIFO operations).
  - Ideal for use in situations where elements need to be processed in both directions, such as in a stack (LIFO) or queue (FIFO).
  - Example: `Deque<String> deque = new ArrayDeque<>();`
*/

/* ArrayList */

// import java.util.*;

// public class CollectionsInJava {
//     public static void main(String[] args) {
//         ArrayList<String> names = new ArrayList<>();
//         names.add("Alice");
//         names.add("Bob");
//         names.add("Charlie");
//         names.add("Bob"); // Allows duplicates

//         System.out.println("ArrayList Elements:");
//         for (String name : names) {
//             System.out.println(name);
//         }

//         System.out.println("Contains 'Alice'? " + names.contains("Alice"));

//         names.remove("Bob"); // removes first occurrence
//         System.out.println("After removing 'Bob': " + names);

//         Collections.sort(names); // sort alphabetically
//         System.out.println("Sorted ArrayList: " + names);

//         System.out.println("Size: " + names.size());
//         names.clear();
//         System.out.println("Is empty after clear? " + names.isEmpty());
//     }
// }

/* TreeSet */

// import java.util.*;

// public class CollectionsInJava {
//     public static void main(String[] args) {
//         TreeSet<Integer> numbers = new TreeSet<>();
//         numbers.add(50);
//         numbers.add(10);
//         numbers.add(30);
//         numbers.add(10); // Duplicate, won't be added

//         System.out.println("TreeSet Elements (Sorted & Unique):");
//         for (int num : numbers) {
//             System.out.println(num);
//         }

//         numbers.remove(30);
//         System.out.println("After removing 30: " + numbers);

//         System.out.println("First element: " + numbers.first());
//         System.out.println("Last element: " + numbers.last());

//         System.out.println("Contains 10? " + numbers.contains(10));
//     }
// }

/* HashMap */

// import java.util.*;

// public class CollectionsInJava {
//     public static void main(String[] args) {
//         HashMap<Integer, String> students = new HashMap<>();
//         students.put(101, "John");
//         students.put(102, "Emma");
//         students.put(103, "Alex");
//         students.put(104, "Emma"); // duplicate value, but unique key

//         System.out.println("HashMap Contents:");
//         for (Map.Entry<Integer, String> entry : students.entrySet()) {
//             System.out.println("ID: " + entry.getKey() + " - Name: " + entry.getValue());
//         }

//         students.remove(102);
//         System.out.println("After removing ID 102: " + students);

//         System.out.println("Get student with ID 103: " + students.get(103));
//         System.out.println("Contains key 101? " + students.containsKey(101));
//         System.out.println("Contains value 'Emma'? " + students.containsValue("Emma"));
//     }
// }

/* Deque */

// import java.util.*;

// public class CollectionsInJava {
//     public static void main(String[] args) {
//         Deque<String> deque = new LinkedList<>();

//         deque.addFirst("Task A");
//         deque.addLast("Task B");
//         deque.offerFirst("Task C");  // preferred for safe insertion
//         deque.offerLast("Task D");

//         System.out.println("Deque after additions: " + deque);

//         System.out.println("Peek First: " + deque.peekFirst());  // Task C
//         System.out.println("Peek Last: " + deque.peekLast());    // Task D

//         deque.push("Task X");  // same as addFirst
//         System.out.println("After push: " + deque);

//         System.out.println("Pop (like Stack): " + deque.pop());  // removes Task X
//         System.out.println("Poll First: " + deque.pollFirst());  // removes Task C
//         System.out.println("Poll Last: " + deque.pollLast());    // removes Task D

//         System.out.println("Contains 'Task A'? " + deque.contains("Task A"));
//         System.out.println("Size: " + deque.size());

//         deque.clear();
//         System.out.println("Deque after clear: " + deque);
//         System.out.println("Is empty? " + deque.isEmpty());
//     }
// }