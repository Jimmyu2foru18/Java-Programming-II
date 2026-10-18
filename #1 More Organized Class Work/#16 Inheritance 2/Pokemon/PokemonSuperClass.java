import java.util.Random;

public abstract class PokemonSuperClass {
	public int health;
	private String type;
	public String name;

	PokemonSuperClass(String Name_i, int health_i, String type_i) {
		setHealth(health_i);
		setType(type_i);
	}
	Random myRandom = new Random();

	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public void takeHit(int attack) {
		
	}

}
