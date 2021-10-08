package com.seleniumproject.collection;

public class CompareStringMethods {

	public static void main(String[] args) {
		String s1 = "HELLO";
		String s2 = "hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String str = "Hello $i am Shravan ann I am FROM INdia", str1 = "";
		for (int i = 0; i < str.length(); i++) {
//			Character ch = str.charAt(i);  //ch = He
//			if(Character.isLowerCase(ch)) { //FT
//				str1 = str1+Character.toUpperCase(ch); //hE
//			} else
//				str1 = str1+Character.toLowerCase(ch); // h
			
			char ch = str.charAt(i);
			String s = ""+ch;
			if (ch>=65 && ch<=91) {
				str1 = str1+s.toLowerCase();
			} else
				str1 = str1+s.toUpperCase();
		}
		System.out.println(str1);
	}

}
