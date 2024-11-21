package Lab_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsCount {
	public static void main(String[] args) {
		if (args.length==0){
			System.out.println("Please provide a file name as a command line argument");
			return;
		}

		File file = new File(args[0]);
		int wordcount = 0;

		try {
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()){
				String line = scan.nextLine();
				String []words = line.split("\\s+");

				wordcount += words.length ;
			}
			System.out.println("Total number of Words: " + wordcount);
		}
		catch (FileNotFoundException e){
			System.out.println("File not Found!");
			e.printStackTrace();
		}
	}
}
