package com.seleniumproject.pattern;

public class VowelsInString {

	public static void main(String[] args) {
		String str = "Prakash";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e'
					|| str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'u') {
				System.out.println(str.charAt(i));
			}
		}
	}

}
