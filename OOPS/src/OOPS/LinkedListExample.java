package OOPS;
import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> flowers = new LinkedList<>();
        // Adding elements to the LinkedList
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Orchid");

        // Adding element at first and last position
        flowers.addFirst("Sunflower");
        flowers.addFirst("Sunflower");
        flowers.addLast("Jasmine");
        // Accessing elements
        System.out.println("First Flower: " + flowers.getFirst());
        System.out.println("Last Flower: " + flowers.getLast());
        // Removing an element
        flowers.remove("Tulip");
        // Printing the LinkedList
        System.out.println("Flower List: " + flowers);
        // Checking the size of LinkedList
        System.out.println("Total flowers: " + flowers.size());
    }
}

