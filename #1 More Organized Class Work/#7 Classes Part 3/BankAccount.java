import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account holder's name: ");
		String name = scanner.nextLine();

		System.out.print("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();

		BankAccountCode myAccount = new BankAccountCode(name, initialBalance);

		System.out.println("Account created: " + myAccount);

		System.out.print("Enter the deposit amount: ");
		double depositAmount = scanner.nextDouble();

		System.out.print("Enter the withdrawal amount: ");
		double withdrawalAmount = scanner.nextDouble();

		double newBalance = BalanceCalculator.calculateNewBalance(myAccount.getBalance(), depositAmount,
				withdrawalAmount);

		myAccount.setBalance(newBalance);

		System.out.println("\nUpdated Account: \n" + myAccount);
		System.out.println("Total Deposits: " + (myAccount.getTotalDeposits() + depositAmount));
		System.out.println("Total Withdrawals: " + (myAccount.getTotalWithdrawals() + withdrawalAmount));

		scanner.close();
	}
}

class BalanceCalculator {
	public static double calculateNewBalance(double currentBalance, double depositAmount, double withdrawalAmount) {
		if (depositAmount < 0 || withdrawalAmount < 0) {
			throw new IllegalArgumentException("Deposit and withdrawal amounts must exist.");
		}

		double newBalance = currentBalance + depositAmount - withdrawalAmount;
		if (newBalance < 0) {
			newBalance = 0;
		}

		return newBalance;
	}
}
