import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class  lab2_Task_2 {

    public static void main(String[] args) {

        try {
            File file = new File("Data.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            }

            FileWriter writer = new FileWriter("Data.txt");
            writer.write("Hello World\n");
            writer.write("Sitara\n");
            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }

        try {
            File file = new File("Data.txt");
            Scanner readFile = new Scanner(file);

            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                System.out.println(line);
            }

            readFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}