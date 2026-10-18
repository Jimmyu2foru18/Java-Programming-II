public class BankAccountCode {
	private String Name;
	private double Balance;
	private boolean IsAccountFrozen;
	private double totalDeposits;
	private double totalWithdrawals;

	public BankAccountCode(String Name_Client, double Balance_Account) {
		Name = Name_Client;
		setBalance(Balance_Account);
		totalDeposits = 0.0;
		totalWithdrawals = 0.0;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
		if (balance < 0) {
			IsAccountFrozen = true;
		} else {
			IsAccountFrozen = false;
		}
	}

	public boolean isAccountFrozen() {
		return (Balance < 0);
	}

	public double getTotalDeposits() {
		return totalDeposits;
	}

	public double getTotalWithdrawals() {
		return totalWithdrawals;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			Balance += amount;
			totalDeposits += amount;
		} else {
			throw new IllegalArgumentException("Deposit amount must be greater than 0.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && Balance >= amount) {
			Balance -= amount;
			totalWithdrawals += amount;
		} else {
			throw new IllegalArgumentException("Invalid withdrawal amount or insufficient balance.");
		}
	}

	public String toString() {
		return "Client name is: " + Name + "\nAccount Balance: " + Balance + "\nAccount Activity: "
				+ (isAccountFrozen() ? "Frozen" : "Active");
	}
}
