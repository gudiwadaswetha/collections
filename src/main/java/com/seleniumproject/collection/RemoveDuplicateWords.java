package com.seleniumproject.collection;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str = "Welcome to TYSS to";
		String[] words = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		for (String s : set) {
			System.out.print(" "+s);
		}
	}

}
