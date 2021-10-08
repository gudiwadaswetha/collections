package com.seleniumproject.collection;

public class RevStringWithThirdVar {

	public static void main(String[] args) {
		String str = "india", revStr = "";
		for (int i = str.length()-1; i >= 0; i--) {
			revStr+=str.charAt(i);
		}
		System.out.println(revStr);
		
		
	}

}
