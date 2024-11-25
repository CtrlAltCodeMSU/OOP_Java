package Lab_01;

import java.sql.Struct;

public class Author {
	String name;
	String email;

	public Author(String n, String m) {
		this.name = n;
		this.email = m;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public boolean updateEmail(String newEmail) {
		if (newEmail != null && !newEmail.isEmpty()) {
			this.email = newEmail;
			return true;
		}
		else{
			return false;
		}
	}

	public void a_display(){
		System.out.println("Author Name: "+ name);
		System.out.println("Author Email: "+email);
	}
}
