import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		int total = 1;
		for(int input = number; input > 0; input--){
			total *= input;
		}
		System.out.print(total);	

	}



}