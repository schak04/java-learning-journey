/*
===================== WILDCARDS IN JAVA =====================

This file demonstrates the three types of wildcards in Java:
1. Unbounded Wildcard        - `<?>`
2. Upper Bounded Wildcard    - `<? extends Type>`
3. Lower Bounded Wildcard    - `<? super Type>`

Real-life application:
- We're simulating a game engine where different entities extend a base class.
- We’ll use wildcards to update entities, print info, and add them to a collection.
*/

import java.util.*;

class GameObject {
    public void update() {
        System.out.println("Updating a game object.");
    }
}

class Player extends GameObject {
    @Override
    public void update() {
        System.out.println("Player moves and shoots!");
    }
}

class Enemy extends GameObject {
    @Override
    public void update() {
        System.out.println("Enemy moves and attacks!");
    }
}

public class CSE310_WildcardsGenericClasses {
    // Upper bounded wildcard: accepts Player, Enemy, or any subclass of GameObject
    public static void updateEntities(List<? extends GameObject> entities) {
        System.out.println("\n--- Updating Entities ---");
        for (GameObject entity : entities) {
            entity.update(); // Only safe operation: reading
        }
    }

    // Lower bounded wildcard: allows adding Player objects to the list
    public static void addPlayers(List<? super Player> list) {
        System.out.println("\n--- Adding Players ---");
        list.add(new Player()); // Safe to add Player or subclass
    }

    // Unbounded wildcard: just read and print info
    public static void printAll(List<?> list) {
        System.out.println("\n--- Printing All ---");
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }

    @SuppressWarnings("unused")
   public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy());

        // Unbounded - we just want to print
        printAll(enemies);

        // Upper bounded - we want to update game entities
        updateEntities(enemies);

        // Lower bounded - we want to add players to a broader type list
        List<GameObject> allEntities = new ArrayList<>();
        addPlayers(allEntities); // GameObject is a super of Player

        // Updating the whole list
        updateEntities(allEntities);
    }
}
 