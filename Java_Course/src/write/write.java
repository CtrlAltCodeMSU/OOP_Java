package write;
import java.io.FileWriter;
import java.io.IOException;
public class write {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("example.txt");
			writer.write("Hello this is written by me Muhammad Sana Ullah using fileWriter. \nFile Handling in Java is easy!");
			writer.close();
		}
		catch (IOException e){
			System.out.println("An Error Occurred");
			e.printStackTrace();
		}
	}
}
