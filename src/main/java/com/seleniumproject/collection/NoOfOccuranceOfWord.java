package com.seleniumproject.collection;

import java.util.LinkedHashSet;

public class NoOfOccuranceOfWord {

	public static void main(String[] args) {
		String str = "Welcome to TYSS";
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
			System.out.println(s+" : "+count);
		}
	}
}
