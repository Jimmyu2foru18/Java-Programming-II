import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter airport information:");
        MCode airportInfo = createAirportInfo(scanner);

        System.out.println("Airport Information:");
        printAirportInfo(airportInfo);
    }

    public static MCode createAirportInfo(Scanner scanner) 
    {
        System.out.print("Airport Name: ");
        String airportName = scanner.nextLine();

        System.out.print("Airport Code (3 characters): ");
        String airportCode = scanner.nextLine();

        System.out.print("Number of Gates: ");
        int numberOfGates = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Travel Destination: ");
        String travelDestination = scanner.nextLine();

        System.out.print("Arrival Location: ");
        String arrivalLocation = scanner.nextLine();

        System.out.print("Departure Times: ");
        String departureTimes = scanner.nextLine();

        System.out.print("Arrival Times: ");
        String arrivalTimes = scanner.nextLine();

        return new MCode(airportName, airportCode, numberOfGates, travelDestination,
                arrivalLocation, departureTimes, arrivalTimes);
    }

    public static void printAirportInfo(MCode airportInfo) {
        System.out.println("Airport Name: " + airportInfo.getAirportName());
        System.out.println("Airport Code: " + airportInfo.getAirportCode());
        System.out.println("Number of Gates: " + airportInfo.getNumberOfGates());
        System.out.println("Travel Destination: " + airportInfo.getTravelDestination());
        System.out.println("Arrival Location: " + airportInfo.getArrivalLocation());
        System.out.println("Departure Times: " + airportInfo.getDepartureTimes());
        System.out.println("Arrival Times: " + airportInfo.getArrivalTimes());
    }
}
