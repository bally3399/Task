import java.util.Scanner;

import java.util.Arrays;

import java.lang.*;

public class CreditCard{

	private String numbers;
	private String cardType;
	private int cardNumberLength;
	private int[] array;
	private String status;
	

	public static void main(String[] args){
		CreditCard creditCard = new CreditCard();
		creditCard.collectInput();
		creditCard.stringToArray();
		creditCard.multiplyAtEvenIndex();
		creditCard.totalOfIndexes();
		creditCard.printResult();


	}

	public void collectInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, Kindly Enter Card details to verify");
		numbers = scanner.nextLine();
		verifyLength();
		verifyCreditCard();

	}
	public void verifyLength(){
		if (numbers.length() < 13 || numbers.length() > 16){
			System.out.print("Valid card");
			System.exit(0);
		}
		cardNumberLength = numbers.length();
	}
	public void verifyCreditCard(){
		if(numbers.startsWith("4")){
			cardType = "Visa Cards";		
		}

		else if(numbers.startsWith("5")){
			cardType = "MasterCard";
		}

		else if(numbers.startsWith("37")){
			cardType = "American Express Cards";			
		}

		else if(numbers.startsWith("6")){
			cardType = "Discover Cards";			
		}
		else {
			System.exit(0);
		}
		array = new int[numbers.length()];
	}
	public void stringToArray(){
		for(int index = 0; index < numbers.length(); index++){
			array[index] = Integer.parseInt(String.valueOf(numbers.charAt(index)));
		}
}

	public void multiplyAtEvenIndex(){
		int total = 0;
		for(int index = array.length - 2; index >= 0; index -= 2){
			total = array[index] * 2;

			if (total < 10){
				array[index] = total;
			}
			else {
				int firstDigit = total / 10;
				int secondDigit = total % 10;
				total = firstDigit + secondDigit;
				array[index] = total;	
			}
		}
		

		
	}
	public void totalOfIndexes(){
		int firstTotal = 0;
		for(int index = numbers.length() - 2; index >= 0; index -= 2){
			firstTotal += array[index];
			
		}
		int secondTotal = 0;
		for(int index = numbers.length() - 1; index >= 0; index -= 2){
			secondTotal += array[index];
		}
		int result = firstTotal + secondTotal;

		if (result % 10 == 0){										
			status = "Valid";
		}
		else {
			status = "Invalid";
		}
	}
	


	public void printResult(){
		System.out.println("*************************************************");
		

		System.out.printf("""
		
		**Credit Card Type: %s

		**Credit Card Number: %s

		**Credit Card Digit Length: %d

		**Credit Card validity Status: %s%n""", cardType, numbers, cardNumberLength, status  
		);
		System.out.println("************************************************");

		
	}

}




