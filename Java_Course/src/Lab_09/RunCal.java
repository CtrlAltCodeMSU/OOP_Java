package Lab_09;

//public class RunCal {
//	public static void main(String[] args) {
//		Calculator my = new Calculator();
//		System.out.println(my.add(2 ,3));
//		System.out.println(my.add(2 , 5 , 5 ));
//		System.out.println(my.add(2.5f ,3));
//		System.out.println(my.add(2.5f ,3.6f));
//		System.out.println(my.add(2 , 3.5f));
//	}
//}
public class RunCal {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;

		// This will cause an ArithmeticException at runtime
		System.out.println("Result: " + (num1 / num2));

		System.out.println("This line won't execute.");
	}
}

