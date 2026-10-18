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

public AirportCode()
{
	airportCode="JFK";
	gates = 0;
}

public AirportCode(String i_airportCode,int i_gates) 
{
	if(i_airportCode.length() !=0)
	{
	airportCode=i_airportCode;
	}
	else
		airportCode="JFK";
	
	
	if(i_gates > 0)
	{
		gates = i_gates;
	}
	else
		gates = 0;
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
		if(gates_s>0)
		{
			gates=gates_s;
		}
		else
			System.out.println("Invalid set Gates");
			
	}
		
}
