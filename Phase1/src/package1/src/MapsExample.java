package package1.src;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> Ss = new HashMap<>();

        // Adding key-value pairs
        Ss.put("Biswa", 90);
        Ss.put("Ranjan", 85);
        Ss.put("Prusty", 92);

        // Accessing values using keys
        System.out.println("Biswa's Score: " + Ss.get("Biswa"));
        System.out.println("Ranjan's Score: " + Ss.get("Ranjan"));
        System.out.println("Prusty's Score: " + Ss.get("Prusty"));

        // Checking if a key exists
        String studentName = "Ranjan";
        if (Ss.containsKey(studentName)) {
            System.out.println(studentName + "'s Score: " + Ss.get(studentName));
        } else {
            System.out.println(studentName + " not found in the map.");
        }

        // Iterating over the map
        System.out.println("\nAll Student Scores:");
        for (Map.Entry<String, Integer> entry : Ss.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}