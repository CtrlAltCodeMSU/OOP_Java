package Lab_03;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsCount_1 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Enter file name in Command Prompt for Run");
		}

		File file = new File(args[0]);
		int wordcount = 0;

		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] words = line.split("\\s+");
				wordcount += words.length;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
