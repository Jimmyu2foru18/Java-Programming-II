
public class Exam3Redo2 {
	public static void main(String[] args) {
		// Create a 2-D array of size 7 by 6
		double[][] my2DArray = new double[7][6];

		// Fill the array with values
		for (int i = 0; i < my2DArray.length; i++) {
			for (int j = 0; j < my2DArray[i].length; j++) {
				// Calculate the value for each index
				if (j == 0) {
					// Avoid divide by zero situations
					my2DArray[i][j] = -1;
				} else {
					my2DArray[i][j] = i / (double) j;
				}
			}
		}
		// Print out the values of specific indices
		System.out.println("my2DArray[6][3]: " + my2DArray[6][3]);
		System.out.println("my2DArray[6][5]: " + my2DArray[6][5]);
		System.out.println("my2DArray[6][0]: " + my2DArray[6][0]);
	}
}
