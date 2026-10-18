public class MCode 
{
    // Private instance variables
    private String airportName;
    private String airportCode;
    private int numberOfGates;
    private String travelDestination;
    private String arrivalLocation;
    private String departureTimes;
    private String arrivalTimes;

    // Constructor
    public MCode(String airportName, String airportCode, int numberOfGates, String travelDestination,
                 String arrivalLocation, String departureTimes, String arrivalTimes) {
        setAirportName(airportName);
        setAirportCode(airportCode);
        setNumberOfGates(numberOfGates);
        setTravelDestination(travelDestination);
        setArrivalLocation(arrivalLocation);
        setDepartureTimes(departureTimes);
        setArrivalTimes(arrivalTimes);
    }

    // Getter and Setter methods with validation
    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        if (airportName != null && !airportName.isEmpty()) {
            this.airportName = airportName;
        } else {
            System.out.println("Invalid airport name. It cannot be empty.");
        }
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        if (airportCode != null && airportCode.length() == 3) {
            this.airportCode = airportCode;
        } else {
            System.out.println("Invalid airport code. It must be 3 characters long.");
        }
    }

    public int getNumberOfGates() {
        return numberOfGates;
    }

    public void setNumberOfGates(int numberOfGates) {
        if (numberOfGates > 0) {
            this.numberOfGates = numberOfGates;
        } else {
            System.out.println("Invalid number of gates. It must be greater than 0.");
        }
    }

    public String getTravelDestination() {
        return travelDestination;
    }

    public void setTravelDestination(String travelDestination) {
        if (travelDestination != null && !travelDestination.isEmpty()) {
            this.travelDestination = travelDestination;
        } else {
            System.out.println("Invalid travel destination. It cannot be empty.");
        }
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        if (arrivalLocation != null && !arrivalLocation.isEmpty()) {
            this.arrivalLocation = arrivalLocation;
        } else {
            System.out.println("Invalid arrival location. It cannot be empty.");
        }
    }

    public String getDepartureTimes() {
        return departureTimes;
    }

    public void setDepartureTimes(String departureTimes) {
        if (departureTimes != null && !departureTimes.isEmpty()) {
            this.departureTimes = departureTimes;
        } else {
            System.out.println("Invalid departure times. They cannot be empty.");
        }
    }

    public String getArrivalTimes() {
        return arrivalTimes;
    }

    public void setArrivalTimes(String arrivalTimes) {
        if (arrivalTimes != null && !arrivalTimes.isEmpty()) {
            this.arrivalTimes = arrivalTimes;
        } else {
            System.out.println("Invalid arrival times. They cannot be empty.");
        }
    }
}

