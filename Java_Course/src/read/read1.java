package read;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class read1 {
	public static void main(String[] args) {
		try {
			File readFile = new File("newFile.txt");
			Scanner newRead = new Scanner(readFile);
			while (newRead.hasNextLine()){
				String data = newRead.nextLine();
				System.out.println(data);
			}
			newRead.close();
		} catch (FileNotFoundException e){
			System.out.println("File Not found!");
			e.printStackTrace();
		}
	}
}
