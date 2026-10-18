/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

public class Frame3 {
	public static void main(String[] args) {
		int[] numbersArray = new int[10];

		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = i + 1;
		}

		for (int i = 0; i < numbersArray.length; i++) {
			System.out.println("numbersArray[" + i + "] = " + numbersArray[i]);
		}
	}
}

/*
 * The Array itself exists on the Heap
 */
