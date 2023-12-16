import java.util.Scanner;

public class GasMileage{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter numbers of trip: ");
		int trip = scanner.nextInt();
		int totalMilesDriven = 0;
		int totalGallonUsed = 0;

		while(trip !=-1){
			System.out.println("Enter numbers of miles: ");
			double miles = scanner.nextDouble();

			System.out.println("Enter numbers of gallons: ");
			double gallons = scanner.nextDouble();
	
			totalMilesDriven += miles;
			totalGallonUsed += gallons;

			double milesPerGallon = miles / gallons;
			System.out.println(milesPerGallon);

			System.out.println("Enter numbers of trip: ");
			trip = scanner.nextInt();
		}
		int totalMilesPerGallon = totalMilesDriven / totalGallonUsed;
		System.out.printf("total miles per gallon is: %d", totalMilesPerGallon); 


	}


}