//James McGuigan
package Loopexexercises;
import java.util.Scanner;
import java.util.Random;
public class PickAnumberGame 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a number 1 to 100 ");
		Random ran = new Random();
		
		int Ans = ran.nextInt(100)+1;
		int numb = scan.nextInt();

		while(Ans != numb)
		{
			if(numb>Ans)
			{
				System.out.print("Guess Lower! ");
			}
			else
			{
				System.out.print("Guess Higher! ");
			}
		numb=scan.nextInt();
		}
		System.out.println("You Got It! ");
	}
}