package OOPS;
import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> flowers = new ArrayList<>();

        // Adding elements to the ArrayList
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Orchid");

        // Accessing elements
        System.out.println("First flower: " + flowers.get(0));

        // Modifying an element
        flowers.set(1, "Sunflower");

        // Removing an element
        flowers.remove(2);

        // Printing all elements
        System.out.println("Flower List: " + flowers);

        // Checking the size of ArrayList
        System.out.println("Total flowers: " + flowers.size());
    }
}
