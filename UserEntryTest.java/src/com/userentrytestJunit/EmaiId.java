package com.userentrytestJunit;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmaiId {
	public static void main(String[] args) {
}

	String mailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
	Pattern regex = Pattern.compile(mailPattern);

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the EmaiId: ");
	String inputStr = sc.nextLine();
	 emailIDMatcher = regex.matcher(inputStr);
	sc.close();
	if (emailIDMatcher.matches()) {
		System.out.println(inputStr + " is valid mail.");
	} else {
		System.out.println(inputStr + " is invalid mail address.Kindly input the right one.");
	}
	

}
}
