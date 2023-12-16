import java.time.LocalDate;

public class HeartProfile{

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private double height;
	private double weight;
	private int age;
	private double rate;
	private double BMI;
	
	public HeartProfile(String firstName, String lastName, LocalDate dateOfBirth, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
		this.weight = weight;
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

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		height = height * height;
		return height;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	public double getWeight(){
		weight = weight * 0.454;
		return weight;
	}

	public void year(){
		LocalDate today = LocalDate.now();
		age = today.getYear() - dateOfBirth.getYear();
		System.out.println("Age is ->"+ age);
	}
	public void maximumHeartRate(){
		rate = 220 - age;
		System.out.println("HeartRate is ->"+ rate);	 	
	}

	public void BMI(){
		double kilogram = height * height;
		double kilogram1 = weight * 0.454;
		double BMI = kilogram1 / kilogram;
			System.out.printf("BMI is %.4f%n", BMI);
		if(BMI < 18.5)
			System.out.println("under weight");
		if(BMI >= 18.5 && BMI < 24.9)
			System.out.println("normal weight");
	}
}