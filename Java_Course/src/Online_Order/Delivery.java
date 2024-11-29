package Online_Order;

 abstract class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void login() {
		System.out.println(name + "Login Successfully");

	}
	abstract void performRole();
}
	class Customer extends User {
		public Customer(String name){
			super(name);
		}
		void performRole(){
			System.out.println("Customer is browsing");
		}
	}

	class DeliveryPartner extends User {
		public DeliveryPartner(String name){
			super(name);
		}

		void performRole(){
			System.out.println("he is delivering food");
		}
	}
	class Admin extends User{
	public Admin(String name){
		super(name);
	}
	public void performRole(){
		System.out.println("Admin is managing the system");
	}
}
public class Delivery{
	public static void main(String[] args) {
		User customer = new Customer("Alice");
		User delivery = new DeliveryPartner("Bob");
		User Admin = new Admin("Charlie");

		customer.login();
		customer.performRole();

		delivery.login();
		delivery.performRole();

		Admin.login();;
		Admin.performRole();
	}
}