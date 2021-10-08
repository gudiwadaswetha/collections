package com.seleniumproject.collection;

public class PrintElementsBasedOnLength {

	public static void main(String[] args) {
		String[] str = {"Hi","bye","How","", "you","are"};
		String s = "ab";
		String s1 = "ab";
		System.out.println("1. "+s.compareTo(s1));
		s ="abc";
		s1 = "ab";
		System.out.println("2. "+s.compareTo(s1));
		s ="ab";
		s1 = "abc";
		System.out.println("3. "+s.compareTo(s1));
		s ="abcd";
		s1 = "ab";
		System.out.println("4. "+s.compareTo(s1));
		s ="xyz";
		s1 = "ab";
		System.out.println("5. "+s.compareTo(s1));
		s ="ab";
		s1 = "ac";
		System.out.println("6. "+s.compareTo(s1));
		s = "shwetha";
		s1 = "s";
		System.out.println("7. "+s.compareTo(s1));
		
		
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

}
