package Lab_03;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class FileWordsCount {
	public static void main(String[] args) {
		String filepath = "D:\\IntellliJIdea\\UniversityTaska and Practices\\src\\Lab_03\\expense.txt" ;
		try {
			File file = new File(filepath);
			Scanner fileScan = new Scanner(file);
			int wordCount = 0 ;

			while (fileScan.hasNextLine()){
				String line = fileScan.nextLine();
				String words[] = line.split("\\s+");
				wordCount += words.length;
			}
			System.out.println("Total Words: " + wordCount);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found: " + e.getMessage());
		}
	}
}
