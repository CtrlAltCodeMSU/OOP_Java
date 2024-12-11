package Lab_09;

public class CertificateOfDeposit extends BankAccount{
	public CertificateOfDeposit(String accountNumber , double balance){
		super(accountNumber , balance);
	}

	public void withdraw(double amount){
		System.out.println("Not allowed in Certificate of deposit!");
	}
	public String toString(){
		return "Certificate of Deposit:  " + super.toString();
	}
}
