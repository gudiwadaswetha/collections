package com.seleniumproject.pattern;

public class SumOfGroupNumbersInString {
	public static void main(String[] args) {
		String str = "abc12@250$xy10mn1z";
		String num = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>='0' && str.charAt(i)<='9') {
				num = num+str.charAt(i);
			} else {
				if (!(num.equals(""))) {
					sum = sum + Integer.parseInt(num);
					num="";
				}
			}	
		}
		System.out.println(sum);
	}
}
