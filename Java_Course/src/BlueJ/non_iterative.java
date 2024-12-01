package BlueJ;
import java.util.Scanner;
public class non_iterative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;

		System.out.println("Enter 'exit' to stop: ");
		while(true){
			input = scan.nextLine();
			if (input.equalsIgnoreCase("exit")){
				break;
			}
			System.out.println("you Entered: " + input);
		}
		System.out.println("Exited the loop....");
	}
}
