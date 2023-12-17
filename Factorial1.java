import java.util.Scanner;

public class Factorial1{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int userInput = scanner.nextInt();
		double result = value(userInput);
		System.out.printf("%3f\n", result);
		
	}
	public static int factorial(int number){
		int total = 1;
			for(int input = number; input > 0; input--){
				total *= input;
			}
		return total;
	}
	

	public static double value(int number){
		double value = 1;
		for(int index = 1; index <= number; index++){
			value += (double) 1 / factorial(index);
		}
		return value;
	}
	

}