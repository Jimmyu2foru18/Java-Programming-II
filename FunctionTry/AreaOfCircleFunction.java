/**
 * @author jimmy McGuigan
 */
import java.util.Scanner;
public class AreaOfCircleFunction {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		double radius = scan.nextDouble();

		double area = AreaofCircle(radius);

		System.out.println("The area of the circle is " + area);
	}
		//Use math class to find area Function
		public static double AreaofCircle(double radius) 
		{
			return Math.PI * radius * radius;
		}

}


