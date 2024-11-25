package ArrayLists_p1;
import java.util.Scanner;
import java.util.ArrayList;

class Student{
	String name;
	int age;
	double gpa;

	public Student(String name, int age , double gpa){
		this.name = name;
		this.age = age;
		this.gpa = gpa ;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public double getGpa(){
		return gpa;
	}
	public void setGpa(double gpa){
		this.gpa = gpa ;
	}

	public String toString(){
		return "Student{" + " name='" + name + '\'' + ", age= " + age + ", gpa=" + gpa + '}' ;
	}
}

class Employee {
	private String name;
	private int id;
	private double salary;

	// Constructor
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
			 "name='" + name + '\'' +
			 ", id=" + id +
			 ", salary=" + salary +
			 '}';
	}
}
public class p2 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Employee> employess = new ArrayList<>();

		Student s1 = new Student("Ahmad" , 1 , 3.8);
		Student s2 = new Student("Ali" , 2 , 3.25);

		Employee e1 = new Employee("Asad" , 101 , 500000);
		Employee e2 = new Employee("fasi" , 250, 25000);

		students.add(s1);
		students.add(s2);

		employess.add(e1);
		employess.add(e2);

		System.out.println("Students:");
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("\nEmployees:");
		for (Employee employee : employess) {
			System.out.println(employee);
		}
	}
}
