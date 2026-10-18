/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

class ElectricCar extends Car {
	private double percentCharge;

	public ElectricCar(int year, String model, double percentCharge) {
		super(year, model);
		this.percentCharge = percentCharge;
	}

	@Override
	public double milesRemaining() {
		return percentCharge * 10;
	}

	public void charge(double additionalPercent) {
		percentCharge = Math.min(100, percentCharge + additionalPercent);
	}
}
