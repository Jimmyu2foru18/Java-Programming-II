/**
 * @author Jimmy McGuigan
 */
import java.util.Scanner;
public class FunctionTry {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
  
	        System.out.print("Enter the first double: ");
	        double num1 = scan.nextDouble();
 
	        System.out.print("Enter the second double: ");
	        double num2 = scan.nextDouble();
     
	        double result = addNumbers(num1, num2);
	        //divide
	        double result2 = divideNumbers(num1, num2);


	        System.out.println("The total of " + num1 + " and " + 
	        num2 + " is " + result);
	        //divide println
	        System.out.println("The total dividing " + 
	        num1 + " by " + num2 + " is " + result2);
	    }
		//ADD
	    public static double addNumbers(double a, double b) 
	    {
	        return a + b;
	    }
	    //Divide
	    public static double divideNumbers(double a, double b) 
	    {
	        if (b != 0) 
	        {
	        return a / b;

	    }
			return (Double) null;
}
}
