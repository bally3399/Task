import java.util.Scanner;

public class CarApplication{

	public static void main(String[] args){

	Car myCar1 = new Car("toyota", "2016", 1000000.00, 0.05, 0.07);
	Car myCar2 = new Car("benz", "2019", 2000000.00, 0.05, 0.07);

	System.out.printf("model is %s%n", myCar1.getModel());
	System.out.printf("year is %s%n", myCar1.getYear());
	System.out.printf("price is %.2f%n", myCar1.getPrice());
	System.out.printf("discountPrice1 is %.2f%n", myCar1.getDiscountPrice1());
	System.out.printf("model is %s%n", myCar2.getModel());
	System.out.printf("year is %s%n", myCar2.getYear());
	System.out.printf("price is %.2f%n", myCar2.getPrice());
	System.out.printf("discountPrice2 is %.2f%n", myCar2.getDiscountPrice2());
	

	}





}