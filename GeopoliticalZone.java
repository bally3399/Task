import java.util.Scanner;

public class GeopoliticalZone{

	public static void main(String[] args){

	Scanner scanner = new Scanner("System.in");

	System.out.print("Enter your state: ");
	String state = scanner.nextLine();
	
	boolean isNorthWestState = state.equalsIgnoreCase("Kebbi") || state.equalsIgnoreCase("Sokoto") || state.equalsIgnoreCase("Kano") || state.equalsIgnoreCase("Kastina") || state.equalsIgnoreCase("Kaduna") || state.equalsIgnoreCase("Zamfara");
	boolean isNorthEastState = state.equalsIgnoreCase("Adamawa") || state.equalsIgnoreCase("Yobe") || state.equalsIgnoreCase("Borno") || state.equalsIgnoreCase("Bauchi") || state.equalsIgnoreCase("Gombe") || state.equalsIgnoreCase("Taraba") || state.equalsIgnoreCase("Jigawa");
	boolean isNorthCentralState = state.equalsIgnoreCase("Plateau") || state.equalsIgnoreCase("Kwara") || state.equalsIgnoreCase("Benue") || state.equalsIgnoreCase("Niger") || state.equalsIgnoreCase("Nassarawa") || state.equalsIgnoreCase("FCT");
	boolean isSouthWestState = state.equalsIgnoreCase("Lagos") || state.equalsIgnoreCase("Ondo") || state.equalsIgnoreCase("Osun") || state.equalsIgnoreCase("Oyo") || state.equalsIgnoreCase("Ogun") || state.equalsIgnoreCase("Ekiti");
	boolean isSouthEastState = state.equalsIgnoreCase("Abia") || state.equalsIgnoreCase("Anambra") || state.equalsIgnoreCase("Ebonyi") || state.equalsIgnoreCase("Enugu") || state.equalsIgnoreCase("Imo");                    
	boolean isSouthSouthState = state.equalsIgnoreCase("Bayelsa") || state.equalsIgnoreCase("Edo") || state.equalsIgnoreCase("Cross-River") || state.equalsIgnoreCase("Delta") || state.equalsIgnoreCase("Rivers") || state.equalsIgnoreCase("Akwa-Ibon");
	if(isNorthWestState)
	   System.out.println("You are from NorthWest");
	if(isNorthEastState)
	   System.out.println("You are from NorthEast");
	if(isNorthCentralState)
	   System.out.println("You are from NorthCentral");
	if(isSouthEastState)
	   System.out.println("You are from SouthEast");
	if(isSouthWestState)
	   System.out.println("You are from SouthWest");
	if(isSouthSouthState)
	   System.out.println("You are from SouthSouth");
	 
	 
	 
	  
	      
	}


}