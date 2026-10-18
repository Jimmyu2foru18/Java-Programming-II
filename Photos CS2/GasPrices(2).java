import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GasPrices {

	public static void main(String[] args) 
	{
		Scanner scan=null;
		try 
		{
			scan = new Scanner( new File("GasPrices.txt"));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		while(!scan.nextLine().contains("-1"))
		{
		System.out.println(scan.nextLine());
		}
		
		String Total = null;
		while(!scan.next().contains("-1"))
		{
		Total= String.valueOf(scan.next());
		}
		System.out.println(Total);
	}

}
