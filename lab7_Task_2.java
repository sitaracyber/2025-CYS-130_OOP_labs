OOP_lab3_Task_2.java

import java.util.Scanner;

public class lab7_Task_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter student name:");
            String name = input.nextLine();

            System.out.println("Enter roll number:");
            String rollNumber = input.nextLine();

            System.out.println("Enter age:");
            int age = input.nextInt();

            double totalMarks = 300;

            System.out.println("Enter obtained marks:");
            double obtainedMarks = input.nextDouble();
            input.nextLine();

            double percentage = (obtainedMarks / totalMarks) * 100;

            System.out.println("Percentage = " + percentage + "%");

            if (percentage >= 90) {
                System.out.println("Grade A");
            } else if (percentage >= 85) {
                System.out.println("Grade A-");
            } else if (percentage >= 80) {
                System.out.println("Grade B+");
            } else if (percentage >= 75) {
                System.out.println("Grade B");
            } else if (percentage >= 70) {
                System.out.println("Grade B-");
            } else if (percentage >= 65) {
                System.out.println("Grade C+");
            } else if (percentage >= 60) {
                System.out.println("Grade C");
            } else if (percentage >= 55) {
                System.out.println("Grade C-");
            } else if (percentage >= 50) {
                System.out.println("Grade D");
            } else {
                System.out.println("Fail");
            }

            System.out.println("-----------------");
        }
    }
}
