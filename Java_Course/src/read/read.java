package read;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class read {
	public static void main(String[] args) {
		try {
			File myfile = new File("example.txt");
			Scanner myRead = new Scanner(myfile);
			while (myRead.hasNextLine()){
				String data = myRead.nextLine();
				System.out.println(data);
			}
			myRead.close();
		} catch (FileNotFoundException e){
			System.out.println("An Error Occured!");
			e.printStackTrace();
		}
	}


}
