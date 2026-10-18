/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

public class Student {
	private int studentID;
	private String studentName;
	private int numberOfCredits;

	// Default constructor
	public Student() {
		this.studentID = 0; // Initialize with 0
		this.studentName = "Unknown";
		this.numberOfCredits = 0;
	}

	// Parameterized constructor
	public Student(int studentID, String studentName, int numberOfCredits) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.numberOfCredits = numberOfCredits;
	}

	// Getter methods
	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	@Override
	public String toString() {
		return "Student ID: " + studentID + ", Name: " + studentName;
	}
}
