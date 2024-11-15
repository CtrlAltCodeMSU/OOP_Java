package Inheritance_P1;

public class PermanentEmpl extends Employee{
	private int grade ;
	private double bpay ;
	private double salary ;

	public PermanentEmpl(String n , int i , int g , double p , double s){
		super(n , i );
		grade = g ;
		bpay  = p ;
		salary = s ;
	}
	public void calcuateSalary(){
		salary = bpay + (bpay*.45)+(bpay*.3)+10000;
		System.out.println("Total Salary is : " + salary);
	}
}
