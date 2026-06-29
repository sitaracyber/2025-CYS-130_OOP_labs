import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class StudentPercentage {

    String studentName;
    int rollNumber;
    float obtainedMarks;
    float percentage;
    String grade;

    public StudentPercentage(String studentName, int rollNumber, float obtainedMarks) {

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.obtainedMarks = obtainedMarks;

        percentage = (obtainedMarks / 300) * 100;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 85) {
            grade = "A-";
        } else if (percentage >= 80) {
            grade = "B+";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "B-";
        } else if (percentage >= 65) {
            grade = "C+";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 55) {
            grade = "C-";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public void displayResult() {

        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class  lab4_Task_3 {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = new FileReader("Project.csv");
        Scanner input = new Scanner(reader);

        while (input.hasNextLine()) {

            String line = input.nextLine();
            String data[] = line.split(",");

            String name = data[0];
            int rollNumber = Integer.parseInt(data[1]);
            float marks = Float.parseFloat(data[2]);

            StudentPercentage student = new StudentPercentage(name, rollNumber, marks);

            student.displayResult();

            System.out.println("-----------------");
        }
    }
}
