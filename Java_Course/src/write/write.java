package write;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class write {
	public static void main(String[] args) {
		try {
			File file = new File("example.txt");
			FileWriter writer = new FileWriter(file);
			writer.write("Hello this is written by me Muhammad Sana Ullah using fileWriter. \nFile Handling in Java is easy!");
			writer.close();
			System.out.println("Data Successfully written to the file : " + file.getName() );
		}
		catch (IOException e){
			System.out.println("An Error Occurred");
			e.printStackTrace();
		}
	}
}
