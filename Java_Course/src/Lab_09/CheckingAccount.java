public class CheckingAccount extends BankAccount{
	private double limit ;

	public CheckingAccount(String accountNumber, double balance , double limit){
		super( accountNumber , balance );
		this.limit = limit ;
	}
	public void withdraw(double amount){
		if (amount > 0 && getBalance() + limit >= amount){
			super.withdraw(amount);
		}
		else {
			System.out.println("Exceeds Limit!");
		}
	}
	public String toString(){
		return super.toString() + " , Overdraft limit: $" + limit;
	}
}
