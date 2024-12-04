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
}
public class animal {
}
