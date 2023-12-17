import java.util.Scanner;

public class PatternOfAstericks{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number");
		int number = scanner.nextInt();
		for (int row = 0; row < number; row++){

			for (int column = 0; column < number; column++){
				if(row %2 == 0){
					System.out.print("* ");
					System.out.print(" ");
				}
				else{
					System.out.print(" ");
					System.out.print("* ");
				}
			}
				
			System.out.println();

		}
		
	}




}