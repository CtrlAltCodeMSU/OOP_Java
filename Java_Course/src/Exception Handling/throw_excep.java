public class throw_excep {
	public static void checkAge(int age){
		if (age < 18){
			throw new IllegalAccessError("Age must be greater than 18");
		}
		System.out.println("Valid age: " + age);
	}
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (IllegalAccessError e){
			System.out.println("Caught" + e.getMessage());
		}
	}
}
