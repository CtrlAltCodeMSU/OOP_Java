package Lab_09;
interface Habitable{
	void Livein();
}
interface Moveable {
	void move();
}
class Caravan implements Habitable , Moveable{
	public void Livein(){
		System.out.println("We can live in the house as well!");
	}
	public void move(){
		System.out.println("We can also move from one place to another");
	}
}
public class CaravanTest {
	public static void main(String[] args) {
		Caravan myCaravan  = new Caravan();
		System.out.println("Testing habitable class");
		myCaravan.Livein();
		System.out.println("Testing moveable class");
		myCaravan.move();
	}

}
