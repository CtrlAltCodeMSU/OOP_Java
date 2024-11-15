package ArrayLists.Author;

public class BookCollection{
	private String name;
	private String title;
	private double price;

	public BookCollection(String n, String t, double p) {
		this.name = n;
		this.title = t;
		this.price = p;
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setTitle(String tt) {
		title = tt;
	}

	public void setPrice(double pr) {
		price = pr;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
//
//	public void displayDetail(){
//		System.out.println("");
//	}
}
