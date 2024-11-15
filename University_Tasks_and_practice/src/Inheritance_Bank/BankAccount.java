package Inheritance_Bank;

public class BankAccount {
	private String accountNumber;
	protected double balance;

	public BankAccount(String a , double b){
		accountNumber = a ;
		balance = b ;
	}
	public void deposit(double amount){
		balance += amount ;
		System.out.println("Deposited: " + amount);
	}
	public void withdrawl(double amount){
		if (balance>=amount){
			balance -= amount ;
			System.out.println("Withdrawl: " + amount);
		}
		else {
			System.out.println("Insufficient Balance: " + balance);
		}
	}
	public void showBalance(){
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
//		return balance;
	}
}
