package OOPS;

class FlowerArrayException {
    public static void main(String[] args) {
        try {
            // Array with 10 flower names
            String[] flowers = {"Rose", "Lily", "Tulip", "Orchid", "Daisy",
                    "Sunflower", "Jasmine", "Lavender", "Marigold", "Daffodil"};
            // Trying to access the 15th index (out of bounds)
            System.out.println("Flower at index 15: " + flowers[15]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index - " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
