package OOPS;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("This is a sample text file.\nJava file handling is simple and efficient.\nFeel free to write more content!");
            writer.close();
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
