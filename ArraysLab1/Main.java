
/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student[] classroom = new Student[7];

		for (int i = 0; i < classroom.length; i++) {
			System.out.println(
					"Input the next student's name followed by ID then Credits student has for student # " + (i + 1));

			System.out.print("Enter the student's name: ");
			String studentName = scanner.nextLine();

			System.out.print("Enter the student's ID: ");
			int studentID = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter the number of credits: ");
			int numberOfCredits = scanner.nextInt();
			scanner.nextLine();

			classroom[i] = new Student(studentID, studentName, numberOfCredits);
		}

		System.out.println("Student information in the classroom:");
		for (Student student : classroom) {
			System.out.println("Name: " + student.getStudentName());
			System.out.println("ID: " + student.getStudentID());
			System.out.println("Credits: " + student.getNumberOfCredits());
			System.out.println();
		}
	}
}
