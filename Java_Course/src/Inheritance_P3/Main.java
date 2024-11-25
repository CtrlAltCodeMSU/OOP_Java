package Inheritance_P3;

public class Main {
	public static void main(String[] args) {
		String[] bookArray = {"C++" , "1984" , "Tonny Gaddis"};
		BookLibrary myLibrary = new BookLibrary("City Library" , bookArray);
		myLibrary.displayBooks();
	}
}
