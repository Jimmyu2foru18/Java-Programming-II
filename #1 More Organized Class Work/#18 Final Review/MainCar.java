/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

public class MainCar {
	public static void main(String[] args) {

		ElectricCar electricCar = new ElectricCar(2022, "Tesla Model S", 80);
		GasCar gasCar = new GasCar(2022, "Toyota Camry", 10);

		System.out.println("Electric Car Initial Miles Remaining: " + electricCar.milesRemaining() + " miles");
		System.out.println("Gas Car Initial Miles Remaining: " + gasCar.milesRemaining() + " miles");

		electricCar.charge(20);
		gasCar.fillUp(5);

		System.out.println("After charging, Electric Car Miles Remaining: " + electricCar.milesRemaining() + " miles");
		System.out.println("After filling up, Gas Car Miles Remaining: " + gasCar.milesRemaining() + " miles");

		ElectricCar anotherElectricCar = new ElectricCar(2022, "Tesla Model S", 60);
		System.out
				.println("Are the two electric cars equal? " + (electricCar.equals(anotherElectricCar) ? "Yes" : "No"));

		GasCar anotherGasCar = new GasCar(2022, "Toyota Camry", 10);
		System.out.println("Are the two gas cars equal? " + (gasCar.equals(anotherGasCar) ? "Yes" : "No"));
	}
}
