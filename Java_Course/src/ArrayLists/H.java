package ArrayLists;
import java.util.HashSet;
public class H {
	public static void main(String[] args) {
		HashSet<Integer> mySet = new HashSet<>();

		mySet.add(1);
		mySet.add(5);
		mySet.add(3);
		mySet.add(9);
		System.out.println(mySet);

		mySet.remove(5);
		System.out.println(mySet);
	}
}
