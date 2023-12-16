import java.util.Scanner;

public class TaxCalculator{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter tax rate: ");
		int taxRate = scanner.nextInt();
		int total = 0;
		int count = 0;
		while(taxRate != -1){
			total += taxRate * 0.15;
			count++;
			System.out.print("Enter	tax rate: ");
			taxRate = scanner.nextInt();
		} 		
		double totalTaxRate = total * 0.2;
		System.out.println(totalTaxRate);
		


	

	}



}