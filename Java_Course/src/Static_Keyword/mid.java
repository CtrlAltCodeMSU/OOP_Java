package Static_Keyword;
import java.util.*;

class p {
	public Set<String> splitString(String n) {
		String[] words = n.split(" ");
		HashSet<String> newList = new HashSet<>(Arrays.asList(words));
		return newList;
	}
}
public class mid {
	public static void main(String[] args) {
		p obj = new p();
		String name = "My name is Sana Ullah my";
//		Set<String> unique = obj.splitString(name);
		Set<String> uni = obj.splitString(name);
		System.out.println(uni);
		}
   }
