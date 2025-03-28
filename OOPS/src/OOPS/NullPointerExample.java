package OOPS;

public class NullPointerExample {
        public static void main(String[] args) {
            try {
                String str = null; // Null value
                System.out.println(str.length()); // This will cause NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Error: Null reference accessed - " + e.getMessage());
            } finally {
                System.out.println("This is the finally block. It always executes.");
            }
        }
    }

