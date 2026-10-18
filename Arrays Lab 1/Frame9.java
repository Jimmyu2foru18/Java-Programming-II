
/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */
import java.util.Random;

public class Frame9 {
	public static void main(String[] args) {
		Random random = new Random();

		Student[] classroom = new Student[1000];

		for (int i = 0; i < classroom.length; i++) {
			String studentName = generateRandomName(7, random);
			int studentID = 700_000_000 + i;
			int numberOfCredits = random.nextInt(31) * 4;

			classroom[i] = new Student(studentID, studentName, numberOfCredits);
		}

		System.out.println("Random Student information in the classroom:");
		for (Student student : classroom) {
			System.out.println("Name: " + student.getStudentName());
			System.out.println("ID: " + student.getStudentID());
			System.out.println("Credits: " + student.getNumberOfCredits());
			System.out.println();
		}
	}

	private static String generateRandomName(int length, Random random) {
		char[] name = new char[length];
		for (int i = 0; i < length; i++) {
			name[i] = (char) (random.nextInt(26) + 'a');
		}
		return new String(name);
	}
}
