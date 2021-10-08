package com.seleniumproject.collection;

import java.util.HashSet;

public class PrintUniqueNumbers {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,1,2,3};
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Integer value : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (value == a[i]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(value);
			}
		}
	}

}
