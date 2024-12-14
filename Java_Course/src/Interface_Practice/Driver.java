package Interface_Practice;

public class Driver {
	public static void main(String[] args) {
		Stats s = new Stats();
		Person p1 = new Person(19 , "Ahmad");
		Person p2 = new Person(20 , "Ali");

		if (s.isGreater(p1,p2)) {

			System.out.println(STR."\{p1.getName()} is greater than \{p2.getName()}");
		}else {
				System.out.println(STR."\{p2.getName()} is greater than \{p1.getName()}");
		}
	}
}
