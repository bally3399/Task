import java.util.Scanner;

public class Multiplication1{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number:");
	int number = input.nextInt();

	int count = 1;
	while(count <= 12){
		int result = number * count;
		System.out.printf("%d * %d = %d%n", number, count, result);
	count ++;
	}



}


}