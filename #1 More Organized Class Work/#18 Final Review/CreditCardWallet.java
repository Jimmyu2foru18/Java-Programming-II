/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

public class CreditCardWallet extends Wallet {
	private double creditCardBalance;

	public CreditCardWallet(double money, double creditCardBalance) {
		super(money);
		this.creditCardBalance = creditCardBalance;
	}

	public double getCreditCardBalance() {
		return creditCardBalance;
	}

	public void chargeCreditCard(double chargeAmount) {
		if (chargeAmount > 0) {
			creditCardBalance += chargeAmount;
		} else {
			System.out.println("Invalid credit card charge amount.");
		}
	}

	public void payCreditCard(double amount) {
		creditCardBalance -= amount;

	}

	@Override
	public boolean equals(Object e) {
		if (e instanceof CreditCardWallet && e != null) {
			CreditCardWallet toCheck = (CreditCardWallet) e;
			return this.creditCardBalance == toCheck.creditCardBalance && this.getMoney()==toCheck.getMoney();
													// or you could put ^^^ super.equals(toCheck);
		}
		return false;
	}

	@Override
	public boolean atRisk() {
		return super.atRisk() || (creditCardBalance >= getMoney());
		// or this
		// return creditCardBalance>=getMoney() || getMoney()<=10;
	}
}

