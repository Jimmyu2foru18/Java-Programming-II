/**
 * @author James McGuigan CS5210 Programming 2 Exam 3 Part 2 Program 1
 */
/*
 * Write a program that creates a 2-D array of size 7 by 6 and stores the value,
 * in decimal form,
 * 
 * of the first index divided by the second index at that particular index
 * value.
 * 
 * If it is an invalid value store -1 at that location (for example if it's a
 * divide by zero situation). Print out all the values to prove that it is
 * correct before handing it in.
 * 
 * So for example my2DArray[6][3] should have 2.0 stored at that location
 * 
 * my2DArray[6][5] should have 1.2 stored at that location
 * 
 * my2DArray[6][0] should have -1 stored at that location.
 * 
 */

public class Program2 {
	public static void main(String[] args) {
		// Create a 2-D array of size 7 by 6
		double[][] divide = new double[7][6];

		// Fill the array with values
		for (int i = 0; i < divide.length; i++) {
			for (int j = 0; j < divide[i].length; j++) {
				// Calculate the value for each index
				if (j == 0) {
					// Avoid divide by zero situations
					divide[i][j] = -1;
				} 
				else {
					divide[i][j] = i / (double) j;
				}
			}
		}
		System.out.print("my2DArray[6][3] should have 2.0 stored at that location " + divide[6][3]);
		System.out.print("\nmy2DArray[6][5] should have 1.2 stored at that location " + divide[6][5]);
		System.out.print("\nmy2DArray[6][0] should have -1 stored at that location " + divide[0][0]);
	}
}
