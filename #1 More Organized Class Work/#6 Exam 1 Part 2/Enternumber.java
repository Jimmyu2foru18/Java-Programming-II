
/**
 * @author James McGuigan

 * CS 2511 Programming 2
 * Exam 1
 * Prof.B
 */
import java.util.Scanner;
public class Enternumber
{

	public static void main(String[] args) 
	{
	{
		int x = 0;
		int y = 0;
		int z = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number or a negative number to exit ");
		x = scan.nextInt();
		y = scan.nextInt();
		while(x>-1)
		x = scan.nextInt();
	
		x = Math.max(x, y);
		y = Math.min(x, y);
		z= x-=y;
		
		System.out.println(x+ " minus " + y + " equals "+z);
	}

	}
}

