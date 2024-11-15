package Inheritance_Bank;

public class SavingAccount extends BankAccount{
	private double intrest;

	public SavingAccount(String acc , double bal , double inter){
		super(acc , bal);
		intrest = inter ;
	}
	public void addIntrest(){
		double interest = balance * (intrest / 100) ;
		deposit(interest);
		System.out.println("Intrest Added: " + interest);
	}
}
