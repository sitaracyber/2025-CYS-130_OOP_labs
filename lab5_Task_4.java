class StudentResult {

    private double totalMarks;
    private double obtainedMarks;

    public StudentResult(double totalMarks, double obtainedMarks) {
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public double getObtainedMarks() {
        return obtainedMarks;
    }
}

public class  lab1_Task_4 {

    public static void main(String[] args) {

        StudentResult student = new StudentResult(300, 250);

        double percentage = (student.getObtainedMarks() / student.getTotalMarks()) * 100;

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
    }
}
