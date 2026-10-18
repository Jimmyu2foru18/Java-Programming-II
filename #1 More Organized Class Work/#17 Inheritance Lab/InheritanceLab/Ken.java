/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */
public class Ken extends Character {
	public Ken() {
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

		Ken ken = (Ken) obj;
		return idNumber == ken.idNumber;
	}

	public void jinraikick(Character target) {
		if (!isDead() && !target.isDead()) {
			target.takeDamage(35);
		}
	}

	@Override
	public String getIdNumber() {
		return String.format("002", idNumber);
	}
}