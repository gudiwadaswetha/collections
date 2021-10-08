package com.seleniumproject.collection;

public class PrintMaxLengthString {

	public static void main(String[] args) {
		String[] str = {"bye","who","hi","to","amma"};
		
		int size = str[0].length();
		for (int i = 0; i < str.length; i++) {
			if(size<str[i].length())
				size = str[i].length();
		}
		for (int i = 0; i < str.length; i++) {
			
			if (str[i].length() == size) {
				System.out.println(str[i]);
			}
		}
	}

}
