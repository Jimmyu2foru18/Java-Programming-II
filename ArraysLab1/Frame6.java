
/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */

import java.util.Random;

public class Frame6 {

	public static void main(String[] args) {
		int[] numbersArray = new int[1000];
		Random random = new Random();

		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = random.nextInt(100) + 1;
		}

		int[] counts = new int[101];

		for (int i = 0; i < numbersArray.length; i++) {
			int number = numbersArray[i];
			counts[number]++;
		}
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print(numbersArray[i] + " ");
		}
		System.out.println("Counts of each number in the array:");

		for (int i = 1; i < counts.length; i++) {
			if (counts[i] > 0) {
				System.out.println("Number " + i + " appears " + counts[i] + " times.");
			}
		}
	}
}
