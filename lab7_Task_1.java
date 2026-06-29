OOTask1_LAb3.java

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class  lab6_Task_1 {

    public static void main(String[] args) {

        try {

            File csvFile = new File("Project.csv");
            Scanner fileReader = new Scanner(csvFile);

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String data[] = line.split(",");

                String studentName = data[0];
                String rollNumber = data[1];
                double marks = Double.parseDouble(data[2]);

                System.out.println("Student Name: " + studentName);
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Marks: " + marks);

                System.out.println("----------------");
            }

            fileReader.close();

        } catch (FileNotFoundException e) {

            System.out.println("CSV file not found.");
        }
    }
}


