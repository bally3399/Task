import java.util.Scanner;

public class LimitCalculator{

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Account number: ");
		String accountNumber = scanner.nextLine();

		System.out.print("Enter Balance at the beginning of the month: ");
		int balanceAtBeginning = scanner.nextInt();

		System.out.print("Enter total of all items charged: ");
		int charges = scanner.nextInt();

		System.out.print("Enter total of all credit applied");
		int credit = scanner.nextInt();

		System.out.print("Enter allowed credit limit");
		int limit = scanner.nextInt();

		int balance = balanceAtBeginning + charges;

		int newBalance = balance - credit;
		if(newBalance < limit){
			System.out.println("Credit limit exceeded");
		}
		else{
			System.out.println(newBalance);
		}

	}


}