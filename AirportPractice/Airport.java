public class Airport {
    private static final int MAX_GATES = 100; // Maximum number of gates for all airports
    private static int totalNumGates = 0; // Total number of gates across all airports

    private String airportCode;
    private int gates;

    // Default constructor
    public Airport() {
        this.airportCode = "UNKNOWN";
        this.gates = 0;
    }

    // Parameterized constructor
    public Airport(String airportCode, int gates) {
        setAirportCode(airportCode);
        setGates(gates);
        totalNumGates += gates;
    }

    // Getter for airportCode
    public String getAirportCode() {
        return airportCode;
    }

    // Setter for airportCode with error checking
    public void setAirportCode(String airportCode) {
        if (airportCode != null && !airportCode.trim().isEmpty()) {
            this.airportCode = airportCode;
        } else {
            throw new IllegalArgumentException("Airport code cannot be empty or null.");
        }
    }

    // Getter for gates
    public int getGates() {
        return gates;
    }

    // Setter for gates with error checking
    public void setGates(int gates) {
        if (gates >= 0 && gates <= MAX_GATES) {
            totalNumGates -= this.gates;
            this.gates = gates;
            totalNumGates += gates;
        } else {
            throw new IllegalArgumentException("Invalid number of gates. Must be between 0 and " + MAX_GATES + ".");
        }
    }

    // Getter for totalNumGates (static variable)
    public static int getTotalNumGates() {
        return totalNumGates;
    }
}
