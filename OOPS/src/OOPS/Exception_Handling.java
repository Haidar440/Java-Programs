package OOPS;

public class Exception_Handling {
    public static void main(String[] args) {
        try {
            int num = 10;
            int result = num / 0; // This will cause ArithmeticException (ZeroDivision)
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero - " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
