package BankAccount;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance){
		balance = initialBalance;
	}

	public void depositMoney(double amount){
		if (amount>0){
			balance += amount;
			System.out.println("Deposited Amount: " + amount);
		}
		else {
			System.out.println("Deposit Mount must be positive");
		}
	}
	public void withdrawAmount(double withdraw){
		if (balance>=0 && balance>=withdraw){
			balance -= withdraw;
			System.out.println("WithDrwa amount: " + withdraw);
		}
		else if(withdraw> balance){
			System.out.println("Insufiicient Balance!");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	public double getBalance(){
		return balance;
	}
}
