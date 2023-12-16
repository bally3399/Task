public class Clock{
	private int hour;
	private int minutes;
	private int seconds;
	public Clock(int hour, int minutes, int seconds){
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	} 
	public void setHour(int hour){
		if(hour > 23){
			this.hour = 0;
		}
		else{
			this.hour = hour;
		}
	}
	public int getHour(){
		return hour;
	}
	public void setMinutes(int minutes){
		if(minutes > 59){
			this.minutes = 0;
		}
		else{

			this.minutes = minutes;
		}
	}
	public int getMinutes(){
		return minutes;
	}
	public void setSeconds(int seconds){
		if(seconds > 59){
			this.seconds = 0;
		}
		else{
			this.seconds = seconds;
		}
	}
	public int getSeconds(){
		return seconds;
	}



	



}