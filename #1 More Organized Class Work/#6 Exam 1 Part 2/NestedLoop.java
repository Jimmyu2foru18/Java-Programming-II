/**
 * @author James McGuigan

 * CS 2511 Programming 2
 * Exam 1
 * Prof.B
 */
/*Program that takes users input 
 *and outputs the triangles in a nested loop
 */
import java.util.Scanner;

public class NestedLoop 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		{	
		for(int i=1; i<=x;i++)
		{
			for(int j=i; j<=x; j++)
			{
				System.out.println(" * ");
			}
		}
		System.out.println();
	}
	}
}
