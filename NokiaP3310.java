import java.util.Scanner;

public class NokiaP3310{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("MainMenu\n 1. phone book\n 2.Message\n 3.Chat\n 4.Call Register\n 5.tones\n 6.settings\n 7.call divert\n 8.game\n 9.calculator\n 10.reminder\n 11.clock\n 12.profiles\n 13.sim services");

	System.out.print("Enter number from 1 to 13: ");

	int number = scanner.nextInt();

	if(number == 1)
	   System.out.println("List of phone book\n 1.search\n 2.service nos\n 3.add name\n 4.erase\n 5.edit\n 6.assign tone\n 7.send b' card\n 8.options\n 9.speed dials\n 10.voice tags");
	System.out.print("Enter number from 1 to 10: ");
	int number1 = scanner.nextInt();

 	if(number1 == 8)
	   System.out.println("options\n 1. type of view\n 2.memory status");
	System.out.print("Enter number: ");
	int number2 = scanner.nextInt();

	if(number2 == 2)
	   System.out.print("messageMenu\n 1.write message\n 2.inbox\n 3.outbox\n 4.picture messages\n 5.templates\n 6.smileys\n 7.message settings\n 8.info service\n 9.voice mailbox number\n 10.service command editor");
	System.out.print("Enter number: ");
	int number3 = scanner.nextInt();

	if(number3 == 7)
	   System.out.println("Message settings\n 1.Set\n 2.Common");
	System.out.print("Enter number: ");
	int number4 = scanner.nextInt();

	if(number4 == 1)
	   System.out.println("set\n 1.message centre number\n 2. message sent as\n 3. message validity");
	System.out.print("Enter number: ");
	int number5 = scanner.nextInt();

        if(number5 == 2)
	   System.out.println("Common\n 1.delivery reports\n 2.reply via same centre\n 3.character support");
	System.out.print("Enter number: ");
	int number6 = scanner.nextInt();

	if(number6 == 0)
	   System.out.println("back");
	else if(number6 == 3)
	   System.out.println("Chat");
	System.out.print("Enter number: ");
	int number7 = scanner.nextInt();
	if(number7 == 0)
	   System.out.println("back");
	else if(number7 == 4)
	   System.out.println("Call register\n 1.Missed calls\n 2.Received calls\n 3.dialled number\n 4.erase recent calls lists\n 5.show call duration\n 6.show call cost\n 7.call cost settings\n 8.prepaid credit");

	System.out.print("Enter number: ");
	int number8 = scanner.nextInt();
	if(number8 == 0)
	   System.out.println("back");
	else if(number8 == 5)
	   System.out.println("show call duration\n 1.last call duration\n 2.all calls' cost\n 3.received calls' duration\n 4. dialled calls' duration\n 5.clear timers");

	System.out.print("Enter number: ");
	int number9 = scanner.nextInt();
	if(number9 == 0)
	   System.out.println("back");
	else if(number9 == 6)
	   System.out.println("show call costs\n 1.last call cost\n 2.all costs' cost\n 3.clear counters");

	System.out.print("Enter number: ");
	int number10 = scanner.nextInt();
	if(number10 == 0)
	   System.out.println("back");
	else if(number10 == 7)
	   System.out.println("call cost settings\n 1.call cost limit\n 2.show cost in");
	
	System.out.print("Enter number: ");
	int number11 = scanner.nextInt();
	if(number11 == 0)
	   System.out.println("back");
	else if(number11 == 8)
	   System.out.println("prepaid credit");

	System.out.print("Enter number: ");
	int number12 = scanner.nextInt();
	if(number12 == 0)
	   System.out.println("back");
	else if(number12 == 5)
	   System.out.println("tones\n 1.ringing tones\n 2.ringing volume\n 3.incoming call alert\n 4.composer\n 5.message alert tone\n 6.keypad tones\n 7.warning and game tones\n 8.vibrating\n 9.screen saver");

        System.out.print("Enter number: ");
	int number13 = scanner.nextInt();
	if(number13 == 0)
	   System.out.println("back");
	else if(number13 == 6)
	   System.out.print("settings\n 1.call settings\n 2. phone settings\n 3.security settings\n 4.restore factory setting");
	
	System.out.print("Enter number: ");
	int number14 = scanner.nextInt();
	if(number14 == 0)
	   System.out.println("back");
	else if(number14 == 1)
	   System.out.println("call settings\n 1.automatic redial\n 2.speed dialing\n 3.call waiting options\n 4.own number sending\n 5.phone line in use\n 6.automatic answer");

	System.out.print("Enter number: ");
	int number15 = scanner.nextInt();
	if(number15 == 0)
	   System.out.println("back");
	else if(number15 == 2)
	   System.out.println("phone settings\n 1.language\n 2.cell info display\n 3.welcome note\n 4.network selection\n 5. light\n 6.confirm sim service actions");

	System.out.print("Enter number: ");
	int number16 = scanner.nextInt();
	if(number16 == 0)
	   System.out.println("back");
	else if(number16 == 3)
	   System.out.println("security settings\n 1.pin code request\n 2.call baring service\n 3.fixed dialling\n 4.closed user group\n 5.phone security\n 6.change access codes");

	System.out.print("Enter number: ");
	int number17 = scanner.nextInt();
	if(number17 == 0)
	   System.out.println("back");
	else if(number17 == 4)
	   System.out.println("restore factory settings");

	
	System.out.print("Enter number: ");
	int number18 = scanner.nextInt();
	if(number18 == 0)
	   System.out.println("back");
	else if(number18 == 7)		
	    System.out.println("call divert");
	        
		System.out.print("Enter number: ");
	int number19 = scanner.nextInt();
	if(number19 == 0)
	   System.out.println("back");
	else if(number19 == 8)		
	    System.out.println("game");

		System.out.print("Enter number: ");
	int number20 = scanner.nextInt();
	if(number20 == 0)
	   System.out.println("back");
	else if(number20 == 9)		
	    System.out.println("Calculator");

		System.out.print("Enter number: ");
	int number21 = scanner.nextInt();
	if(number21 == 0)
	   System.out.println("back");
	else if(number21 == 10)		
	    System.out.println("Reminder");
	        
	System.out.print("Enter number: ");
	int number22 = scanner.nextInt();
	if(number22 == 0)
	   System.out.println("back");
	else if(number22 == 11)		
	    System.out.println("clockMenu\n 1.alarm clock: \n 2.clock setting: \n 3.date settings: \n 4.stop watch\n 5.count down timer\n 6.auto update of date and time");

	System.out.print("Enter number: ");
	int number23 = scanner.nextInt();
	if(number23 == 0)
	   System.out.println("back");
	else if(number23 == 12)
	   System.out.print("Profile");

	System.out.print("Enter number: ");
	int number24 = scanner.nextInt();
	if(number24== 0)
	   System.out.println("back");
	else if(number24 == 13)             
	   System.out.print("SIM service");    


	}

}