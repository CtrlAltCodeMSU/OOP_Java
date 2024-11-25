package ArrayLists_Practice;

import java.util.ArrayList;
public class Library {
	private ArrayList<BooksData> books = new ArrayList<BooksData>();
	public void addBook(BooksData book){
	books.add(book);
	}

	public void ListCollection(){
		for (BooksData book : books){
			System.out.println(book.getTitle() + " by " + book.getAuthor() + " - $" + book.getPrice());
		}
	}

	public BooksData searchBook(String keyword){
//		boolean found = false;
		for (BooksData book : books){
			if (book.getTitle().equalsIgnoreCase(keyword) || book.getAuthor().equalsIgnoreCase(keyword)){
				System.out.println(book.getTitle() + " and Price is: $" + book.getPrice() + " by " + keyword);
//				found = true;
			}
		}

//		if (!found){
//			System.out.println("Book Not found in your Collection!");
		return null;
		}
	}

