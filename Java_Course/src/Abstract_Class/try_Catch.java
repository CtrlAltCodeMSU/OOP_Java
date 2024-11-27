package Abstract_Class;
public class try_Catch {
	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		try {
			System.out.println(numbers[1]);
		} catch (Exception e){
			System.out.println("Index is not available");
		} finally {
			System.out.println("Try catch is finished");
		}
	}
}
