package Static_Keyword;
class MyClass {
	static MyClass ref;
	MyString[] argument;

	public static void main(MyString[] args) {
		ref = new MyClass();
		ref.past(args);
		System.out.println(java.util.Arrays.toString(ref.argument));
	}

	public void past(MyString[] args) {
		ref.argument = args ;
	}
}