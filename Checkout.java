import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Checkout{
	private final List<String> productName = new ArrayList<>();
	private final List<Integer> quantity = new ArrayList<>();
	private final List<Double> price = new ArrayList<>();
	private final List<Double> total = new ArrayList<>();
	private  double discountPercentage;
	private  double amountPaid;
	private  double subTotal;
	private  double discountedPrice;
	private  double vat;
	private  double billTotal;
	private  double balance;
	private  String cashierName;
	private String customerName;
	Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args){
		Checkout checkout = new Checkout();
		checkout.collectInput();
		checkout.calculateTotalForEachProduct();
		checkout.calculateSubTotal();
		checkout.calculateDiscount();
		checkout.calculateVat();
		checkout.calculateBillTotal();
		checkout.printReceipt();
		checkout.calculateBalance();
		checkout.printReceipt1();


	}
	public void collectInput(){
		System.out.println("What is the customer name");
		customerName = scanner.nextLine();
	
		System.out.println("What did the user buy");
		String name = scanner.nextLine();
		productName.add(name);
	
		System.out.println("How many pieces?");
		int pieces = scanner.nextInt();
		quantity.add(pieces);

		System.out.println("How much per unit?");
		double unitPrice = scanner.nextDouble();
		price.add(unitPrice);
	

		System.out.println("Add more item?");
		scanner.nextLine();
		String status = scanner.nextLine();

		while(status.equalsIgnoreCase("yes")){
			System.out.println("What did the user buy?");
			name = scanner.nextLine();
			productName.add(name);
	
			System.out.println("How many pieces?");
			pieces = scanner.nextInt();
			quantity.add(pieces);

			System.out.println("How much per unit?");
			unitPrice = scanner.nextDouble();
			price.add(unitPrice);

			System.out.println("Add more item?");
			scanner.nextLine();
			status = scanner.nextLine();
		}
	System.out.println("What is your name?");
	cashierName = scanner.nextLine();

	System.out.println("How much discount will he/she get?");
	discountPercentage = scanner.nextDouble();
		
	}

	public void calculateTotalForEachProduct(){
		for(int index = 0; index < quantity.size(); index++){
			double totalPrice = price.get(index) * quantity.get(index);
			total.add(totalPrice);

		}
	}

	public void calculateSubTotal(){
		for(int index = 0; index < total.size(); index++){
			subTotal += total.get(index);
		}
	}

	public void calculateDiscount(){
		discountedPrice = (discountPercentage / 100) * subTotal;
	}

	public void calculateVat(){
		vat = (17.50 / 100) * subTotal;
	}

	public void calculateBillTotal(){
		billTotal = subTotal - discountedPrice + vat;
	}

	public void calculateBalance(){
		System.out.println("How much did the custom give to you?");
		amountPaid = scanner.nextDouble();
		balance = amountPaid - billTotal;	
	}
	
	public void printReceipt(){
		System.out.printf("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS.\nTEL: 03293828343\nDate: 18-Dec-22 8:40:11 pm\nCashier: %s%nCustomer Name: %s%n",cashierName, customerName);
		System.out.println("""
		====================================
		ITEM\tQTY\tPRICE\tTOTAL(NGN)
		====================================
		""");
		for(int index = 0; index < productName.size(); index++){
			System.out.printf("%s\t%d\t%.2f\t%.2f%n",productName.get(index), quantity.get(index), price.get(index), total.get(index));
		}
		System.out.printf("""
		--------------------------------------
			    Sub total: %.2f

		            Discount: %.2f

			    VAT @ 17.50%%: %.2f
		======================================%n""",subTotal, discountedPrice, vat);
	}

	public void printReceipt1(){

		System.out.printf("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS.\nTEL: 03293828343\nDate: 18-Dec-22 8:40:11 pm\nCashier: %s%nCustomer Name: %s%n",cashierName, customerName);
		System.out.println("""
		====================================
		ITEM\tQTY\tPRICE\tTOTAL(NGN)
		====================================
		""");
		for(int index = 0; index < productName.size(); index++){
			System.out.printf("%s\t%d\t%.2f\t%.2f%n",productName.get(index), quantity.get(index), price.get(index), total.get(index));
		}
		System.out.printf("""
		--------------------------------------
			    Sub total: %.2f

		             Discount: %.2f

			VAT @ 17.50%%: %.2f
		======================================%n""",subTotal, discountedPrice, vat);
		System.out.printf("""
			  Bill Total: %.2f 
	
			 Amount Paid: %.2f
			     Balance: %.2f%n""",billTotal, amountPaid, balance);
		System.out.println("""
		=======================================

		THANKS YOU FOR YOUR PATRONAGE

		=======================================
		""");


	}









}
