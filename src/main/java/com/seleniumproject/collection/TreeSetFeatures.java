package com.seleniumproject.collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetFeatures {
	public static void main(String[] args) {
		TreeSet tSet = new TreeSet();
		tSet.add(100);
		tSet.add(10);
		tSet.add(25);
		tSet.add(30);
		tSet.add(20);
//		tSet.add(null);   //NullPointerException bcoz it will not accept null values 
//		tSet.add("SH");   //will get ClassCastException bcoz it accepts homogeneous data
		tSet = (TreeSet) tSet.descendingSet(); // to sort in descending order
		System.out.println(tSet);
	}
}
