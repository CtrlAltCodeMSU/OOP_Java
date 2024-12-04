package Interface;
interface myAnimal{
	void sound();
}
interface living{
	void breath();
}
class Dog implements myAnimal , living {
	public void sound(){
		System.out.println("Bark");
	}
	public void breath(){
		System.out.println("Breathing.....");
	}
}
public class NewAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.breath();
	}
}
