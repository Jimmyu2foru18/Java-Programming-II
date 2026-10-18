
public class SquirtleSubClass extends PokemonSuperClass {
	final static String name = "Squirtle";
	final static String type = "An Water Type Pokemon";
	private int water;

	SquirtleSubClass(int health_i) {
		super(name, 95, type);
		water = 40;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	@Override
	public String toString() {
		return name + "\nThis pokemon is: " + type + "\nWith health: " + health;
	}
	@Override
	public void takeHit(int attack) 
	{
		setHealth(getHealth()-myRandom.nextInt(attack));
	}
}
