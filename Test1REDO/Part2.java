/**
 * @author James McGuigan
 * TEST 1 Part 2 Corrected
 */
import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Min = Integer.MAX_VALUE;
		int Max = Integer.MIN_VALUE;
		boolean Positive = false;

		while (true) {
			System.out.print("Enter an integer (negative to exit): ");
			int num = scan.nextInt();

			if (num < 0) {
				break;
			} else if (num > 0) {
				Positive = true;
				if (num < Min) {
					Min = num;
				}
				if (num > Max) {
					Max = num;
				}
			}
		}
		if (Positive) {
			int x = Max - Min;
			System.out.println(Max + " Minus " + Min + " Equals " + x);
		} else {
			System.out.println("No valid positive integers entered");
		}
	}
}
/*  For the corrections, scanning the input for the values 
 *  should have been done in a while loop and calculations for retrieving the
 *  max and min values should have been used in a if statement testing the
 *  validity of the entered number to the min and max values
 *  the boolean is used for the calculation at the end to print the values 
 *  when the previous entries become false stating the max, min, 
 *  and the subtracted values on the line.
 *  if no positive values were entered it uses the "if"
 *  statement to properly print the correct response.
 */
