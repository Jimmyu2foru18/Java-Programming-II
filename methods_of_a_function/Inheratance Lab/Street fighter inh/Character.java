/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */
public class Character {
	private static int nextIdNumber = 1;

	public final int idNumber;
	private int currentHealth;
	private boolean isDead;

	public Character() {
		idNumber = nextIdNumber;
		nextIdNumber++;

		currentHealth = 100;
		isDead = false;
	}

	public void takeDamage(int damage) {
		if (!isDead) {
			currentHealth -= damage;
			if (currentHealth <= 0) {
				currentHealth = 0;
				isDead = true;
			}
		}
	}

	public void heal(int healing) {
		if (!isDead) {
			currentHealth += healing;
			if (currentHealth > 100) {
				currentHealth = 100;
			}
		}
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public boolean isDead() {
		return isDead;
	}

	public boolean equalsById(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Character character = (Character) obj;
		return idNumber == character.idNumber;
	}

	public boolean equalsByHealth(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Character character = (Character) obj;
		return currentHealth == character.currentHealth;
	}

	public String getIdNumber() {
		return String.format("%03d", idNumber);
	}
}