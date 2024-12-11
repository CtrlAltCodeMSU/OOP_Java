public class MyAccount {
	public static void main(String[] args) {
		CheckingAccount checking = new CheckingAccount("NM456123" , 500 , 600);
		System.out.println("Checking: ");
		checking.deposit(100);
		checking.withdraw(500);

		SavingsAccount saving = new SavingsAccount("1024532148" , 78554);
		System.out.println(saving);
		saving.deposit(200);
		saving.withdraw(1500);

		CertificateOfDeposit certificate = new CertificateOfDeposit("787454" , 7848);
		System.out.println(certificate);
		certificate.withdraw(455);
	}
}
