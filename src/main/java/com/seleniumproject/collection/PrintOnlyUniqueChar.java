package com.seleniumproject.collection;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueChar {

	public static void main(String[] args) {
		String str = "killer";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			/* Step 4: Print the character if its unique i.e count shld be equal to 1*/
			if(count == 1)
				System.out.print(ch);
		}
	}

}
