import java.util.Scanner;

public class Item{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter item name: ");

	String itemName = input.next();

	System.out.print("Enter item price: ");

	int itemPrice = input.nextInt();

	double discountPrice = 0.1 * itemPrice;

	System.out.printf("the discountPrice is:  %.2f%n", discountPrice);

	double price1 = itemPrice - discountPrice;

	System.out.printf("the total amount is:  %.2f%n", price1);





	}





}