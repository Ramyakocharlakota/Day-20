package com.userentrytestJunit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordRule3 {
	public boolean passwrdRule(String inputStr) {
		String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$";
		Pattern regex = Pattern.compile(passwordPattern);
		java.util.regex.Matcher passwordMatcher = regex.matcher(inputStr);
		if (passwordMatcher.matches()) {
			System.out.println(inputStr + " succesfully loggedin and passed third rule.");
		} else {
			System.out.println(inputStr + " is invalid password.Kindly input minimum 8 character.");
		}
		return false;
	}
	public static void main (String[] args) {
		PasswordRule3 psswrd = new PasswordRule3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please log in using 8 character password having one upper case and one numeric number.");
		System.out.print("Enter the password : ");
		String inputStr = sc.nextLine();
		sc.close();
		psswrd.passwrdRule(inputStr);
	}

}
