package Lab_06;
import java.util.Scanner;
class BankingSystem {
	static class Account {
		private String accountHolderName;
		private String accountNumber;
		private double balance;

		public Account(String accountHolderName, String accountNumber, double initialBalance) {
			this.accountHolderName = accountHolderName;
			this.accountNumber = accountNumber;
			this.balance = initialBalance;
		}

		public void deposit(double amount) {
			if (amount > 0) {
				balance += amount;
				System.out.println("Successfully deposited: $" + amount);
			} else {
				System.out.println("Deposit amount must be greater than zero.");
			}
		}

		public void withdraw(double amount) {
			if (amount > 0 && amount <= balance) {
				balance -= amount;
				System.out.println("Successfully withdrawn: $" + amount);
			} else if (amount > balance) {
				System.out.println("Insufficient balance.");
			} else {
				System.out.println("Withdrawal amount must be greater than zero.");
			}
		}

		public void showBalance() {
			System.out.println("Account Holder: " + accountHolderName);
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Current Balance: $" + balance);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account holder's name: ");
		String name = scanner.nextLine();

		System.out.print("Enter account number: ");
		String accountNumber = scanner.nextLine();

		System.out.print("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();

		Account account = new Account(name, accountNumber, initialBalance);
		boolean exit = false;
		while (!exit) {
			System.out.println("\n--- Banking System ---");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter amount to deposit: ");
					double depositAmount = scanner.nextDouble();
					account.deposit(depositAmount);
					break;
				case 2:
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmount = scanner.nextDouble();
					account.withdraw(withdrawAmount);
					break;
				case 3:
					account.showBalance();
					break;
				case 4:
					exit = true;
					System.out.println("Exiting the Banking System. Thank you!");
					break;
				default:
					System.out.println("Invalid option. Please try again.");
			}
		}
		scanner.close();
	}
}