import java.util.*;

public class CSE310_Deque {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();
        history.addLast("Google");
        history.addLast("GitHub");
        history.addLast("YouTube");
        System.out.println("Current History: "+history);
        history.removeLast();
        System.out.println("After going back: "+history);
        history.addLast("StackOverflow");
        System.out.println("After visiting new page: "+history);
    }
}