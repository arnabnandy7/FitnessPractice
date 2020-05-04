package activityPkg;

import java.util.Date;

// F:\>java -jar fitnesse-standalone.jar -p 9090

/*
 !contents -R2 -g -p -f -h
 !define TEST_SYSTEM {slim}
 !define COLLAPSE_SETUP {true}
 !define COLLAPSE_TEARDOWN {true}


 !path F:\Eclipse_Main_Workspace\FitnesseSb\bin\

 !|import|
 |activityPkg|

 !|ActivityClass|
 |city|getSports?|
 |Kolkata|Cricket T20 16/11/2019|
 |Chennai|Chess Masters 17/11/2019|
 */

/**
 * 
 * @author arnab
 *
 */

public class ActivityClass {
	String sports;
	String city;
	Date date;
	double charges;

	public ActivityClass() {
	}

	public ActivityClass(String sports, String city, Date date, double charges) {
		this.sports = sports;
		this.city = city;
		this.date = date;
		this.charges = charges;
	}

	public String getSports() {
		String temp = "";
		if (city.equalsIgnoreCase("Kolkata")) {
			temp = "Cricket T20 16/11/2019";
		} else if (city.equalsIgnoreCase("Chennai")) {
			temp = "Chess Masters 17/11/2019";
		}

		return temp;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public String getActivities(String cityParam) {
		String weekEndActivities = "";

		return weekEndActivities;
	}

}
