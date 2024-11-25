package Lab_01;

public class Book {
	String title;
//	String author;
	Author author;
	double price;
	int quantity;

	public Book(String name , Author author , double price , int quantity){
		this.title = name ;
		this.author = author ;
		this.price = price ;
		this.quantity = quantity;
	}
	public void setTitle(String title){
		this.title = title ;
	}
	public void setAuthor(Author author){
		this.author = author;
	}
	public void setPrice(double price){
		this.price = price ;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public String getTitle(){
		return title;
	}
	public Author getAuthor(){
		return author;
	}
	public double getPrice(){
		return  price;
	}
	public int getQuantity(){
		return  quantity;
	}

	public void display(){
		System.out.println("Book Title: "+ title);
		System.out.println("Author Name: "+ author.getName());
		System.out.println("Book Price: "+ price);
		System.out.println("Total Quantities: "+ quantity);
	}

}
