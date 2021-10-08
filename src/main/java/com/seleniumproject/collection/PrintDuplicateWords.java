package com.seleniumproject.collection;

import java.util.LinkedHashSet;

public class PrintDuplicateWords {
	public static void main(String[] args) {
		String str = "Welcome to TYSS Welcome to";
		String[] words = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		for (String s : set) {
			int count = 0;
			for (int i = 0; i < words.length; i++) {
				if (s.equals(words[i])) {
					count++;
				}
			}
			if (count > 1) {
				System.out.print(" "+s);
			}
			
		}
	}

}
