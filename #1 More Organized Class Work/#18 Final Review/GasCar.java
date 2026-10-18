/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

class GasCar extends Car {
	private double gallonsRemaining;

	public GasCar(int year, String model, double gallonsRemaining) {
		super(year, model);
		this.gallonsRemaining = gallonsRemaining;
	}

	@Override
	public double milesRemaining() {
		return gallonsRemaining * 22;
	}

	public void fillUp(double gallons) {
		gallonsRemaining = Math.min(15, gallonsRemaining + gallons);
	}
}