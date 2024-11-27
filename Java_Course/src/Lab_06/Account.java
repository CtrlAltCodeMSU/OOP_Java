package Lab_06;

public class Account {
	private String AccountNumber;
	private String name;
	private double balance;

	public Account(String AccountNumber , String name ){
		this.AccountNumber = AccountNumber;
		this.name = name ;
		this.balance = 0.0 ;
	}
	public void deposit(double amount){
		if (amount > balance){
			amount += balance;
			System.out.println("Amount Deposited: " + amount);
			System.out.println("Current Balance: " + balance);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw(double amount){
		if (amount > 0 && amount <= balance){
			amount -= balance ;
			System.out.println("Amount withdrawl: " + amount);
			System.out.println("Current Balance: " + balance);
		}
		else {
			System.out.println("Invalid input!");
		}
	}
	public void showBalance(){
		System.out.println("Account Holder: " + name);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance: " + balance);
	}
}
