package ArrayLists.Author;
import java.util.ArrayList;
public class Books {
	private ArrayList<BookCollection> books = new ArrayList<BookCollection>();

	public void addBook(BookCollection book){
		books.add(book);
	}

	public void listBooks(){
		for (BookCollection book : books ){
			System.out.println(book.getTitle() + " by " + book.getName()+ " - $" + book.getPrice());
		}
	}

	public void searchByAuthor(String author){
		boolean found = false ;
		for(BookCollection book : books){
			if (book.getName().equalsIgnoreCase(author)){
				System.out.println(book.getTitle()+ " by: " + author);
				found = true;
			}
		}
		if (!found){
			System.out.println("No Book Found by " + author);
		}
	}

}
