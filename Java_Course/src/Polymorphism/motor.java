package Polymorphism;
class vehicle{
	void run(){
		System.out.println("Vehicle is Running");
	}
}
class Bike extends vehicle{
	@Override
	void run(){
		System.out.println("Bike is Running");
	}
}

public class motor {
	public static void main(String[] args) {
		vehicle myVehicle = new Bike();
		myVehicle.run();
	}
}
