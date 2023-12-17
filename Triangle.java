import java.util.Scanner;

public class Triangle{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of your triangle: ");
		int length = scanner.nextInt();

		for(int index = 1; index <= length; index++) {
			for(int input = 1; input <= index; input++) {
			System.out.print("* ");
			}
		System.out.println();
		}
	}


}