package ArrayLists.Author;

import java.util.Scanner;
public class MyBoooks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Books myCollection = new Books();

		System.out.println("Enter the number of books to add:");
		int numberOfBooks = scan.nextInt();
		scan.nextLine();
		for (int i = 0 ; i< numberOfBooks ; i++){
			System.out.println("--------------Book #"+(i+1)+" info-------------");
			System.out.println("Enter the Title of the Book #" + (i+1) + ": ");
			String title = scan.nextLine();

			System.out.println("Enter the Author of the Book #"+(i+1)+ ": ");
			String author = scan.nextLine();

			System.out.println("Enter the Price of the Book #"+(i+1)+ ": ");
			double price = scan.nextDouble();
			System.out.println("---------------------------------------");
			myCollection.addBook(new BookCollection(title , author , price));
		}

		System.out.println("\n-----Listing All books------");
		myCollection.listBooks();

		System.out.println("\n-----Searching for book by an author name!------");
		System.out.println("Enter the name of the author for search: ");
		String search = scan.nextLine();
		myCollection.searchByAuthor(search);
	}
}
