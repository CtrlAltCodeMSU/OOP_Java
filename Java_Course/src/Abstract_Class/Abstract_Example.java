package Abstract_Class;
abstract class Animal {
	String name;

	Animal(String name){
		this.name = name ;
	}
	abstract void sound();

	void eat(){
		System.out.println(name + " is eating");
	}
}
class Dog extends Animal {
	Dog(String name){
		super(name);
	}
	void sound() {
		System.out.println(name + " barks.");
	}
}
class Cat extends Animal {
	Cat(String name) {
		super(name);
	}
	void sound(){
		System.out.println(name + " meows.");
	}
}
public class Abstract_Example {
	public static void main(String[] args) {
	Animal dog = new Dog("Buddy");
	dog.eat();
	dog.sound();

	Animal cat = new Cat("Sprinkle");
	cat.eat();
	cat.sound();
	}
}
