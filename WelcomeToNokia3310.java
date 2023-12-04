import java.util.Scanner;

public class WelcomeToNokia3310{

    public static void main(String[] aargs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter number from 1 to 13");

	System.out.println("main menu\n 1.phone book\n 2.message\n 3.chat\n 4.call register\n 5.tones\n 6.settings\n 7.call divert\n 8.game\n 9.calculator\n 10.reminder\n 11.clock\n 12.profiles\n 13.sim services");
	System.out.print("Enter choiceNumber");
	int choiceNumber = input.nextInt();
	System.out.println();

	 switch(choiceNumber){
            case 1 : phoneBookMenu();
	    case 2 : messageMenu();
	    case 3 : chatMenu();
	    case 4 : callRegisterMenu();
	    case 5 : tonesMenu();
	    case 6 : settingsMenu();
	    case 7 : callDivertMenu();
	    case 8 : gameMenu();
	    case 9 : calculationMenu();
	    case 10 : remindersMenu();
	    case 11 : clockMenu();
	    case 12 : profilesMenu();
	    case 13 : simServerMenu();
	    {
	System.out.println("Exiting the program");
		return;
		}
	}
	System.out.println("invalid choiceNumber. please try again");
	  
	 }
	  
	public static void phoneBookMenu(){
	Scanner scanner = new Scanner(System.in);
		System.out.println("phone Book Menu\n 1.search\n 2.service nos\n 3.add name\n 4.erase\n 5.edit\n 6.assign tone\n 7.send b' card\n 8.options\n 9.speed dials\n 10.voice tags");
		System.out.println("Enter your choiceNumber: ");				
		int choiceNumber1 = scanner.nextInt();
		System.out.println();
			switch(choiceNumber1) {
				case 1 : 
				System.out.println("search: ");
				break;

				case 2 :
			 	System.out.println("service: ");
				break;

				case 3 :
			        System.out.println("add name: ");
				break;

				case 4 :
				System.out.println("erase: ");
				break;
					
				case 5 :
				System.out.println("edit: ");
				break;

				case 6 :
				System.out.println("assign tone: ");
				break;

				case 7 :
				System.out.println("send b'card: ");
				break;

				case 8 :
				System.out.println("options\n 1. type of view\n memory status ");
				System.out.println("select between option 1 or 2");
				int select = scanner.nextInt();
				switch(select) {
				   case 1:
				   System.out.println("type of view: ");
				   break;

				   case 2:
				   System.out.println("memory status: ");
				   break;
				   }
				   
				   break;

				 case 9 :
				 System.out.println("speed dials: ");
				 break;
				  
				 case 10 :				  
				 System.out.println("voice tags: ");
				 break;
				   	
				}
			break;
		 }
	        
		 public static void messageMenu() {
		 Scanner scanner = new scanner(System.in);
			System.out.println("messageMenu\n 1.write message\n 2.inbox\n 3.outbox\n 4.picture messages\n 5.templates\n 6.smileys\n 7.message settings\n 8.info service\n 9.voice mailbox number\n 10.service command editor");
			System.out.print("Enter ChoiceNumber: ");
			int choiceNumber2 = scanner.nextInt();
			System.out.println();
			switch(choiceNumber2) {
				case 1 :
				System.out.println("write messages");
				break;
				     
     				case 2 :
				System.out.println("inbox");
				break;

				case 3 :
				System.out.println("outbox");
				break;

				case 4 :
				System.out.println("picture message");
				break;
				
				case 5 :
				System.out.println("template");
				break;
				
				case 6 :
				System.out.println("Smiley");
				break;
								
				case 7 :
				System.out.println("Message settings\n 1.Set\n 2.Common");
				System.out.print("Select between option 1  or 2 ");
				int selector = scanner.nextInt();
				switch(selector) {
					case 1:
					System.out.print("set\n 1.message centre number\n 2. message sent as\n 3. message validity");
					System.out.print("select from option 1 to 3 ");
					int selector2 = scanner.nextInt();
					switch(selector2) {
					    case 1:
					    System.out.println("message centre number");
					    break;
	
					    case 2:
					    System.out.println("message sent as");
					    break;

					    case 3:
					    System.out.println("message validity");
					    break;


					  }
					break;
					case 2:
					System.out.println("Common\n 1.delivery reports\n 2.reply via same centre\n 3.character support");
					System.out.print("select option from 1 to 3");
					int selector2 = scanner.nextInt();
					switch(selector2) {
					  case 1:
					  System.out.println("delivery reports");
					  break;

					  case 2: 
					  System.out.println("reply via same centre");
					  break;

					  case 3:
					  System.out.println("character support");
					  break;  
					  }
				break;

				case 8 :
				System.out.println("info service");
				break;

				case 9 :
				System.out.println("voice mailbox number");
				break;

				case 10 :
				System.out.println("Service command editor");
				break;
			
				}
				break;
			     } 
		}
		 public static void chatMenu(){
		 Scanner scanner = new Scanner(System.in);
		     System.out.println("chat");
		 }
		 public static void callRegisterMenu(){
		 Scanner scanner = new Scanner(System.in);
			System.out.println("callRegisterMenu\n 1.missed call\n 2.received calls\n 3.dialled number\n 4.erase recent calls lists\n 5.show call duration\n 6.show call cost\n 7.call cost settings\n 8.prepaid credit");
			System.out.print("Enter choiceNumber");
			int choiceNumber3 = scanner.nextInt();
			System.out.println();
		        switch(choiceNumber3) {
			   case 1:
			   System.out.println("missed call");
			   break;
	
			   case 2:
			   System.out.println("received calls");
			   break;

			   case 3:
			   System.out.println("dialled number");
			   break;

			   case 4:
			   System.out.println("erase recent calls lists");
			   break;

			   case 5:
			   System.out.println("show call duration\n 1.last call duration\n 2.all calls' cost\n 3.received calls' duration\n 4. dialled calls' duration\n 5.clear timers");
			   System.out.print("select from option 1 to 5");
			   int selector3 = scanner.nextInt();
			   switch(selector3) {
				case 1:
				System.out.println("last call duration");
				break;

				case 2:
				System.out.println("all calls' cost");
				break;

				case 3:
				System.out.println("received calls'duration");
				break;
				
				case 4:
				System.out.println("dialled calls' duration");
				break;

				case 5:
				System.out.println("clear timers");
				break;
                	   }
				break;
				
				case 6:
				System.out.println("show call costs\n 1.last call cost\n 2.all costs' cost\n 3.clear counters");
				System.out.print("select from option 1 to 3");
				int selector4 = scanner.nextInt();
				switch(selector4) {
				   case 1:
				   System.out.println("last call cost");
				   break;

				   case 2:
				   System.out.println("all calls' cost");
				   break;

				   case 3:
				   System.out.println("clear counters");
				   break;
				}
				   break;

				   case 7:
				   System.out.println("call cost settings\n 1.call cost limit\n 2.show cost in");
				   System.out.print("select from option 1 to 3");
				   int selector5 = scanner.nextInt();
				   switch(selector5) {
				   	case 1:
					System.out.println("call cost limit");
					break;

					case 2:
					System.out.println("show cost in");
					break;
				   }

					break;

					case 8:
					System.out.println("prepaid credit");
					break;
					}
				break;
			}
		

		 public static void tonesMenu(){
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("tones\n 1.ringing tones\n 2.ringing volume\n 3.incoming call alert\n 4.composer\n 5.message alert tone\n 6.keypad tones\n 7.warning and game tones\n 8.vibrating\n 9.screen saver");
		 System.out.println("Enter choiceNumber from 1 to 9");
		 int choiceNumber4 = scanner.nextInt();
		 System.out.println();
		 switch(choiceNumber4) {
		 	case 1:
			System.out.println("ringing tones");
			break;
			
			case 2:
			System.out.println("ringing volume");
			break;

			case 3:
			System.out.println("incoming call alert");
			break;

			case 4:
			System.out.println("composer");
			break;

			case 5:
			System.out.println("message alert tone");
			break;

			case 6:
			System.out.println("keypad tones");
			break;

			case 7:
			System.out.println("warning and game tones");
			break;

			case 8:
			System.out.println("vibrating alert");
			break;

			case 9:
			System.out.println("screen saver");
			break;	
		        }
		  break;
		 }
		 public static void settingsMenu(){
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("settings\n 1.call settings\n 2. phone settings\n 3.security settings\n 4.restore factory setting");
		 System.out.println("Enter choiceNumber from 1 to 4");
		 int choiceNumber5 = scanner.nextInt();
		 System.out.println();
		 switch(choiceNumber5) {
			case 1 :
			System.out.println("call settings\n 1.automatic redial\n 2.speed dialing\n 3.call waiting options\n 4.own number sending\n 5.phone line in use\n 6.automatic answer");
			System.out.println("Select number from 1 to 6");
			int selector4 = scanner.nextInt();
			switch(selector4) {
			    case 1:
			    System.out.println("automatic redial");
			    break;

			    case 2:
			    System.out.println("speed dialing");
			    break;

			    case 3:
			    System.out.println("call waiting options");
			    break;

			    case 4:
			    System.out.println("own number sending");
			    break;

			    case 5:
			    System.out.println("phone line in use");
			    break;

			    case 6:
			    System.out.println("automatic answer");
			    break;
			}
			break;
			    
			case 2:
			System.out.println("phone settings\n 1.language\n 2.cell info display\n 3.welcome note\n 4.network selection\n 5. light\n 6.confirm sim service actions");
			System.out.println("select from option 1 to 6");
			int selector5 = scanner.nextInt();
			switch(selector5) {
			     case 1:
			     System.out.println("language");
			     break;

			     case 2:
			     System.out.println("cell info display");
			     break;

			     case 3:
			     System.out.println("welcome note");
			     break;

			     case 4:
			     System.out.println("network selection");
			     break;

			     case 5:
			     System.out.println("light");
			     break;

			     case 6:
			     System.out.println("confirm sim service actions");
			     break;
			}
			break;

			case 3:
			System.out.println("security settings\n 1.pin code request\n 2.call baring service\n 3.fixed dialling\n 4.closed user group\n 5.phone security\n 6.change access codes");
			System.out.println("select number from 1 to 6: ");
			int selector6 = scanner.out.println();
			switch(selector6) {
			     case 1: 
			     System.out.println("pin code request:");
			     break;

			     case 2: 
			     System.out.println("call baring service: ");
			     break;

			     case 3: 
			     System.out.println("fixed dialling: ");
			     break;

			     case 4: 
			     System.out.println("closed user group: ");
			     break;

			     case 5: 
			     System.out.println("phone security: ");
			     break;
		
			}
			break;

			case 4:
			System.out.println("restore factory settings: ");
			break;	
		 }
		 break;
		}
		 public static void callDivertMenu(){
		 Scanner scanner = new Scanner(System.in);
		     System.out.println("call divert");
	         }
		 public static void gameMenu(){
		 Scanner scanner = new Scanner(System.in);
		     System.out.println("game");
		 }
		 public static void calculatorMenu(){
		 Scanner scanner = new Scanner(System.in);
		     System.out.println("calculator");
		 }
		 public static void remindersMenu(){
		 Scanner scanner = new Scanner(System.in);
		     System.out.println("reminders");
		 }
		 public static void clockMenu(){
		 Scanner scanner = new Scanner(System.in);
		     System.out.println("clockMenu\n 1.alarm clock: \n 2.clock setting: \n 3.date settings: \n 4.stop watch\n 5.count down timer\n 6.auto update of date and time");
		     System.out.println("Enter choiceNumber from 1 to 6: ");
		     int choiceNumber7 = scanner.nextInt();
		     System.out.println();
		     switch(choiceNumber7) {
		     	 case 1:
			 System.out.println("alarm: ");
			 break;

			 case 2:
			 System.out.println("clock setting: ");
			 break;

			 case 3:
			 System.out.println("date settings: ");
			 break;

			 case 4:
			 System.out.println("stop watch: ");
			 break;

			 case 5:
			 System.out.println("count down timer: ");
			 break;

 			 case 6:
			 System.out.println("auto update of date and time: ");
			 break;
		         }
		 break;
		 }
		 public static void profileMenu(){
		 Scanner scanner = new Scanner(System.in);
		     System.out.println("profile: ");
		 }
		 public static void simServicesMenu(){
		 Scanner scanner = new Scanner(System.in);
		     System.out.println("sim service: ");
		 }
		
}
}