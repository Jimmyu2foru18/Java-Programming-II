
public class CharmanderSubClass extends PokemonSuperClass {
	final static String name = "Charmnder";
	final static String type = "An Fire Type Pokemon";
	private int blast;

	CharmanderSubClass(int health_i) {
		super(name, 90, type);
		blast = 30;

	}

	public int getFire() {
		return blast;
	}

	public void setFire(int blast) {
		this.blast = blast;
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
