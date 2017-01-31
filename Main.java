
public class Main {

	public static void main(String[] args) {
		
		Time obj1 = new Time();
		obj1.setTime(13, 12, 58);
		System.out.println("Military Time: "+ obj1.toMilitary());
		System.out.println("Non-Military Time: "+ obj1.toString());

	}

}
