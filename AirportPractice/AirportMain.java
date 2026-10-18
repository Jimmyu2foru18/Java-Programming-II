import java.util.Scanner;

public class AirportMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Create Airport instances based on user input
            Airport jfkAirport = createAirportFromUserInput(scanner);
            Airport laxAirport = createAirportFromUserInput(scanner);

            // Display airport information
            displayAirportInfo(jfkAirport);
            displayAirportInfo(laxAirport);

            // Update gate count for JFK based on user input
            System.out.print("Enter the updated number of gates for JFK: ");
            int updatedGates = scanner.nextInt();
            jfkAirport.setGates(updatedGates);

            // Display updated information
            displayAirportInfo(jfkAirport);

            // Display the total number of gates
            System.out.println("Total Number of Gates: " + Airport.getTotalNumGates());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static Airport createAirportFromUserInput(Scanner scanner) {
        System.out.print("Enter airport code: ");
        String airportCode = scanner.next();

        System.out.print("Enter number of gates: ");
        int gates = scanner.nextInt();

        return new Airport(airportCode, gates);
    }

    static void displayAirportInfo(Airport airport) {
        System.out.println("Airport Code: " + airport.getAirportCode());
        System.out.println("Number of Gates: " + airport.getGates());
        System.out.println("---------------------------");
    }
}


