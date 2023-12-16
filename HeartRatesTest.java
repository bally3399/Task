import java.util.Scanner;
import java.time.LocalDate;

public class HeartRatesTest{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		HeartRates heartRates = new HeartRates(null, null, null);

		System.out.print("Enter firstName: ");
		String firstName = scanner.nextLine();
		heartRates.setFirstName(firstName);

		System.out.print("Enter lastName: ");
		String lastName = scanner.nextLine();
		heartRates.setLastName(lastName);

		System.out.print("Enter year of Birth: ");
		int year = scanner.nextInt();

		System.out.print("Enter month of Birth: ");
		int month = scanner.nextInt();

		System.out.print("Enter day of Birth: ");
		int day = scanner.nextInt();
		LocalDate dateOfBirth = LocalDate.of(year, month, day);

		heartRates.setDateOfBirth(dateOfBirth);
		heartRates.year();
		heartRates.maximumHeartRate();

		/*System.out.print("Enter maximum heart rate");
		int maximumHeartRate = scanner.nextInt();
		heartRates.rate(maximumHeartRate);*/

		System.out.printf("Name: %s %s%n", heartRates.getFirstName() , heartRates.getLastName());
		System.out.printf("%d:%d:%d", heartRates.getDateOfBirth().getYear(), heartRates.getDateOfBirth().getMonthValue(), heartRates.getDateOfBirth().getDayOfMonth());
		
		

	} 


}