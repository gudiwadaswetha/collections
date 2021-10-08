package com.seleniumproject.collection;

public class AddNumbersInString {

	public static void main(String[] args) {
//		String s1 = new String ("Hello");
//		String s2 = new String("Hello");
//		String s3 = "Hello", s4 = "Hello";
//		System.out.println(s4==s3);
//		System.out.println(s4.equals(s3));
		
		String str = "abc1923@4$563%";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>='0' && str.charAt(i)<='9') {
//				String str1=""+str.charAt(i);
//				int num = Integer.parseInt(str1);
				int num = str.charAt(i)-48;
				sum=sum+num;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i)>='0' && str.charAt(i)<='9') && !(str.charAt(i)>='A' && str.charAt(i)<='Z') && !(str.charAt(i)>='a' && str.charAt(i)<='z')) {
				System.out.println(str.charAt(i));
			}
			
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))
			        && !Character.isLetter(str.charAt(i))
			        && !Character.isWhitespace(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
			
		}
		
		System.out.println(sum);
	}
}
