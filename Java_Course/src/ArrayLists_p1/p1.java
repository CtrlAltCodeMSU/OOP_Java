package ArrayLists_p1;
import java.util.ArrayList;
import java.util.Scanner;
public class p1 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		int size = 10 ;
		Scanner input = new Scanner(System.in);
		for (int i = 0 ; i <= size ; i++){
			System.out.println("Enter fruit #"+ (i+1) +": ");
			String enter  = input.nextLine();
			fruits.add(enter);
		}
		System.out.println("Entered fruits are: ");
		for (String myFruits : fruits){
			System.out.println(myFruits);
		}
	}
}
