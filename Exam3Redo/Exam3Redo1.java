import java.util.Scanner;

public class Exam3Redo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] firstArray = new int[5]; // Initial size of the array
		int currentIndex = 0;

		while (true) {
			System.out.println("Enter a positive value to store or a negative value to exit:");
			int input = scanner.nextInt();

			if (input < 0) {
				break; // Break the loop when a negative number is entered
			}

			if (currentIndex == firstArray.length) {
				// Resize the array if it's full
				int[] newArray = new int[firstArray.length * 2];
				System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
				firstArray = newArray;
			}

			firstArray[currentIndex] = input;
			currentIndex++;
		}

		System.out.print("You entered the following numbers: ");

		// Print the values using a for loop
		for (int i = 0; i < currentIndex; i++) {
			System.out.print(firstArray[i]);

			if (i < currentIndex - 1) {
				System.out.print(", ");
			}
		}
		scanner.close();
	}
}
