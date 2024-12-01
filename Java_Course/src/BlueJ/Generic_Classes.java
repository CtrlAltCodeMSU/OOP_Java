package BlueJ;

public class Generic_Classes<T> {
	private T value;

	public Generic_Classes(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Generic_Classes<Integer> integerBox = new Generic_Classes<>(123);
		Generic_Classes<String> StringBox = new Generic_Classes<>("my name is Sana Ullah");

		System.out.println("Integr Box Contains: " + integerBox.getValue());

		System.out.println("String Box Contains: " + StringBox.getValue());
	}
}
