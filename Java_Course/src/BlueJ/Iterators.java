package BlueJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Iterators {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		Scanner scan =  new Scanner(System.in);

		for (int i = 0 ; i <= 4 ; i++){
			System.out.println("Add fruit no: " + (i+1));
			String fruit = scan.nextLine();
			fruits.add(fruit);
		}
		Iterator<String> iter = fruits.iterator();

		while(iter.hasNext()){
			String f = iter.next();

			System.out.println(f);
		}
	}
}
