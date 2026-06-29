import java.util.Scanner;

public class lab1_Task_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total marks:");
        double totalMarks = input.nextDouble();

        System.out.println("Enter obtained marks:");
        double obtainedMarks = input.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Percentage = " + percentage + "%");
    }
}
