class Percent {

    private double totalMarks;
    private double obtainedMarks;

    public Percent(double totalMarks, double obtainedMarks) {
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public double getObtainedMarks() {
        return obtainedMarks;
    }

    public void showPercentage() {
        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + percentage + "%");
    }
}

public class  lab5_Task_3 {

    public static void main(String[] args) {

        Percent student = new Percent(300, 250);

        System.out.println("Obtained Marks: " + student.getObtainedMarks());
        System.out.println("Total Marks: " + student.getTotalMarks());

        student.showPercentage();
    }
}
