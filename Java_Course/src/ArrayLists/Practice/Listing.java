package ArrayLists.Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Listing {
	ArrayList<String> list = new ArrayList<>();

	public void addElements(){
		Scanner scan = new Scanner(System.in);
		int listSize = 5 ;
		System.out.println("Please Enter " + listSize + " Book Names:");
		for (int i = 0 ; i < listSize ; i++){
			System.out.println("-----Elements #" + (i+1) + "------");
			String element = scan.nextLine();
			Book book = new Book(element);
			list.add(book.getName());
		}
	}
public ArrayList<String> getList(){
		return list;
}
}
