package ChatBot;
import java.util.HashSet;
import java.util.Scanner;
public class Input {

	public HashSet<String> getInput(){
		HashSet<String> keywords = new HashSet<String>();
		Scanner kb = new Scanner(System.in);
		String key = kb.nextLine();
		String[] array = key.split(" ");

		for (String words : array){
			keywords.add(words);
		}
		return (keywords);
	}
}
