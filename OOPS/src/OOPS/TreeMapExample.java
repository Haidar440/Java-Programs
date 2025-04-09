package OOPS;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap of student roll numbers and names
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Fatima");
        students.put(101, "Ali");
        students.put(104, "Hassan");
        students.put(102, "Zahra");

        // For-each loop to print keys and values in sorted order
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
