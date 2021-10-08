package com.seleniumproject.collection;

public class ValidatePassword {

	public static void main(String[] args) {
		String str = "Password@123";
		boolean upperFlag = false,lowerFlag = false, digitFlag = false, splFlag = false;
		if (str.length()>8) {
			for (int i = 0; i < str.length(); i++) {
				Character ch = str.charAt(i);
				if (Character.isUpperCase(ch)) {
					upperFlag = true;
				} else if (Character.isLowerCase(ch)) {
					lowerFlag = true;
				} else if (Character.isDigit(ch)) {
					digitFlag = true;
				} else if (!(str.charAt(i) >= 'a' && str.charAt(i) <='z') 
						|| !(str.charAt(i) >= 'A' && str.charAt(i) <='Z')
						|| !(str.charAt(i) >= '0' && str.charAt(i) <='9')) {
					
					splFlag = true;
				}
			}
			if (upperFlag && lowerFlag && digitFlag && splFlag) {
				System.out.println("It's a valid password");
			}
		}
	}

}
