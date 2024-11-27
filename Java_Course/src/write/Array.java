package write;
import java.io.FileWriter;
import java.io.IOException;
public class Array {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70};

		try (FileWriter writer = new FileWriter("output.txt")){
			for (int number : numbers){
				writer.write(number + "\n");
			}
			System.out.println("Data Successfully written!");
		} catch (IOException e){
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	}
}
