
public class Time {
//create a Time class with three variables h,m,s
	private int hour;
	private int minute;
	private int second;
	
//create a setTime method that validates h,m,s and sets time
	
	public void setTime(int h, int m, int s){
		hour = ((h>=0 && h<24) ? h :0);
		minute = ((m>=0 && m<60) ? m :0);
		second = ((s>=0 && s<60) ? s :0);
	}
//create a method that prints out input as Military time
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
//create a method to output non-military time
	
	public String toString(){
		return String.format("%d:%02d:%02d", ((hour==0 || hour ==12)?12:hour%12), minute, second, (hour <12 ? "AM":"PM" ));
	}	
}
