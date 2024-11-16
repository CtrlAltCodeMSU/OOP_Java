package Inheritance_P3;
class Lib{
	protected String name;

	public Lib(String name){
		this.name = name;
	}
	public void displayLib(){
		System.out.println("Library Name: " + name);
	}
}
class BookLib extends Lib{
	private String[] books ;

	public BookLib(String lib , String[] books){
		super(lib);
		this.books = books;
	}
	public void displayBooks(){
		super.displayLib();
		System.out.println("Books: ");
		for (String book : books){
			System.out.println(" - " + book);
		}
	}
}
public class myLibrary {
	public static void main(String[] args) {
		String[] libBooks = {"C++" , "1984" , "Tonny Gaddis"};
		BookLib myBook1 = new BookLib("Main Library" , libBooks);
		myBook1.displayBooks();
	}
}
