import java.util.Scanner;

public class DanglingProblem2{

	public ststic void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter x");
		String x = scanner.nextLine();

		System.out.print("Enter y");
		String y = scanner.nextLine();

		if(y == 8){
			if(x == 5){
			System.out.println("@@@@@");
			}
		}else{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}

	}


}