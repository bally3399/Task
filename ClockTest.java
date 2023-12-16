import java.util.Scanner;

public class ClockTest{

	public static void main(String[] args){

		Clock myClock = new Clock(0, 0, 0);
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter hour: ");
		int hour = input.nextInt();
		myClock.setHour(hour);

		System.out.print("Enter minutes: ");
		int minutes = input.nextInt();
		myClock.setMinutes(minutes);

		System.out.print("Enter seconds: ");
		int seconds = input.nextInt();
		myClock.setSeconds(seconds);

	System.out.printf("hh:mm:ss: %d:%d:%d", myClock.getHour(), myClock.getMinutes(), myClock.getSeconds());

	


	






	


	}
}




