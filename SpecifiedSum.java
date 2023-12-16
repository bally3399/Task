import java.util.Scanner;

public class SpecifiedSum{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		int number1 = 10;
		int sum = 0;
		while(true){
			if(number == number1 || number > number1){
				System.out.println("Successful");
				sum += number;
				break;
			}
			else{
				System.out.print("Enter number: ");
				number = scanner.nextInt();

			}
		}
	 
	}


}