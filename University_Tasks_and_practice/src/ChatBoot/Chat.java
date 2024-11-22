package ChatBoot;
import java.util.HashMap;
import java.util.HashSet;
class Bots{
	public String generateResponse(HashSet<String> words){
		if (words.contains("hello")){
			return "Hi there! How can i help you?";
		} else if (words.contains("bye")) {
			return "Goodbye! have a nice day!";
		} else {
			return "I am not sure how to respond to this!";
		}
	}
}
public class Chat {
	public static void main(String[] args) {
		Bots cht = new Bots();
		HashSet<String> user = new HashSet<>();
		user.add("hello");
		String response = cht.generateResponse(user);
		System.out.println(response);
	}
}
