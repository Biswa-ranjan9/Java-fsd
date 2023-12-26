package package1.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Orange");

        System.out.println("\nArrayList Elements:");
        for (String fruit : arr) {
            System.out.println(fruit);
        }
        

        // LinkedList example
        LinkedList<Integer> lin = new LinkedList<>();
        lin.add(5);
        lin.add(10);
        lin.add(15);

        System.out.println("\nLinkedList Elements:");
        for (Integer number : lin) {
            System.out.println(number);
        }
        

        // HashMap example
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Biswa");
        hm.put(102, "Ranjan");
        hm.put(103, "Prusty");

        System.out.println("\nHashMap Elements:");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
