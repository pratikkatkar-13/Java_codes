// Java program demonstrating ArrayList, HashSet, Stack, HashMap
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        // ----------------- ArrayList -----------------
        System.out.println("\n--- ArrayList ---");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Mango");
        list.set(2, "Peach");
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get index 1: " + list.get(1));
        System.out.println("Contains 'Apple': " + list.contains("Apple"));
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));
        list.remove("Banana");
        list.remove(0);
        System.out.println("Updated List: " + list);
        list.clear();
        System.out.println("Is Empty: " + list.isEmpty());

        // ----------------- HashSet -----------------
        System.out.println("\n--- HashSet ---");
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Contains 20: " + set.contains(20));
        set.remove(10);
        System.out.println("Updated Set: " + set);
        Set<Integer> anotherSet = new HashSet<>(Arrays.asList(20, 40));
        set.addAll(anotherSet);
        System.out.println("After addAll: " + set);
        set.retainAll(Collections.singleton(20));
        System.out.println("After retainAll: " + set);
        set.clear();
        System.out.println("Is Empty: " + set.isEmpty());

        // ----------------- Stack -----------------
        System.out.println("\n--- Stack ---");
        Stack<String> stack = new Stack<>();
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");
        System.out.println("Stack: " + stack);
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Search 'Book2': " + stack.search("Book2"));
        stack.pop();
        System.out.println("After pop: " + stack);
        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());

        // ----------------- HashMap -----------------
        System.out.println("\n--- HashMap ---");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(2, "JavaScript"); // Replaces Python
        System.out.println("Map: " + map);
        System.out.println("Get key 2: " + map.get(2));
        System.out.println("Contains key 3: " + map.containsKey(3));
        System.out.println("Contains value 'Java': " + map.containsValue("Java"));
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());
        map.remove(1);
        map.putIfAbsent(4, "GoLang");
        map.clear();
        System.out.println("Is Empty: " + map.isEmpty());
    }
}
