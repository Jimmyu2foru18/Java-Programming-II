
/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */
import java.util.Random;
import java.util.Scanner;

public class Frame4 {

	public static void main(String[] args) {
		int[] numbersArray = new int[1000];
		Random random = new Random();

		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = random.nextInt(100) + 1;
		}
		// Just for visual not needed
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print(numbersArray[i] + " ");
		}
		// just for visual not needed ^^
		Scanner scan = new Scanner(System.in);

		System.out.println("\nPlayer 1, please enter your guess (1-100):");
		int player1Guess = scan.nextInt();

		System.out.println("Player 2, please enter your guess (1-100):");
		int player2Guess = scan.nextInt();

		int countPlayer1 = countNumGuesses(numbersArray, player1Guess);
		int countPlayer2 = countNumGuesses(numbersArray, player2Guess);

		System.out.println("Player 1's guess " + player1Guess + " appears " + countPlayer1 + " times.");
		System.out.println("Player 2's guess " + player2Guess + " appears " + countPlayer2 + " times.");

		if (countPlayer1 > countPlayer2) {
			System.out.println("Player 1 is the winner!");
		} else if (countPlayer2 > countPlayer1) {
			System.out.println("Player 2 is the winner!");
		} else {
			System.out.println("It's a tie!");
		}
	}

	public static int countNumGuesses(int[] num_A, int Count_A) {
		int count = 0;
		for (int i = 0; i < num_A.length; i++) {
			if (num_A[i] == Count_A) {
				count++;
			}
		}
		return count;
	}
}
