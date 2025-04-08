package OOPS;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>();

        students.add("Zahra");
        students.add("Ali");
        students.add("Fatima");
        students.add("Hassan");
        students.add("Ali"); // Duplicate - will be ignored

        System.out.println("Sorted Students: " + students);

        // Remove a student
        students.remove("Fatima");

        System.out.println("After removing Fatima: " + students);
    }
}
