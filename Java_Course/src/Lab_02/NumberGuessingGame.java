package Lab_02;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = new Random().nextInt(100+1);
		int numberGuessed = 0 ;
		boolean won = false ;

		while(numberGuessed < 10){
			System.out.println("Please Enter the Number between 1 and 100");
			System.out.println("---------Enter Your guess # " + (1+numberGuessed)+ "-----------");
			int userGuess = sc.nextInt();
			numberGuessed++;

			if (userGuess==randomNumber){
				won = true ;
				break;
			} else if (userGuess<randomNumber) {
				System.out.println("Your Number is Small According to The Random Number Generated, Try Again!");
			}else {
				System.out.println("Your Number is Large According to The Random Number Generated, Try Again!");
			}
		}
		if (won){
			System.out.println("Congratulation! You Guessed The Correct Number. \n The number is: "+ randomNumber);
		}
		else {
			System.out.println("Sorry You lost all your attempts! \n The correct Number was: "+randomNumber);
		}
	}
}
