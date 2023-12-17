import java.util.Scanner;

public class DanglingProblem{

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number");
		int num1 = scanner.nextInt();

		System.out.print("Enter second number");
		int num2 = scanner.nextInt();

		if(num1 < 10){
			if(num2 > 10){
			System.out.println("*****");
			}
		}
		else{
			System.out.println("#####");
			System.out.println("$$$$$");
		}
	}



}