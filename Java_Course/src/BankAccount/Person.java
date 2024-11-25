package BankAccount;

public class Person {
	private String name;
	private BankAccount account;

	public Person(String name , double balance){
		this.name = name;
		account = new BankAccount(balance);
	}
	public void depositMoney(double amount){
		account.depositMoney(amount);
	}

	public void withdraw(double amount){
		account.withdrawAmount(amount);
	}
	public void checkBalance(){
		System.out.println(name + "'s Account balance is: " + account.getBalance());
		;
	}
}
