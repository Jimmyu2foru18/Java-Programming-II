/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

abstract class Car {
	protected int year;
	protected String model;

	public Car(int year, String model) {
		this.year = year;
		this.model = model;
	}

	public abstract double milesRemaining();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Car otherCar = (Car) obj;
		return year == otherCar.year && model.equals(otherCar.model);
	}
}
