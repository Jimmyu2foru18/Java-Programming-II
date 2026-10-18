
/**
 * @author James McGuigan
 * CS5210 Programming 2
 * Exam 3 Part 2
 * Program 1
 */
/* Write a program which uses a while loop and the user inputs positive integer numbers 
 * and it is saved in a 1-D array, named firstArray and then, 
 * when the user enters a negative number, 
 * it prints out all the values of the array using a for loop.----------------------------------------------------------------------- 
 * Note that you have to check the case when the array needs to be resized-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 * firstArray must be resized if the user inputs too many values. 
 * The array can be partially filled (i.e. you can have a negative value indicate the end 
 * of the array until the array is filled up or you can always just keep increasing the array
 * size by 1 everytime a user enters a number, both are ok implementations --see below). <<<<<<<<<<<<<<

		Sample output:

		>>Enter a positive value to store or negative value to exit

		>5

		>>Enter a positive value to store or a negative value to exit

		>4

		>>Enter a positive value to store or a negative value to exit

		>-1

 * Note the array at this point should have 5 at the zeroth index, 
 * 4 at the first index-- you can put the -1 at the second index to show 
 * that there are no more valid values if you'd like (for example if the array isn't all the way filled) 
 * or always just resize the array so it's the correct size. 

		> You entered the following numbers: 4,5
 * 
 */
import java.util.Scanner;
import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int ArraySize = 10;
		int[] Array = new int[ArraySize];
		int index = 0;
		while (true) {
			System.out.print(">>Enter a positive value to store or negative value to exit");
			int input = scan.nextInt();
			if (input < 0)
				break;
			if (index > Array.length) {
				Array = Arrays.copyOf(Array, Array.length + ArraySize);
			}
			Array[index] = input;
			index++;

		}

		System.out.print("> You entered the following numbers: ");
		for (int i = 0; i < index; i++) {
			System.out.print(Array[i] + " ");
		}
	}
}
