package com.seleniumproject.collection;

import java.util.HashSet;

public class NoOfOccuranceOfChar {

	public static void main(String[] args) {
		String str = "india";
		/*Step 1: Create a set collection and add all the characters of the given string */
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		/* Step 2: Compare each character of set with all the characters of given string */
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				/* Step 3: If the characters are matching then increment the count value */
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			/* Step 4: Print the character with count */
			System.out.println(ch+" : "+count);
		}
	}

}
