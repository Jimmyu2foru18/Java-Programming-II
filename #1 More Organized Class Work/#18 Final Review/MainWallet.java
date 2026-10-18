/**
 * @author James McGuigan CS 5210 Programming 2 Prof.B
 */

public class MainWallet {
	public static void main(String[] args) {
		Wallet wallet = new Wallet(100);
		Wallet wallet2 = new Wallet(23);
		CreditCardWallet creditCardWallet = new CreditCardWallet(300, 150);
		CreditCardWallet creditCardWallet2 = new CreditCardWallet(100, 200);

		if (wallet.equals(wallet2)) {
			System.out.println("Wallets are equal!");

		}

		if (creditCardWallet.equals(creditCardWallet2)) {
			System.out.println("Credit Card Wallets are equal!");

		}

		System.out.println("Wallet at risk: " + wallet.atRisk());
		System.out.println("Credit Card Wallet at risk: " + creditCardWallet.atRisk());

		wallet.withdraw(200);
		creditCardWallet.chargeCreditCard(155);

		System.out.println("Wallet balance: $" + wallet.getMoney());
		System.out.println("Credit Card Wallet balance: $" + creditCardWallet.getMoney());
		System.out.println("Credit Card Wallet credit card balance: $" + creditCardWallet.getCreditCardBalance());
	}
}
