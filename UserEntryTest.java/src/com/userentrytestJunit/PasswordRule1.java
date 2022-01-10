package com.userentrytestJunit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordRule1 {
	public boolean passwrdRule(String inputStr) {
		String passwordPattern = "^[A-Za-z]{8}$";
		Pattern regex = Pattern.compile(passwordPattern);
		java.util.regex.Matcher passwordMatcher = regex.matcher(inputStr);
		if (passwordMatcher.matches()) {
			System.out.println(inputStr + " succesfully loggedin and passed first rule.");
		} else {
			System.out.println(inputStr + " is invalid password.Kindly input minimum 8 character.");
		}
		return false;
	}
	
	public static void main(String[] args) {
		PasswordRule1 psswrd = new PasswordRule1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please log in using 8 character password.");
		System.out.print("Enter the Password : ");
		String inputStr = sc.nextLine();
		sc.close();
		psswrd.passwrdRule(inputStr);
	}

}
