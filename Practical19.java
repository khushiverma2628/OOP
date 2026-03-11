import java.util.Scanner;

public class Practical19 {

    String collegeName;
    public Practical19(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {

        String studentName;
        String course;
        void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }
        void displayDetails() {
            System.out.println("\n----- Admission Details -----");
            System.out.println("College Name : " + collegeName);
            System.out.println("Student Name : " + studentName);
            System.out.println("Course       : " + course);
        }
    }

    public static void main(String[] args) {

        // Create object of outer class
        Practical19 college = new Practical19("spb patel Engineering College");

        // Create object of inner class
        Practical19.Admission admission = college.new Admission();

        admission.acceptDetails();
        admission.displayDetails();
    }
}
