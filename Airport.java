/**
 * @author James McGuigan
 * CS 2511 Programming 2
 * Airport Class
 * TPS
 */
import java.util.Scanner;
public class Airport 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//Valued Constructor
		AirportCode AirportA= new AirportCode("LGA", 7);
		//Default Constructor
		AirportCode AirportB= new AirportCode();
		System.out.println(AirportA.getairportCode());
		System.out.println(AirportB.getairportCode());
		AirportA.setairportCode("LAX");
		System.out.println(AirportA.getairportCode());
		AirportA.setGates(-900);
		System.out.println(AirportA.getGates());
		System.out.println(AirportCode.getNumberOfAirports());
		System.out.println(AirportCode.getMaxGates());
	}

}
