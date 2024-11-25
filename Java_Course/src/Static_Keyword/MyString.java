package Static_Keyword;

public class MyString {
	 String name;
	public MyString(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		MyString s = new MyString("ABCABC");

		String original = "ABCABC" ;
//		original.toLowerCase();
//		System.out.println(original.toLowerCase());

		System.out.println(original.replace("ABCABC" , "aBCABC"));
	}
}
