import java.util.Scanner;

public class Factorial2{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int userInput = scanner.nextInt();
		double result = valuePowered1(userInput);
		System.out.printf("%4f\n", result);
		
	}
	public static int factorial(int number){
		int total = 1;
			for(int input = number; input > 0; input--){
				total *= input;
			}
		return total;
	}
	

	public static double valuePowered1(int number){
		double valuePowered = 0;
		double valuePowered1 = 1;
		for(int index = 1; index <= number; index++){
			valuePowered += Math.pow(number, index);
			valuePowered1 = valuePowered / (double) factorial(index);
			System.out.println(valuePowered);
		}
		return valuePowered1;
	}


}