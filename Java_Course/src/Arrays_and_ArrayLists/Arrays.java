package Arrays_and_ArrayLists;

import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] hours = new int[4];
		System.out.println("Enter the number of hours worked by employees: ");

		for (int index = 0 ; index < 4 ; index++){
			System.out.println("Employee "+ (index+1) + ": " );
			hours[index] = keyboard.nextInt();
		}
		System.out.println("The Hours you entered: ");

		for (int index = 0 ; index<4 ; index++){
			System.out.println(hours[index]);
		}
	}
}
