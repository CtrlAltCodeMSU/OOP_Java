public class exception {
	public static void main(String[] args) {
		try {
			int num = 10 ;
			int denum = 0 ;
			int result = num/denum;
			System.out.println("Result" + result);
		}
		catch (ArithmeticException e){
			System.out.println("Division by zero is not Allowed");
		} finally {
			System.out.println("Execution Completed!");
		}
	}
}
