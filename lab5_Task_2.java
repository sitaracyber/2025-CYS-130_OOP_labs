class Percentage {

    private double totalMarks;
    private double obtainedMarks;

    public double getTotalMarks() {
        return totalMarks;
    }

    public double getObtainedMarks() {
        return obtainedMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setObtainedMarks(double obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public void calculatePercentage() {
        double result = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + result + "%");
    }
}

public class lab1_Task_2 {

    public static void main(String[] args) {

        Percentage student = new Percentage();

        student.setTotalMarks(300);
        student.setObtainedMarks(250);

        System.out.println("Obtained Marks: " + student.getObtainedMarks());
        System.out.println("Total Marks: " + student.getTotalMarks());

        student.calculatePercentage();
    }
}
