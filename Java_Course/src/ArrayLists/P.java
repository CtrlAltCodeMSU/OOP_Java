package ArrayLists;
import java.util.ArrayList;
public class P {
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<>();

		myArray.add(1);
		myArray.add(3);
		myArray.add(5);
		myArray.add(7);
		System.out.println("My Original List is: " + myArray);

		myArray.add(1 , 4);
		System.out.println(myArray);

	}
}
