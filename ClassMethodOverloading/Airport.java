/**
 * @author Jimmy McGuigan
 * CS 2510 Programming 2
 * Lab Static/Final
 */

public class Airport {
    private String airportCode;
    private int gates;
    private static int totalNumGates = 0;

    public Airport() {
        this.airportCode = "JFK";
        this.gates = 0;
        totalNumGates ++;
    }

    public Airport(String airportCode, int gates) {
        if (airportCode.length() != 0) {
            this.airportCode = airportCode;
        } else {
            this.airportCode = "JFK";
        }

        if (gates > 0) {
            this.gates = gates;
            totalNumGates += this.gates;
        } else {
            this.gates = 0;
        }
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public void setAirportCode(String airportCode) {
        if (airportCode.length() != 0) {
            this.airportCode = airportCode;
        } else {
            this.airportCode = "JFK";
        }
    }

    public int getGates() {
        return this.gates;
    }

    public void setGates(int gates) {
        if (gates > 0) {
            totalNumGates -= this.gates; 
            this.gates = gates;
            totalNumGates += this.gates; 
        } else {
            this.gates = 0;
        }
    }
    public static int getTotalNumGates() {
        return totalNumGates;
    }

}
