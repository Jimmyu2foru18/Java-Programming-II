//James McGuigan
package Loopexexercises;
import java.text.DecimalFormat;
public class Loopexercise4 
{
	public static void main(String[] args) 
	{
		DecimalFormat count = new DecimalFormat("0.0");
		
		for(double i = 1.0;i<=10.0;i+=.1)
		System.out.println(count.format(i));		
	}
}