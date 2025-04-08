package OOPS;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> flowers = new HashSet<>();

        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Lotus");

        System.out.println("Before removing: " + flowers);

        // Remove a flower
        boolean removed = flowers.remove("Lily");

        System.out.println("Removed Lily? " + removed);
        System.out.println("After removing: " + flowers);

        // Try removing something not in set
        boolean removedAgain = flowers.remove("Sunflower");
        System.out.println("Removed Sunflower? " + removedAgain);
    }
}

