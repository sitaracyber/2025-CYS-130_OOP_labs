class Student {

    private String studentName;
    private int rollNumber;

    public Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class  lab2_Task_1{

    public static void main(String[] args) {

        Student student = new Student("Sitara", 130);

        student.setStudentName("Sitara");
        student.setRollNumber(130);

        System.out.println(student.getStudentName());
        System.out.println(student.getRollNumber());

        student.displayInfo();
    }
}