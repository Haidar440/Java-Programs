package OOPS;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Ali");
        studentMap.put(102, "Fatima");
        studentMap.put(103, "Hassan");

        System.out.println("Student Map: " + studentMap);

        // Access a value
        System.out.println("Roll 102: " + studentMap.get(102));

        // Remove a key-value pair
        studentMap.remove(101);

        System.out.println("After removing 101: " + studentMap);
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
