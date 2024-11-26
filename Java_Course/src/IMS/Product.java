public class Product {
	private int productId;
	private String name;
	private double price;
	private int quantity;
	private String category;

	public Product(int productId, String name, double price, int quantity, String category) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "ID: " + productId + ", Name: " + name + ", Price: $" + price + ", Quantity: " + quantity + ", Category: " + category;
	}
}
