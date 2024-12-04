public class Main{
    public static void main(String[] args){
        Mammals dog = new Dog();
        dog.breathe();
        dog.eat();
        dog.giveBirth();
        
        FlightlessBirds penguin = new Penguin();
        penguin.breathe();
        penguin.fly();
        penguin.walk();
    }
}