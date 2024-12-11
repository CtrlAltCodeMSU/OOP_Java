package Lab_09;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(String accountNumber , double balance){
		super(accountNumber , balance);
	}
	public void withdraw(double amount){
		if (amount > 0 && getBalance()  >= amount){
			super.withdraw(amount);
		}
		else {
			System.out.println("Cannot withdraw");
		}
	}
	public String toString(){
		return "Savings " + super.toString();
	}
}
