/*
The Object class is the root of the Java class hierarchy.
Every class in Java directly or indirectly inherits from Object.
It provides several important methods that subclasses can override
to customize behavior.

Key Methods of the Object Class:
- toString()
- equals(Object obj)
- hashCode()
- clone()
- finalize()
- getClass()
- wait(), notify(), notifyAll()

-----

Why Override toString()?
By default, toString() returns a string representation of the object, typically in the format:
ClassName@HashCode

Example:
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        System.out.println(p);  // Person@15db9742
    }
}

This output isn't useful, so we override toString() to provide meaningful details:

@Override
public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
}

Now, System.out.println(p); outputs:
Person{name='Alice', age=25}

-----

Why Override equals()?
By default, equals(Object obj) compares references (memory addresses),
meaning two objects are only considered equal if they are the same instance.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);

        System.out.println(p1.equals(p2));  // false (default behavior)
    }
}

Even though p1 and p2 have the same values, they are different objects. To fix this, we override equals():

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Person person = (Person) obj;
    return age == person.age && name.equals(person.name);
}

Now, p1.equals(p2) returns true.
*/

/*
The public keyword is necessary when overriding methods from the Object class
(like toString(), equals(), and hashCode()) because these methods are originally
declared as public in java.lang.Object.

When overriding a method, Java enforces the following rule:
✅ Cannot reduce visibility of the overridden method.

Since toString(), equals(), and hashCode() are public in Object,
any override must also be public.
*/

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same object reference
        if (obj == null || getClass() != obj.getClass()) return false; // Type check
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name); // Compare values
    }
}

public class ObjectClassInJava {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println(p1.toString()); // Person{name='Alice', age=25}
        System.out.println(p2.toString()); // Person{name='Alice', age=25}

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}
