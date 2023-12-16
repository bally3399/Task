import java.util.Scanner;

public class Validating{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number");
		int number = scanner.nextInt(); 
		while(true){
			if(number == 1 || number == 2){
				System.out.println("Successful");
				break;
			}
			else{
				System.out.print("Enter number");
				number = scanner.nextInt();

			}
		}
	}


}