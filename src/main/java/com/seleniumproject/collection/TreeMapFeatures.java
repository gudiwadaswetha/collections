package com.seleniumproject.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapFeatures {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(10, 100);
		map.put(30, 300);
		map.put(20, 200);
		map.put(40, 400);
//		map.put("fruit", "Mango"); //ClassCastException bcoz accepts only homogeneous data for keys
		map.put(15, "Mango");
//		map.put(null, 350); NullPointerException
		 NavigableMap descMap = map.descendingMap();
		System.out.println(descMap);
	}

}
