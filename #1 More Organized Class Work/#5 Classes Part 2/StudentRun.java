/**
 * @author jimmy McGuigan
 */
import java.util.Scanner;
public class StudentRun {


	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter student name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter student number (between 700000000 and 799999999): ");
	        int studentNumber = Integer.parseInt(scanner.nextLine());

	        System.out.print("Enter credits earned: ");
	        int credits = Integer.parseInt(scanner.nextLine());

	        System.out.print("Enter GPA (between 0 and 4.0: ");
	        double gpa = Double.parseDouble(scanner.nextLine());

	        Student student = new Student(name, studentNumber, credits, gpa);


	        System.out.println("\nStudent Information:");
	        System.out.println("Name: " + student.getName());
	        System.out.println("Student Number: " + student.getStudentNumber());
	        System.out.println("Credits Earned: " + student.getCredits());
	        System.out.println("GPA: " + student.getGpa());
	        System.out.println("Credits Needed to Graduate: " + student.getCreditsToGraduate());
	    }
	}
