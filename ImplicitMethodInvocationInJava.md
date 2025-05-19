# Implicit Method Invocation in Java

In Java, certain methods from the `Object` class (like `toString()`, `equals()`, and `hashCode()`) are often called implicitly without being explicitly referenced in the code. Understanding when and how Java invokes these methods helps in writing cleaner and more efficient code.

---

## 1. `toString()` Method

The `toString()` method provides a string representation of an object. If not overridden, it returns the default format:

```java
ClassName@HashCode
```

### When is `toString()` Called Implicitly?

- **Printing an object**  

  ```java
  Movie m = new Movie(1, 8.5);
  System.out.println(m); // Implicitly calls m.toString()
  ```

- **String concatenation with an object**  

  ```java
  String info = "Details: " + m; // Implicitly calls m.toString()
  ```

- **Logging and debugging in IDEs**  
  - Many IDEs use `toString()` to display object details.

---

## 2. `equals()` Method

The `equals()` method compares objects for equality. If not overridden, it behaves like `==`, checking memory addresses.

### When is `equals()` Called Implicitly?

- **Using `.equals()` in collections**  

  ```java
  Set<Movie> movies = new HashSet<>();
  movies.add(new Movie(1, 8.5));
  movies.contains(new Movie(1, 8.5)); // Calls equals() implicitly
  ```

- **Comparing objects manually**  

  ```java
  Movie m1 = new Movie(1, 8.5);
  Movie m2 = new Movie(1, 8.5);
  if (m1.equals(m2)) { // Calls equals() implicitly
      System.out.println("Movies are the same.");
  }
  ```

---

## 3. `hashCode()` Method

The `hashCode()` method generates an integer representation of an object. It is critical for performance in hash-based collections like `HashSet` and `HashMap`.

### When is `hashCode()` Called Implicitly?

- **When storing objects in a Hash-based collection**  

  ```java
  HashMap<Movie, String> map = new HashMap<>();
  map.put(new Movie(1, 8.5), "Sci-Fi");
  ```

  - `hashCode()` is used to determine the storage bucket.

---

## Key Takeaways

1. **Java automatically calls `toString()`, `equals()`, and `hashCode()` in certain scenarios.**  
2. **Overriding these methods improves object behavior in printing, comparisons, and collections.**  
3. **Always override `equals()` and `hashCode()` together** for consistent behavior in collections.  
4. **Implicit calls happen in print statements, collections, and string operations**, making these methods essential to customize for meaningful behavior.

By understanding these implicit method calls, you can write better Java programs with predictable and optimized behavior. 🚀
