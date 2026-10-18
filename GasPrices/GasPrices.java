//James McGuigan
import java.io.*;
import java.util.Scanner;

public class GasPrices {

	public static void main(String[] args) 
	{
	    File file = new File("gasprices.txt");

	    try {
	        Scanner sc = new Scanner(file);
	        int i =0;
	        double total=0;
	        double min=0;
	        double max = 0;
	        double average=0;
	        while (sc.hasNextLine()) 
	        {
	            i = sc.nextInt();
	           double j = sc.nextDouble();

	           if (i==-1&&j==-1)
	           break;
	            
	            if(j > max)
	            {
	                max = j;
	            }
	            
	            else if (j <= 1.47)
	            {
	               min = j;
	            }
	            System.out.println(i+" "+j);
	            total= total+j;
	            average = (min+max)/2;

	        }    
	        System.out.println("\nTotal of all Prices is " + total);
	        System.out.println("The Max Value is " + max);
	        System.out.println("The average value is " + average);
	        System.out.println("The min value is " + min);
	        
	        
	        sc.close();
	    } 
	    catch (FileNotFoundException e) 
	    {
	        e.printStackTrace();
	    }
}
}


