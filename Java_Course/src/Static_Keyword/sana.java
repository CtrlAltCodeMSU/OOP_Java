package Static_Keyword;


public	class sana {
		// Default constructor
		public sana() {
			System.out.println("Default constructor called.");
		}

		// Parameterized constructor
		public sana(int value) {
			this(); // Calling the default constructor
			System.out.println("Parameterized constructor called with value: " + value);
		}

		public static void main(String[] args) {
			sana obj = new sana(10); // Create an object using the parameterized constructor
		}
	}
