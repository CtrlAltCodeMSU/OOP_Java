package Abstract_Class;
abstract class shape{
	abstract void draw();
		void display(){
			System.out.println("This is Shape");
		}
}
class circle extends shape{
	void draw(){
		System.out.println("Drawing a Circle");
	}
}
public class Abstract {
	public static void main(String[] args) {
		shape myShape = new circle();
		myShape.display();
		myShape.draw();
	}
}
