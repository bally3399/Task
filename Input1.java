import java.util.Scanner;

public class input1{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter userInput");

	int userInput = scanner.nextInt();
	int userInput1 = userInput * 1;
		if(userInput >= 0){
		  System.out.printf("userInput is %d%n", userInput1);
		}
		if(userInput <= 0 * -1){
		  System.out.printf("userInput is %d%n", userInput1*-1);
		}





	}




}