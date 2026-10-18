//James McGuigan
package Loopexexercises;
import java.util.Scanner;
public class Loopexexercises5 
{
	public static void main(String[] args) 
	{	
		int numbH = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string " );
		String text = scan.nextLine( );
		
		for(int i =0;i<text.length();i++)
		{
			if(text.charAt(i)=='h'||text.charAt(i)=='H')
			{	
				numbH=numbH+1;
			}
		}
		System.out.println("You have "+'"' + numbH + '"' +" number of h/H in your string");	
	}
}