import java. util.Scanner;

public class GeopoliticalZone2{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your state: ");
	String state = scanner.next();
	switch(state){	
		case "Kebbi":
		case "Sokoto":
		case "Kano":
 		case "Kastina":
		case "Kaduna":
 		case "Zamfara": 
		System.out.println("NorthWest");
		break;
		}
	switch(state) {
		case "Adamawa":
		case "Yobe":
		case "Borno":
		case "Bauchi":
		case "Gombe":
		case "Taraba":
		case "Jigawa": 
		System.out.println("NorthEast");
		break;
	}
 	switch(state) {
		case "Plateau":
		case "Kwara":
		case "Benue":
		case "Niger":
		case "Nasarawa":
		case "FCT":
		System.out.println("NorthCentral");
		break;
	}
	switch(state) {
		case "Lagos":
		case "Ondo":
		case "Osun":
		case "Oyo":
		case "Ogun":
		case "Ekiti":
		System.out.println("SouthWest");
		break;
	}
	switch(state) {
		case "Abia":
		case "Anambra":
		case "Ebonyi":
		case "Enugu":
		case "Imo":
		System.out.println("SouthEast");
		break;
	}
	switch(state) {
		case "Bayelsa":
		case "Edo":
		case "Cross-River":
		case "Delta":
		case "River":
		case "Akwa-Ibon":
		System.out.println("NorthEast");
		break;
	}
	}

}