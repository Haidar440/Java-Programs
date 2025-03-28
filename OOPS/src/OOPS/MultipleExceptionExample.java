package OOPS;

class MultipleExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int a = numbers[5]; // ArrayIndexOutOfBoundsException

            int num = 10 / 0; // ArithmeticException (Division by zero)

            String str = null;
            int length = str.length(); // NullPointerException

            String text = "Java";
            char ch = text.charAt(10); // StringIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed - " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference accessed - " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index out of bounds - " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
