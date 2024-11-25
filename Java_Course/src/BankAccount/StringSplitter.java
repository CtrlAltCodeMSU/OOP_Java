package BankAccount;
import java.util.HashSet;
import java.util.Set;

public class StringSplitter {

	public static Set<String> splitString(String statement) {
		// Create a HashSet to store unique words
		Set<String> uniqueWords = new HashSet<>();

		// Split the statement into words using whitespace as a delimiter
		String[] words = statement.split("\\s+");

		// Add each word to the HashSet (duplicates will automatically be ignored)
		for (String word : words) {
			uniqueWords.add(word);
		}

		return uniqueWords;
	}

	public static void main(String[] args) {
		// Example usage
		String statement = "This is a test. This test is only a test.";
		Set<String> result = splitString(statement);

		System.out.println("Unique words: " + result);
	}
}
