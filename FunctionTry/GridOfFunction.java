/**
 * @author jimmy McGuigan
 */
import java.util.Scanner;
public class GridOfFunction 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the height: ");
		int height = scanner.nextInt();

		System.out.print("Enter the width: ");
		int width = scanner.nextInt();
		       
		grid(height, width);
	}

		public static void grid(int height, int width) 
		{
			for (int i = 0; i < height; i++) 
			{
				for (int j = 0; j < width; j++) 
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
		}

}
