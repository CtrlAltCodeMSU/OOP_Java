package Interface;
interface Animal {
	public void animalSound();
	public void sleep();
}
class cat implements Animal{
	public void animalSound(){
		System.out.println("Cat Says: " + "meow meow");
	}
	public void sleep(){
		System.out.println("Zzz");
	}
}
public class inter {
	public static void main(String[] args) {
		cat myCat = new cat();
		myCat.animalSound();
		myCat.sleep();
	}
}
