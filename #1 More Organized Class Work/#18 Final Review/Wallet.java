/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

public class Wallet {
	private double money;

	public Wallet(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void deposit(double amount) {
		money += amount;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= money) {
			money -= amount;
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}

	public boolean atRisk() {
		return money < 10;
	}

	@Override
	public String toString() {
		return "Wallet with balance: " + money;
	}
	
	@Override
	public boolean equals(Object e) {
		if (e instanceof Wallet && e != null) {
			Wallet toCheck = (Wallet) e;
			return this.money == toCheck.money;
		}
		return false;
	}
}
