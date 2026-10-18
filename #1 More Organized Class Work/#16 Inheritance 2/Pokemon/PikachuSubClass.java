
public class PikachuSubClass extends PokemonSuperClass {
	final static String name = "Pikachu";
	final static String type = "An Eletric Type Pokemon";
	private int shock;

	PikachuSubClass(int health_i) {
		super(name, health_i, type);
		shock = 50;

	}

	public int getShock() {
		return shock;
	}

	public void setShock(int shock) {
		this.shock = shock;
	}

	@Override
	public String toString() {
		return name + "\nThis pokemon is: " + type + "\nWith health: " + health;
	}

	@Override
	public void takeHit(int attack) {
		boolean isGrowl = false;
		if (myRandom.nextInt(5) < 1) {
			isGrowl = true;
		}
		if (isGrowl) {
			setHealth(getHealth() - myRandom.nextInt(attack));
		}
	}
}
