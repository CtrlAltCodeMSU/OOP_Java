package Lab_09;
public class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber , double balance){
		this.accountNumber = accountNumber ;
		this.balance = balance ;
	}

	public void deposit(double amount){
		if(amount > 0 ){
			balance += amount ;
			System.out.println("Deposited Amount " + amount);
			System.out.println("balance : " + balance);
		}
	}
	public void withdraw(double amount){
		if(amount > 0 && amount <= balance){
			balance -= amount ;
			System.out.println("Amount Withdrawl: " + amount);
			System.out.println("Remainig Balance: " + balance);
		}
	}
	public String toString(){
		return "Account Number" + accountNumber +"\n"+ "Balance" + balance ;

	}
	public double getBalance(){
		return balance;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
}
