package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Access a value
        System.out.println("Value for key 2: " + map.get(2)); // Output: Banana

        // Check if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3)); // Output: true

        // Remove a key-value pair
        map.remove(2);

        // Iterate through the map
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}