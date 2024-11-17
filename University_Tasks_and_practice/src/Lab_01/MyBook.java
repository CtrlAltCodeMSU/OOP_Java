package Lab_01;

public class MyBook {
	public static void main(String[] args) {

//		Book b1 = new Book("C++" , "Tonny Gaddis" , 25.0 , 10);
//		Book b2 = new Book("C++" , "Tonny Gaddis" , 25.0 , 10);
//		Book b3 = new Book("C++" , "Tonny Gaddis" , 25.0 , 10);
//		Book b4 = new Book("C++" , "Tonny Gaddis" , 25.0 , 10);

		Author author = new Author("Tonny" , "@tonny@gmail");
		Author author2 = new Author("Tauseef" , "@tauseef@google");

//		b1.display();
//		b2.display();
//		b3.display();
//		b4.display();
//
//
//		Book[] books = {b1 , b2 ,b3 ,b4};
//		for (int i = 0 ; i < books.length ; i++){
//			System.out.println("-----------Book #" + (i+1)+"------------");
//			books[i].display();
//		}
		Author a1 = new Author("Tonny Gaddis" , "tonnygaddis@gmail.com");
		Author a2 = new Author("Tauseef Iftikhar" , "tauseefiftikhar@gcu.edu.pk");
		a1.a_display();
		a2.a_display();

	}
}
