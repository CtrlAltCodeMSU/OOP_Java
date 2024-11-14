package ArrayLists_Practice;
import ArrayLists.Author.MyBoooks;

import java.util.Scanner;
public class MainBook {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		Library myCollection = new Library();

		System.out.println("Enter the Number of Books to Store: ");
		int numOfBooks = scan.nextInt();
		scan.nextLine();

		for (int i = 0 ; i < numOfBooks ; i++){
			System.out.println("-----Book #"+(i+1)+" Info: ");
			System.out.println("Enter The Book Title #" + (i+1));
			String title = scan.nextLine();

			System.out.println("Enter The Author Name for Book #" + (i+1));
			String author =  scan.nextLine();

			System.out.println("Enter The Price for Book #" + (i+1));
			double price =  scan.nextDouble();

			scan.nextLine();
			myCollection.addBook(new BooksData(title , author , price));
		}
		System.out.println("My Books in My Library are: ");
		myCollection.ListCollection();

		System.out.println("Do you want to Search Book in Library? Yes/No");
		String search = scan.nextLine();

		if (search.equalsIgnoreCase("Yes")){
			System.out.println("Enter the Keyword for Search Book: ");
			String keyword = scan.nextLine();

			BooksData foundBook = myCollection.searchBook(keyword);
			if (foundBook != null) {
				System.out.println("Book Found: " + foundBook);
			}else {
					System.out.println("Book not found!");
				}
			}
			else {
				System.out.println("Exiting the Program, Have a niceDay!");
			}
		}
	}

