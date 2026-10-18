
import java.util.Scanner;
public class mainClass 
{

	public static void main(String[] args) 
	{
		final long startTime= System.currentTimeMillis();
		Scanner myChar= new Scanner(System.in);
		
		char letter='c';
		while(letter!='r')
		
		{
			String nextString = myChar.next();
			if( nextString.length()==1)
			{
				letter = nextString.charAt(0);
			}
		}
		
		final long endTime= System.currentTimeMillis();
		System.out.println("Total execution time: "+ (endTime-startTime));
	}

}
