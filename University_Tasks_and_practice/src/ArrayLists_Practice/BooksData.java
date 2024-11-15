package ArrayLists_Practice;

public class BooksData {
	private String title;
	private String author;
	private double price;

	public BooksData(String tt , String au , double pr){
		this.title = tt;
		this.author = au;
		this.price = pr;
	}
	public void setTitle(String t){
		title = t;
	}
	public void setAuthor(String a){
		author = a;
	}
	public void setPrice(double p){
		price = p ;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
}
