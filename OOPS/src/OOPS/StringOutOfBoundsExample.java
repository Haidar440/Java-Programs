package OOPS;

public class StringOutOfBoundsExample {
    public static void main(String[] args) {
        try {
            String str = "Java";
            System.out.println(str.charAt(10)); // Accessing an invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds - " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
