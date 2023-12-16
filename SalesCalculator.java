import java.util.Scanner;

public class SalesCalculator{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter item value: ");
		double item = scanner.nextDouble();
		int count = 0;
		double total = 0;
		while(item != -1){
			total += item;
			count++;
			System.out.print("Enter item value: ");
			item = scanner.nextDouble();

		}
		double amountEarned = total * 0.09;
		double amountEarned1 = amountEarned + 200;
		System.out.println(amountEarned1);
	}

}