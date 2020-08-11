package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		String birthMonth = "";
		int birthDate = 0;
		
		while (true) {

			System.out.println("Please enter your birth month: ");
			birthMonth = input.nextLine();
			System.out.println("Please enter the day of the month you were born: ");
			birthDate = Integer.parseInt(input.nextLine());
			System.out.println("You entered: " + birthMonth + " " + birthDate + ", is this input correct [Y/N] ?");

			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("y")) {
				break;
			}
		}
		Horoscope horoscope = new Horoscope();
		horoscope.setMonthOfBirth(birthMonth);
		horoscope.setDayOfBirth(birthDate);
		String sign = horoscope.astrologicalSign();
		System.out.println("You are a " + sign + "!");
		System.out.println("Hit ENTER for more information about your sign, " + horoscope.astrologicalSign() + ", including a horoscope!");
		input.close();
		try {
		Scanner scanner = new Scanner (new File (sign.toUpperCase() + ".txt"));
		String signInfo = "";
		while (scanner.hasNextLine()){
			String lineInput = scanner.nextLine();
			
			System.out.println(lineInput);
		}
		}catch (FileNotFoundException e) {
			System.out.println("Incorrect information");
		}
	}

}
