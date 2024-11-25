package Inheritance_P3;

public class Library {
	protected String name;

	public Library (String name){
		this.name = name;
	}
	public void displayLibrary(){
		System.out.println("Library Name: " + name);
	}
}
