package com.seleniumproject.collection;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String str = "india";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);
		}
	}
}
