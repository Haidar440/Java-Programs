package OOPS;
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message); // Pass the message to the parent (Exception) class
    }
}

public class Custom_Exception {
    public static void checkValue(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Value cannot be negative!");
        } else {
            System.out.println("Value is valid!");
        }
    }

    public static void main(String[] args) {
        try {
            checkValue(5); // Will throw the custom exception
        } catch (MyCustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
