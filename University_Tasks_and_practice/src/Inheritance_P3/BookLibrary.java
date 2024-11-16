package Inheritance_P3;

public class BookLibrary extends Library{
	private String[] books ;

	public BookLibrary(String name , String[] books){
		super(name);
		this.books = books ;
	}
	public void displayBooks(){
		super.displayLibrary();
		System.out.println("Books: ");
		for (String book : books ){
			System.out.println("- " + book);
		}
	}
}
