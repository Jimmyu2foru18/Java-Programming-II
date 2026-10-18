/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */
public class Ryu extends Character {
	public Ryu() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Ryu ryu = (Ryu) obj;
		return idNumber == ryu.idNumber && getCurrentHealth() == ryu.getCurrentHealth();
	}

	public void hadouken(Character target) {
		if (!isDead() && !target.isDead()) {
			target.takeDamage(30);
		}
	}

	@Override
	public String getIdNumber() {
		return String.format("%03d", idNumber);
	}

	public boolean equalsByHealth(Ken ken) {
		return getCurrentHealth() == ken.getCurrentHealth();
	}
}