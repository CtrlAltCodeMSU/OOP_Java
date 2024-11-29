package write;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class write1 {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("newFile.txt");
			writer.write("Hello My name is Sana Ullah i am learning java");
			writer.close();
			System.out.println("Data read successful");
		} catch (IOException e){
			System.out.println("Error!");
			e.printStackTrace();
		}
	}
}
