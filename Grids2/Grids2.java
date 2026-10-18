//James McGuigan
import java.util.Scanner;
public class Grids2 
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the height (A): ");
	int height = scan.nextInt();

	System.out.print("Enter the width (B): ");
	int width = scan.nextInt();

		for (int i = 0; i < height; i++) 
			{
			for (int j = 0; j < width; j++) 
			{
			System.out.print("* "); 
			}
		System.out.println();
		}
	}
}