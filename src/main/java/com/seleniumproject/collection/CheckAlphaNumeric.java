package com.seleniumproject.collection;

public class CheckAlphaNumeric {

	public static void main(String[] args) {
		String str = "playgames24*7";
		boolean alphaFlag = false, numFlag = false;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <='z') || (str.charAt(i) >= 'A' && str.charAt(i) <='Z')) {
				alphaFlag = true;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <='9') {
				numFlag = true;
			}
		}
		if (numFlag && alphaFlag) {
			System.out.println("It's an alpha numeric string");
		} else
			System.out.println("Its not an alpha numeric string");

		
		/* Separate alphabets, digits and special characters */
		String alphaStr ="", digitStr="", splCharStr = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <='z') || (str.charAt(i) >= 'A' && str.charAt(i) <='Z')) {
				alphaStr+=str.charAt(i);
			} else if (str.charAt(i) >= '0' && str.charAt(i) <='9') {
				digitStr+=str.charAt(i);
			} else
				splCharStr+=str.charAt(i);
		}
		System.out.println("Alphabets: "+alphaStr);
		System.out.println("Numbers: "+digitStr);
		System.out.println("special characters: "+splCharStr);

	}
}
