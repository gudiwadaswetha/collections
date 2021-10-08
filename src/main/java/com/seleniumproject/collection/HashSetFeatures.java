package com.seleniumproject.collection;

import java.util.HashSet;

public class HashSetFeatures {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(10);
		set.add(15);
		set.add(20);
		set.add(30);
		set.add(15);
		set.add(30);
		set.add("gowda");
		set.add('P');
		System.out.println(set);
	}

}
