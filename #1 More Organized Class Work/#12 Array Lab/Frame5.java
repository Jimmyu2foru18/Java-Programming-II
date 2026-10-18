
/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */

import java.util.Random;

public class Frame5 {

	public static void main(String[] args) {
		int[] numbersArray = new int[1000];
		Random random = new Random();

		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = random.nextInt(100) + 1;
		}
		// to show array
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print(numbersArray[i] + " ");
		}

		int largestValue = largestVal(numbersArray);
		int smallestValue = smallestVal(numbersArray);
		double meanValue = meanVal(numbersArray);

		System.out.println("\nLargest value is: " + largestValue);
		System.out.println("Smallest value is: " + smallestValue);
		System.out.println("Mean value is: " + meanValue);
	}

	// Function to find the largest value
	public static int largestVal(int[] num) {
		int largest = num[0];
		for (int number : num) {
			if (number > largest) {
				largest = number;
			}
		}
		return largest;
	}

	// Function to find the smallest value
	public static int smallestVal(int[] num) {
		int smallest = num[0];
		for (int number : num) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}

	// Function to find the mean value
	public static double meanVal(int[] num) {
		int sum = 0;
		for (int number : num) {
			sum += number;
		}
		return (double) sum / num.length;
	}
}
