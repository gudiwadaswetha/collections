package com.seleniumproject.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CsCorpTester {
	public static void main(String[] args) {
		String str = "TesTer";
		Map map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), i+1);
		}
		
		System.out.println(map);
	}
}
