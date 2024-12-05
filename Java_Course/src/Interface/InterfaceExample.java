package Interface;
interface Flyable{
	void fly();
	default void takeoff(){
		System.out.println("Preparing for takeoff...");
	}
}
class Bird implements Flyable{
	public void fly(){
		System.out.println("Bird is Flying");
	}
}
class Airplane implements Flyable{
	public void fly(){
		System.out.println("Airplane is flying.");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Flyable bird = new Bird();
		bird.takeoff();
		bird.fly();

		Airplane plane = new Airplane();
		plane.takeoff();
		plane.fly();
	}
}
