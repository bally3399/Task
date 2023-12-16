import java.time.LocalDate;

public class HeartRates{

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private int age;
	private double rate;


	public HeartRates(String firstName, String lastName, LocalDate dateOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}


	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}
	public void setDateOfBirth(LocalDate dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfBirth(){
		return dateOfBirth;
	}
	
	public void year(){
		LocalDate today = LocalDate.now();
		age = today.getYear() - dateOfBirth.getYear();
		System.out.println("Age is ->"+ age);
	}
	public void maximumHeartRate(){
		rate = 220 - age;
		System.out.println("HeartRaate is ->"+ rate);	 	
	}
}