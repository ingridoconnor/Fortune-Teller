package com.techelevator;



public class Horoscope {
	private int dayOfBirth;
	private String monthOfBirth;
	private String name;
	private int todayDay;
	private String todayMonth;
	
	
	public int getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public String getMonthOfBirth() {
		return monthOfBirth;
	}
	public void setMonthOfBirth(String monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTodayDay() {
		return todayDay;
	}
	public void setTodayDay(int todayDay) {
		this.todayDay = todayDay;
	}
	public String getTodayMonth() {
		return todayMonth;
	}
	public void setTodayMonth(String todayMonth) {
		this.todayMonth = todayMonth;
	}
	public String astrologicalSign() {
		if(monthOfBirth.equalsIgnoreCase("March") && dayOfBirth >= 21 || monthOfBirth.equalsIgnoreCase("April") && dayOfBirth <= 19) {
			return "Aries";
		}
		if(monthOfBirth.equals("April") && dayOfBirth >= 21 || monthOfBirth.equals("May") && dayOfBirth <= 20) {
			return "Taurus";
		}
		if(monthOfBirth.equals("May") && dayOfBirth >= 21 || monthOfBirth.equals("June") && dayOfBirth <= 20) {
			return "Gemini";
		}
		if(monthOfBirth.equals("June") && dayOfBirth >= 21 || monthOfBirth.equals("July") && dayOfBirth <= 22) {
			return "Cancer";
		}
		if(monthOfBirth.equals("July") && dayOfBirth >= 23 || monthOfBirth.equals("August") && dayOfBirth <= 22) {
			return "Leo";
		}
		if(monthOfBirth.equals("August") && dayOfBirth >= 23 || monthOfBirth.equals("Septemeber") && dayOfBirth <= 22) {
			return "Virgo";
		}
		if(monthOfBirth.equals("September") && dayOfBirth >= 23 || monthOfBirth.equals("October") && dayOfBirth <= 22) {
			return "Libra";
		}
		if(monthOfBirth.equals("October") && dayOfBirth >= 23 || monthOfBirth.equals("November") && dayOfBirth <= 21) {
			return "Scorpio";
		}
		if(monthOfBirth.equals("November") && dayOfBirth >= 22 || monthOfBirth.equals("December") && dayOfBirth <= 21) {
			return "Sagittarius";
		}
		if(monthOfBirth.equals("December") && dayOfBirth >= 22 || monthOfBirth.equals("January") && dayOfBirth <= 19) {
			return "Capricorn";
		}
		if(monthOfBirth.equals("January") && dayOfBirth >= 20 || monthOfBirth.equals("February") && dayOfBirth <= 18) {
			return "Aquarius";
		}
		if(monthOfBirth.equals("February") && dayOfBirth >= 19 || monthOfBirth.equals("March") && dayOfBirth <= 20) {
			return "Pisces";
		}
		return null;
	}
	
	
	
	
	
	
	
	

}
