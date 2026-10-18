/**
 * @author jimmy McGuigan
 */
import java.util.Scanner;
public class NameandAge {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		        Scanner scan= new Scanner(System.in);

		        System.out.print("Enter a first and last name: ");
		        String name = scan.nextLine();


		        System.out.print("Enter age: ");
		        int age = scan.nextInt();

		        NameAndAge(name, age);
	}

		public static void NameAndAge(String name, int age) 
		{
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
		}
}


