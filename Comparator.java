import java.util.Scanner;

public class Comparator{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter second number");
		int secondNumber = scanner.nextInt();

		if(firstNumber == secondNumber){
			System.out.println("0");
		}
		if(firstNumber > secondNumber){
			System.out.println("1");
		}
		if(secondNumber > firstNumber){
			System.out.println("-1");
		}
	}


}