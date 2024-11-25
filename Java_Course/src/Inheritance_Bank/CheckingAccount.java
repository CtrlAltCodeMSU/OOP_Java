package Inheritance_Bank;

public class CheckingAccount extends BankAccount {
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdrawl(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Overdraft limit exceeded.");
		}
	}
public static void main(String[] args) {
	BankAccount account1 = new SavingAccount("SA123", 1000.0, 2.5);
	BankAccount account2 = new CheckingAccount("CA456", 500.0, 200.0);

	account1.showBalance();
	((SavingAccount) account1).addIntrest();
	account1.showBalance();

	account2.showBalance();
	account2.withdrawl(600);
	account2.showBalance();
   }
}
