package Lab_09;

public class RunCal {
	public static void main(String[] args) {
		Calculator my = new Calculator();
		System.out.println(my.add(2 ,3));
		System.out.println(my.add(2 , 5 , 5 ));
		System.out.println(my.add(2.5f ,3));
		System.out.println(my.add(2.5f ,3.6f));
		System.out.println(my.add(2 , 3.5f));
	}
}
