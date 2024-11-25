package Inheritance_P1;

public class Employee {
	private String name;
	private int id;
//	private double salary;

	public Employee(String n , int i ){
		name = n ;
		id = i ;
//		salary  = p ;
	}
	public void display(){
		System.out.println("Employee name: " + name);
		System.out.println("Id: " + id);
//		System.out.println("Salary: " + salary);
	}
}
