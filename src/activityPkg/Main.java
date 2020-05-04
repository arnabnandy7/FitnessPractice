package activityPkg;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		ActivityClass sm=new ActivityClass();
		sm.setCity("Kolkata");
		System.out.println(sm.getSports());
	}

}
