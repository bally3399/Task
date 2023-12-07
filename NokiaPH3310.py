def main_menu():
   print("""
   list of menu functions
   1. phone Book
   2. Message
   3. Chat
   4. Call_Register
   5. Tones
   6. Settings
   7. Call_divert
   8. Game
   9. Calculator
   10. Reminder
   11. clock
   12. Profile
   13. Sim_Services
   0. Exit
   """)
def Phone_Book_menu():
   print("""
   List of phone Book
   1. Search 
   2. Service Nos 
   3. Add name
   4. Erase
   5. Edit
   6. Assign tone
   7. Send b'card	
   8. Options
   9. Speed dials
   10. Voice tags
   0. Exit
   """)
def Options():
   print("""
   1. Type of view
   2. Memory status
   0. Exit
   """)
def Message():
   print("""
   list of message
   1. Write messages
   2. inbox
   3. outbox
   4. Picture messages
   5. Templates
   6. Smileys
   7. Message Settings
   8. Info service
   9. Voice mailbox number
   10. Service Command editor
   """)
def Message_Settings():
   print("""
   1. Set
   2. Common
   """) 
def Set():
   print("""
   1. Message centre number
   2. Message sent as
   3. Message validity
   """)
def Common():
  print("""
  1. Delivery
  2. Reply via same centre
  3. Character
  """)
def chat():
   print("""
   1. Chat
   """)

def Exit():
   return main_menu()

def Call_Register():
   print("""
   list of Call register
   1. Missed calls
   2. Received calls 
   3. Dialled numbers
   4. Erase recent call lists
   5. Show call duration
   6. Show call Cost
   7. Call cost settings
   8. Prepaid credit
   """)

def Show_call_duration():
   print("""
   1. last call duration
   2. All calls'duration
   3. Received calls'duration
   4. Dialled calls' duration
   5. clear timers
   """)

def Tones():
   print("""
   1. Ringing tone
   2. Ringing
   3. Incoming call alert
   4. Composer
   5. Message alert tone
   6. Keypad tones
   7. Warning and game tones
   8. Vibrating alert
   9. Screen saver 
   """)
 
def Settings():
   print("""
   List of Settings
   1. Call settings
   2. Phone Settings
   3. Security settings
   4. Restore factory settings
   """)   
def Calls_settings():
   print("""
   List of call settings
   1. Automatic redial
   2. Speed dialling
   3. Call waiting options
   4. Own number sending
   5. Phone line in use 
   6. Automatic answer
   """)
def Phone_settings():
   print("""
   1. language
   2. Cell info display
   3. Welcome 
   4. Network selection
   5. Light
   6. Confirm SIM service actions
   """)
def Security_settings():
   print("""
   1. PIN code request
   2. Call barring service 
   3. Fixed dialling
   4. Closed user group
   5. Phone security
   6. Change access codes 
   """)
def Call_divert():
	return Call_divert()
def Games():
	return Games()
def Calculator():
	return Calculator()
def Reminder():
	return Reminder()
def Clock():
   print("""
   1. Alarm clock
   2. Clock Settings
   3. Date settings 
   4. Stopwatch
   5. Countdown timer
   6. Auto update of date and time
   """)
main_menu()
user_input = input("press number from 1 to 13: ")
match user_input:
	case "1":
		Phone_Book_menu()
		user_input1 = input("press a number: ")
		match user_input1:
			
			case "1":
				serch()
			case "2":
  		   		service_Nos()
			case "3":
  		   		Add_name()
			case "4":
    		   		Erase()
			case "5":
    		   		Edit()
			case "6":
     		   		Assign_Tone()
			case "7":
    		   		Send_b_card()
			case "8":
				Options()
				user_input2 = input("press a number: ")
				match user_input2:
					case "1":
						Type_of_view()
					case "2":
						Memory_status()
					case _:
						Exit()
			
			case "9":
    		   		Speed()	
			case "10":
    		   		Voice_tags()
			case _:
    		   		Exit()


	case "2":
		Message()
		user_input3 = input("press a number: ")
		match user_input3:
			case "1":
				Write_messages()
			case "2":
				inbox()
			case "3":
				outbox()
			case "4":
				Picture_messages()
			case "5":
				Templates()
			case "6":
				Smileys()
			case "7":
				Message_Settings()
				user_input4 = input("press a number: ")
				match user_input4:
					case "1":
						Set()
						user_input5 = input("press a number: ")
						match user_input5:
							case "1":
								Message_centre_number()
							case "2":
								Message_sent_as()
							case 3:
								Message_validity()
							case _:
								Exit()

						
					case "2":
						Common()
						user_input6 = input("press a number: ")
						match user_input6:
							case "1":
								Delivery()
							case "2":
								Reply_via_same_centre()
							case 3:
								Character()
							case _:
								Exit()

					case _:
						Exit()

			case "8":
				Info_service()
			case "9":
				Voice_mailbox_number()
			case "10":
				Service_Command_editor()
			case _:
				Exit()

	case "3":
		chat()
		user_input7 = input("press a number: ")
		match user_input7:
			case "1":
				Chat()
			case _:
				Exix()
     
  
	case "4":
		call_Register()
		user_input8 = input("press a number: ")
		match user_input8:
			case "1":
				Missed_calls()
			case "2":
				Received_calls()
			case "3":
				Dialled_numbers()
			case "4":
				Erase_recent_call_lists()
			case "5":
				Show_call_duration()
				user_input9 = input("press a number: ")
				match user_input9:
					case "1":
						Last_call_duration()
					case "2":
						All_calls_duration()
					case "3":
						Received_calls_duration()
					case "4":
						Dialled_calls_duration()
					case "5":
						Clear_timers()
					case _:
						Exit()
			case "6":
				Show_call_cost()
				user_input10 = input("press a number: ")
				match user_input10:
					case "1":
						Last_call_cost()
					case "2":
						All_call_cost()
					case "3":
						Clear_counters()
					case _:
						Exit()
			case "7":
				Call_cost_settings()
				user_input11 = input("press a number: ")
				match user_input11:
					case "1":
						Call_cost_limit()
					case "2":
						Show_costs_in()
					case _:
						Exit()
			case "8":
				Prepaid_credit()
					
						
			case _:
				Exit()


		
	case "5":
		Tones()
		user_input12 = input("press a number: ")
		match user_input12:
			case "1":
				Ringing_tone()
			case "2":
				Ringing()
			case "3":
  				Incoming_call_alert()
			case "4":
  				Composer()
			case "5":
  				Message_alert_tone()
			case "6":
  				Keypad_tones()
			case "7":
  				Warning_and_game_tones()
			case "8":
  				Vibrating_alert()
			case "9":
  				Screen_saver()
			case _:
				Exit()

	case "6":
		Settings()
		user_input13 = input("press a number: ")
		match user_input13:
			case "1":
				Call_settings()
				user_input14 = input("press a number: ")
				match user_input14:
					case "1":
						Automatic_redial()
					case "2":
						Speed_dialling()
					case "3":
  						Call_waiting_options()
					case "4":
  						Own_number_sending()
					case "5":
						Phone_line_in_use()
					case "6":
						Automatic_answer()
					case _:
						Exit()
			case "2":
				Phone_settings()
				user_input15 = input("press a number: ")
				match user_input15:
					case "1":
						language()
					case "2":
						Cell_info_display()
					case "3":
  						Welcome()
					case "4":
  						Network_selection()
					case "5":
						Light()
					case "6":
						Confirm_SIM_service_actions()
					case _:
						Exit()
			case "3":
				Security_settings()
				user_input16 = input("press a number: ")
				match user_input16:
					case "1":
						Pin_code()
					case "2":
						Call_barring_service()
					case "3":
  						Fixed_dialling()
					case "4":
  						Closed_user_group()
					case "5":
						Phone_security()
					case "6":
						Change_access_codes()
					case _:
						Exit()
			case "4":
  				Restore_factory_settings()
			case _:
				Exit()
	case "7":
  		Call_divert()
	case "8":
  		Games()
	case "9":
  		Calculator()
	case "10":
  		Reminder()
	case "11":
		Clock()
		user_input17 = input("press a number: ")
		match user_input17:
			case "1":
				Alarm_clock()
			case "2":
				Clock_Settings()
			case "3":
  				Date_settings()
			case "4":
  				Stopwatch()
			case "5":
				Countdown_timer()
			case "6":
				Auto_update_of_date_and_time()
			case _:
				Exit()
	case "12":
  		Profile()
	case "13":
  		Sim_Services()
	case _:
		back()
