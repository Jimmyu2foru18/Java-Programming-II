/**
 * @author Jimmy McGuigan
 * CS 2510 Programming 2
 * Lab Static/Final
 */
public class mainClass 
{
    public static void main(String[] args) 
    {

        Airport myAirport = new Airport("JFK",223);
        Airport myAirport2 = new Airport("LGA",197);


        int totalGates = Airport.getTotalNumGates();
        System.out.println("Total number of gates: " + totalGates);


        System.out.println("\n" + myAirport.getAirportCode());
        System.out.println(myAirport.getGates());
        
        System.out.println("\n" + myAirport2.getAirportCode());
        System.out.println(myAirport2.getGates());


        myAirport.setGates(19);  
        myAirport2.setGates(50);

        totalGates = Airport.getTotalNumGates();
        System.out.println("\nUpdated Total num of gates = " + totalGates);
    }
}
