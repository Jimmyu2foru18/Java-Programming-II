/**
 * @author James McGuigan
 * CS 2511 Programming 2
 * Airport Class
 * TPS
 */
public class AirportCode
{//private variables
private String airportCode;
private int gates;
private static final int MAX_GATES = 10;

// Static variable to keep track of the number of AirportCode instances
private static int numberOfAirports = 0;
//default constructor
public AirportCode()
{
	airportCode="JFK";
	gates = 0;
	numberOfAirports++;
}
//valued constructor
public AirportCode(String i_airportCode,int i_gates) 
{
	if(i_airportCode.length() !=0)
	{
	airportCode=i_airportCode;
	}
	
	if(i_gates > 0 && i_gates <= MAX_GATES)
	{
		gates = i_gates;
	}
	else 
	{
		System.out.println("INVALID");
	}
	numberOfAirports++;
}
//Getter for Airport code
	public String getairportCode()
	{
		return airportCode;
	}
	public void setairportCode(String airportCode_S)
	{
		if(airportCode_S.length() !=0)
		{
		airportCode=airportCode_S;
		}
		else
			System.out.println("INVALID");;	
	}
	
	public int getGates()
	{
		return gates;
	}
	public void setGates(int gates_s)
	{
		if(gates_s>0 && gates >= MAX_GATES)
		{
			gates=gates_s;
		}
		else
			System.out.println("Invalid set Gates");
	}
	
	public static int getMaxGates() 
	{
		return MAX_GATES;
	}

	public static int getNumberOfAirports() 
	{
		return numberOfAirports;
	}
		
}
