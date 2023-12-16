public class Car{

	private String model;
	private String year;
	private double price;
	private double discountPrice1;
	private double discountPrice2;
	public Car(String model, String year, double price, double discountPrice1, double discountPrice2){
	this.model = model;
	this.year = year;
		if(price > 0) {
		this.price = price ;
		}
	this.discountPrice1 = discountPrice1;
	this.discountPrice2 = discountPrice2;
	}
	public void setModel(String model){
	this.model = model;
	}
	public String getModel(){
	return model;
	}
	public void setYear(String year){
	this.year = year;
	}
	public String getYear(){
	return year;
	}
	public void setPrice(double price){
	this.price = price;
	}
	public double getPrice(){
	return price;
	}
	public void setDiscountPrice1(double discountPrice1){
	this.discountPrice1 = discountPrice1;
	}
	public double getDiscountPrice1(){
	discountPrice1 = getPrice() - 0.5;
	return discountPrice1;
	}
	public void setDiscountPrice2(double discountPrice2){
	this.discountPrice2 = discountPrice2;
	}
	public double getDiscountPrice2(){
	discountPrice2 = getPrice() - 0.7;
	return discountPrice2;
	}


}