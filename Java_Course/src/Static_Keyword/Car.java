package Static_Keyword;

 class StaticData {
	 static int carCount = 0;
	 String model;

	 public StaticData(String model) {
		 this.model = model;
		 carCount++;
	 }

	 public void display() {
		 System.out.println("Car Model: " + model);
	 }

	 static void displayInfo() {
		 System.out.println("Total Cars: " + carCount);
	 }

 }
public class Car{
		public static void main(String[] args) {
			StaticData car1 = new StaticData("Toyota");
			StaticData car2 = new StaticData("honda");

			car1.display();
			car2.display();

			StaticData.displayInfo();
		}
	}

