package com.seleniumproject.collection;

import java.util.HashMap;

public class HashMapFeatues {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(10, 100);
		map.put(20, 200);
		map.put(30, 500);
		map.put(40, 300);
		map.put(10, 150);
		map.put(25, 500);
		map.put(35, null);
		map.put(null, null);
		map.put(45, null);
		map.put('c', 100);
		map.put("abcd", null);
		System.out.println(map);
	}

}
