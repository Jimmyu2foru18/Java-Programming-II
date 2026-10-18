/**
 * @author James McGuigan
 * TEST 1 Part 1 Corrected
 *Ctrl, shift, 'F" to  format code
 */
import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int x = scan.nextInt();

		for (int i = x; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
 * What I did incorrect was i was using 1 as the value of i in the first for
 * loop and i was having it measure the value of x instead of the i=x.
 * this was causing a continuation of "*" on the incorrect axis.
 */
