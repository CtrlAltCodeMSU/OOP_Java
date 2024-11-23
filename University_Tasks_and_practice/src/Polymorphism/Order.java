package Polymorphism;
class PizzaOrder{
	void orderPizza(){
		System.out.println("Ordering a Plain Pizza");
	}

	void orderPizza(String topping) {
		System.out.println("Ordering a Pizza with " + topping);
	}
	void orderPizza(String topping1 , String topping2){
		System.out.println("Ordering a pizza with " + topping1 + " and " + topping2);
	}
}

public class Order {
	public static void main(String[] args) {
		PizzaOrder myOrder = new PizzaOrder();
		myOrder.orderPizza();
		myOrder.orderPizza("Mushrooms");
		myOrder.orderPizza("Olives", "Cheese");
	}
}
