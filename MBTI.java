import java.util.Arrays;
import java.util.Scanner;

public class MBTI{

	private String[][] questions = new String[20][2];
	private String[] response = new String[20];
	private String status = "";
	private String[] EI = new String[5];
	private String[] SN = new String[5];
	private String[] TF = new String[5];
	private String[] JP = new String[5];
	private String[] responseIndexEI = new String[5];
	private String[] responseIndexSN = new String[5];
	private String[] responseIndexTF = new String[5];
	private String[] responseIndexJP = new String[5];
	private int EICounterA;
	private int EICounterB;
	private int SNCounterA;
	private int SNCounterB;
	private int TFCounterA;
	private int TFCounterB;
	private int JPCounterA;
	private int JPCounterB;
	Scanner scanner = new Scanner(System.in);
	


	public static void main(String[] args){
		MBTI myMBTI = new MBTI();
		myMBTI.addQuestions();
		myMBTI.collectInput();
		myMBTI.addExtrovertedAndIntroverted();
		myMBTI.addSensingAndIntuitive();
		myMBTI.addThinkingAndFeeling();
		myMBTI.addJudgingAndPerceptive();
		myMBTI.counterForEI();
		myMBTI.counterForSN();
		myMBTI.counterForTF();
		myMBTI.counterForJP();
		myMBTI.gettingResponseIndexForEI();
		myMBTI.gettingResponseIndexForSN();
		myMBTI.gettingResponseIndexForTF();
		myMBTI.gettingResponseIndexForJP();
		myMBTI.printResultForExtrovertedAndIntroverted();
		myMBTI.printResultForSensingAndIntuitive();
		myMBTI.printResultForThinkingAndFeeling();
		myMBTI.printResultForJugdingAndPerceptive();
		myMBTI.determinePersonality();


	}



	public void addQuestions(){
		System.out.println("What is your name");
		String name = scanner.nextLine();
		String[] question1 = {"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"};
		questions[0] = question1; 
	
		String[] question2 = {"A. Interpret literally", "B. look for meaning and possiblities"};
		questions[1] = question2;

		String[] question3 = {"A. logical, thinking, questioning", "B. empathetic, feeling, accomodating"};
		questions[2] = question3;

		String[] question4 = {"A. organized, orderly", "B. flexible, adaptable"};
		questions[3] = question4;

		String[] question5 = {"A. more outgoing, think out loud", "B. more reserved, think to yourself"};
		questions[4] = question5;

		String[] question6 = {"A. pratical, realistic, experiental", "B. imaginative, innovative, theoretical"};
		questions[5] = question6;

		String[] question7 = {"A. candid, straight forward, frank", "B. tactful, kind, encouraging"};
		questions[6] = question7;

		String[] question8 = {"A. plan, schedule", "B. unplanned, spontaneous"};
		questions[7] = question8;

		String[] question9 = {"A. seek many tasks, public activities, interaction with others", "B. seek private, solitary activities with quiet to concentrate"};
		questions[8]= question9;

		String[] question10 = {"A. standard, usual, convenional", "B. different, novel, unique"};
		questions[9] = question10;

		String[] question11 = {"A. firm, tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate"};
		questions[10] = question11;

		String[] question12 = {"A. regulated, structured", "B. easy-going, live and let live"};
		questions[11]= question12;

		String[] question13 = {"A. external, communicative, express yourself", "B. internal, reticent, keep to yourself"};
		questions[12] = question13;

		String[] question14 = {"A. focus on here-and-now", "B. look to the future, global perspective, big picture"};
		questions[13] = question14;

		String[] question15 = {"A. tough-minded, just ", "B. tender-hearted, merciful"};
		questions[14] = question15;

		String[] question16 = {"A. preparation, plan ahead", "B. go with the flow, adapt as you go"};
		questions[15] = question16;

		String[] question17 = {"A. active, initiate", "B. reflective, deliberate"};
		questions[16] = question17;

		String[] question18 = {"A. facts, things, what is", "B. ideas, dreams, what could be, philosophical"};
		questions[17] = question18;

		String[] question19 = {"A. matter of fact, issue-oriented", "B. sensitive, people-oriented, compassionate"};
		questions[18] = question19;

		String[] question20 = {"A. control, govern", "B. latitude, freedom"};
		questions[19]= question20;

	}


	public void collectInput(){
	
		for(int index = 0; index < questions.length; index++){
			for(int input = 0; input < questions[index].length; input++){
				System.out.print(questions[index][input]+ " ");
			}
			System.out.println();
			String input = scanner.nextLine();
			if (input.equals("A") || input.equals("B")){
				response[index] = input;
			}
			else {
				System.out.println("Expected A or B as Response\nI know this is an error, please retry again");
				index--;
			}

		}


	}

	public void addExtrovertedAndIntroverted(){
		int counter = 0;
		for(int index = 0; index < response.length; index += 4){
			EI[counter] = response[index];
			counter++;
		}
	}

	public void addSensingAndIntuitive(){
		int counter = 0;
		for(int index = 1; index < response.length; index += 4){
			SN[counter] = response[index];
			counter++;
		}
	}

	public void addThinkingAndFeeling(){
		int counter = 0;
		for(int index = 2; index < response.length; index += 4){
			TF[counter] = response[index];
			counter++;
		}
	}

	public void addJudgingAndPerceptive(){
		int counter = 0;
		for(int index = 3; index < response.length; index += 4){
			JP[counter] = response[index];
			counter++;
		}
	}

	
	public void counterForEI(){
		for(int index = 0; index < EI.length; index++){
			if(EI[index].equals("A")){
				EICounterA++;
			} 
			else if(EI[index].equals("B")){
				EICounterB++;
			}
		}

		if (EICounterA > EICounterB){
			status += "E";
		}
		else{
			status += "I";
		}
	}

	public void counterForSN(){
		for(int index = 0; index < SN.length; index++){
			if(SN[index].equals("A")){
				SNCounterA++;
			} 
			else if(SN[index].equals("B")){
				SNCounterB++;
			}
		}

		if (SNCounterA > SNCounterB){
			status += "S";
		}
		else{
			status += "N";
		}
	}

	public void counterForTF(){
		for(int index = 0; index < TF.length; index++){
			if(TF[index].equals("A")){
				TFCounterA++;
			} 
			else if (TF[index].equals("B")){
				TFCounterB++;
			}
		}

		if (TFCounterA > TFCounterB){
			status += "T";
		}
		else{
			status += "F";
		}
	}

	public void counterForJP(){
		for(int index = 0; index < JP.length; index++){
			if(JP[index].equals("A")){
				JPCounterA++;
			} 
			else if (JP[index].equals("B")){
				JPCounterB++;
			}
		}

		if (JPCounterA > JPCounterB){
			status += "J";
		}
		else{
			status += "P";
		}
	}


	public void gettingResponseIndexForEI(){
		int counter = 0;
		for(int index = 0; index < questions.length; index += 4){
			if (response[index].equals("A")){	
				responseIndexEI[counter] = questions[index][0];
				counter++;
			}
			else{
				responseIndexEI[counter] = questions[index][1];
				counter++;
			}
		}
	}

	public void gettingResponseIndexForSN(){
		int counter = 0;
		for(int index = 1; index < questions.length; index += 4){
			if (response[index].equals("A")){	
				responseIndexSN[counter] = questions[index][0];
				counter++;
			}
			else{
				responseIndexSN[counter] = questions[index][1];
				counter++;
			}
		}
	}

	public void gettingResponseIndexForTF(){
		int counter = 0;
		for(int index = 2; index < questions.length; index += 4){
			if (response[index].equals("A")){	
				responseIndexTF[counter] = questions[index][0];
				counter++;
			}
			else{
				responseIndexTF[counter] = questions[index][1];
				counter++;
			}
		}
	}

	public void gettingResponseIndexForJP(){
		int counter = 0;
		for(int index = 3; index < questions.length; index += 4){
			if (response[index].equals("A")){	
				responseIndexJP[counter] = questions[index][0];
				counter++;
			}
			else{
				responseIndexJP[counter] = questions[index][1];
				counter++;
			}
		}
	}

	public void printResultForExtrovertedAndIntroverted(){
		for(int index = 0; index < responseIndexEI.length; index++){
			System.out.println(responseIndexEI[index]);
		}

		System.out.printf("Number of A selected: %d%n", EICounterA);
		System.out.printf("Number of B selected: %d%n", EICounterB);
	}

	public void printResultForSensingAndIntuitive(){
		for(int index = 0; index < responseIndexSN.length; index++){
			System.out.println(responseIndexSN[index]);
		}

		System.out.printf("Number of A selected: %d%n", SNCounterA);
		System.out.printf("Number of B selected: %d%n", SNCounterB);
	}

	public void printResultForThinkingAndFeeling(){
		for(int index = 0; index < responseIndexTF.length; index++){
			System.out.println(responseIndexTF[index]);
		}

		System.out.printf("Number of A selected: %d%n", TFCounterA);
		System.out.printf("Number of B selected: %d%n", TFCounterB);
	}

	public void printResultForJugdingAndPerceptive(){
		for(int index = 0; index < responseIndexJP.length; index++){
			System.out.println(responseIndexJP[index]);
		}

		System.out.printf("Number of A selected: %d%n", JPCounterA);
		System.out.printf("Number of B selected: %d%n", JPCounterB);
	}
	public void determinePersonality(){
		switch (status){
			case "INTP": determineThePersonIsIntp();
				break;
			case "INTJ": determineThePersonIsIntj();
				break;
			case "ENTJ": determineThePersonIsEntj();
				break;
			case "ENTP": determineThePersonIsEntp();
				break;
			case "INFJ": determineThePersonIsInfj();
				break;
			case "INFP": determineThePersonIsInfp();
				break;
			case "ENFJ": determineThePersonIsEnfj();
				break;
			case "ENFP": determineThePersonIsEnfp();
				break;
			case "ISTJ": determineThePersonIsIstj();
				break;
			case "ISFJ": determineThePersonIsIsfj();
				break;
			case "ESTJ": determineThePersonIsEstj();
				break;
			case "ESFJ": determineThePersonIsEsfj();
				break;
			case "ISTP": determineThePersonIsIstp();
				break;
			case "ISFP": determineThePersonIsIsfp();
				break;
			case "ESTP": determineThePersonIsEstp();
				break;
			case "ESFP": determineThePersonIsEsfp();
				break;
			default: System.out.println("Personality does not exist");
		}
	}
	
	public void determineThePersonIsIntp(){
		System.out.println("INTP\nHealer\nThe Logician (MBTI)\nThe Mediator (16Personalities)\nThe INTP Personality Type\nLogicians pride themselves on their unique perspectives and vigorous intellect. They can’t help but puzzle over the mysteries of the universe which may explain why some of the most influential philosophers and scientists of all time have been Logicians. This personality type is fairly rare, but with their creativity and inventiveness, Logicians aren’t afraid to stand out from the crowd.\nThe INTP often lose themselves in thought which isn’t necessarily a bad thing. People with this personality type hardly ever stop thinking. From the moment they wake up, their minds buzz with ideas, questions, and insights. At times, they may even find themselves conducting full-fledged debates in their own heads");
		}
		public void determineThePersonIsIntj(){
			System.out.println("INTJ\nAn Architect\nThe INTJ personality Type\nAn Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one\nThis personality type comes with a strong independent streak. Architects don’t mind acting alone, perhaps because they don’t like waiting around for others to catch up with them. They also generally prefer making decisions without asking for anyone else’s input. At times, this lone-wolf behavior can come across as insensitive, as it fails to take into consideration other people’s thoughts, desires, and plans");
		}
		public void determineThePersonIsEntj(){
			System.out.println("ENTJ\nA Commander\nThe ENTJ Personality Type\nA Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.\nCommanders are natural-born leaders. People with this personality type embody the gifts of charisma and confidence, and project authority in a way that draws crowds together behind a common goal.\nTo people with the Commander personality type, emotional displays are displays of weakness, and it’s easy to make enemies with this approach – Commanders will do well to remember that they absolutely depend on having a functioning team, not just to achieve their goals, but for their validation and feedback as well");
		} 
		public void determineThePersonIsEntp(){
			System.out.println("ENTP\nA Debater\nThe ENTP Personality Type\nA Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.\nDebaters are known for their rebellious streak. For this personality type, no belief is too sacred to be questioned, no idea is too fundamental to be scrutinized, and no rule is too important to be broken, or at least thoroughly tested.\n Debaters enjoy the mental exercise of questioning the prevailing mode of thought, and they take a certain pleasure in uncovering the value of underdogs and outliers");
		}

		public void determineThePersonIsInfj(){
			System.out.println("INFJ\nA Advocate\nThe INFJ Personality Type\nAn Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.\nAdvocates (INFJs) may be the rarest personality type of all, but they certainly leave their mark on the world. Idealistic and principled, they aren’t content to coast through life – they want to stand up and make a difference. For Advocate personalities, success doesn’t come from money or status but from seeking fulfillment, helping others, and being a force for good in the world.\nAdvocates may be Introverted, but they value deep, authentic relationships with others. Few things bring these personalities as much joy as truly knowing another person – and being known in return");
		}
		
		public void determineThePersonIsInfp(){
			System.out.println("INFP\nA Mediator\nThe INFP Pesonality Type\nA Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do\nMediators share a sincere curiosity about the depths of human nature. Introspective to the core, they’re exquisitely attuned to their own thoughts and feelings, but they yearn to understand the people around them as well\nEmpathy is among this personality type’s greatest gifts, but at times it can be a liability\nMediators have a talent for self-expression. They may reveal their innermost thoughts and secrets through metaphors and fictional characters");
		}
		
		public void determineThePersonIsEnfj(){
			System.out.println("ENFJ\nA Protagonist\n The ENFJ Personality Type\nA Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits. These warm, forthright types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.\nProtagonists (ENFJs) feel called to serve a greater purpose in life.When Protagonists care about someone, they want to help solve that person’s problems – sometimes at any cost. The good news is that many people are grateful for Protagonists’ assistance and advice");
		}
		
		public void determineThePersonIsEnfp(){
			System.out.println("ENFP\nA Campaigner\n The ENFP Personality type\nA Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.\nCampaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, they stand out in any crowd. But even though they can be the life of the party, Campaigners don’t just care about having a good time.\nCampaigners are independent and creative, always on the lookout for the magic and meaning in everyday life.\nCampaigner personalities are capable of intense thought and feeling – and also of kicking back and having a good time");
		}
		
		public void determineThePersonIsIstj(){
			System.out.println("ISTJ\nA Logistician\n The ISTJ Personality Type\nA Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.\nLogisticians pride themselves on their integrity. People with this personality type mean what they say, and when they commit to doing something, they make sure to follow through.\nLogisticians’ dedication is an admirable quality, and it drives many of their accomplishments. But it can also become a weakness that other people take advantage of. With their strong work ethic and sense of duty, Logisticians may routinely find themselves shouldering other people’s responsibilities.Logisticians aren’t known for expressing their emotions readily, but that doesn’t mean that people with this personality type don’t feel frustration or resentment when they’re pulling more than their weight");
		}
		
		public void determineThePersonIsIsfj(){
			System.out.println("ISFJ\nA Defender\n The ISFJ Personality Type\nA Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.\nDefender personalities are known for their humility, and they rarely seek the spotlight.Defenders tend to feel most energized and effective when they’re showing up for someone who needs their help.\nFor Defenders, “good enough” is rarely good enough. People with this personality type can be meticulous to the point of perfectionism. They take their responsibilities personally, consistently going above and beyond and doing everything that they can to exceed others’ expectations");
		}
		
		public void determineThePersonIsEstj(){
			System.out.println("ESTJ\nWHO IS AN EXECUTIVE (ESTJ)?\nAn Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.\nExecutives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities together.\nExecutives are classic images of the model citizen: they help their neighbors, uphold the law, and try to make sure that everyone participates in the communities and organizations they hold so dear.\nExecutives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities together. Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance, and they happily lead the way on difficult paths");
		}
		
		public void determineThePersonIsEsfj(){
			status.equals("ESTJ\nWHO IS A CONSUL (ESFJ)?\nA Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits. They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.For Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors.This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around them. Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – to hold their families and their communities together.\nConsuls believe that there is a clear right thing to do in nearly every situation. While some personality types adopt a more lenient, live-and-let-live attitude, Consuls may find it difficult not to judge when someone takes a path that strikes them as misguided.\nFor many people with the Consul personality type, one of life’s greatest challenges is accepting that they can’t control anyone else’s thoughts or behavior – not even those who are nearest and dearest to them.");
		}
		
		public void determineThePersonIsIstp(){
			status.equals("ISTP\nWHO IS A VIRTUOSO (ISTP)?\nA Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.\nVirtuosos love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity. People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it, and learning from their environment as they go.Virtuosos explore ideas through creating, troubleshooting, trial and error and first-hand experience. They enjoy having other people take an interest in their projects and sometimes don’t even mind them getting into their space\nThe biggest issue Virtuosos are likely to face is that they often act too soon, taking for granted their permissive nature and assuming that others are the same.\nVirtuosos have a particular difficulty in predicting emotions, but this is just a natural extension of their fairness, given how difficult it is to gauge Virtuosos’ emotions and motivations.");
		}
		
		public void determineThePersonIsIsfp(){
			System.out.println("ISFP\nWHO IS AN ADVENTURER (ISFP)?\nAn Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.Adventurers are true artists – although not necessarily in the conventional sense. For this personality type, life itself is a canvas for self-expression. From what they wear to how they spend their free time, Adventurers act in ways that vividly reflect who they are as unique individuals.\nAdventurers embrace a flexible, adaptable approach to life. Some personality types thrive on strict schedules and routines – but not Adventurers. Adventurers take each day as it comes, doing what feels right to them in the moment. And they make sure to leave plenty of room in their lives for the unexpected – with the result that many of their most cherished memories are of spontaneous, spur-of-the-moment outings and adventures, whether by themselves or with their loved ones.\nAdventurers are warm, friendly, and caring, taking wholehearted enjoyment in the company of their nearest and dearest. But make no mistake: this is an Introverted personality type, meaning that Adventurers need dedicated alone time to recharge their energy after socializing with others.");
		}
		
		public void determineThePersonIsEstp(){
			System.out.println("ESTP\nWHO IS AN ENTREPRENEUR (ESTP)?\nAn Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.Entrepreneurs always have an impact on their immediate surroundings – the best way to spot them at a party is to look for the whirling eddy of people flitting about them as they move from group to group.\nEntrepreneurs are the likeliest personality type to make a lifestyle of risky behavior. They live in the moment and dive into the action – they are the eye of the storm.Entrepreneur personality type enjoy drama, passion, and pleasure, not for emotional thrills, but because it’s so stimulating to their logical minds. They are forced to make critical decisions based on factual, immediate reality in a process of rapid-fire rational stimulus response.\nEntrepreneurs are full of passion and energy, complemented by a rational, if sometimes distracted, mind. Inspiring, convincing and colorful, they are natural group leaders, pulling everyone along the path less traveled, bringing life and excitement everywhere they go. Putting these qualities to a constructive and rewarding end is Entrepreneurs’ true challenge.");
		}
		
		public void determineThePersonIsEsfp(){
			System.out.println("ESFP\nWHO IS AN ENTERTAINER (ESFP)?\nAn Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.Entertainers love the spotlight, and all the world’s a stage. Many famous people with the Entertainer personality type are indeed actors, but they love putting on a show for their friends too, chatting with a unique and earthy wit, soaking up attention and making every outing feel a bit like a party.\nEntertainers have the strongest aesthetic sense of any personality type. From grooming and outfits to a well-appointed home, Entertainer personalities have an eye for fashion. Knowing what’s attractive the moment they see it, Entertainers aren’t afraid to change their surroundings to reflect their personal style. Entertainers are naturally curious, exploring new designs and styles with ease.\nThe biggest challenge Entertainers face is that they are often so focused on immediate pleasures that they neglect the duties and responsibilities that make those luxuries possible.Entertainers recognize value and quality, which on its own is a fine trait");
		}
		




}

	