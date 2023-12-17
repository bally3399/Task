import java.util.Scanner;

public class DanglingElse{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First number");
		int num1 = scanner.nextInt();
	
		System.out.print("Enter second number");
		int num2 = scanner.nextInt();
	
		if(num1 > 5) {
			if(num2 > 5) {
			System.out.println("x and y are greather than 5");
			}
		}else{
			System.out.println("x and y are less than 5");
		}

	}


}