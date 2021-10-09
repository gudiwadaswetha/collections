package com.seleniumproject.pattern;

import java.util.LinkedHashSet;

public class SumofTwoElementsEqualToNum {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,3,6,2,7,5};
		int sumValue = 7;
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j] == sumValue) {
					set.add(arr[i]+","+arr[j]);
				}
			}
		}
		for (String sumOfNum : set) {
			System.out.println(sumOfNum);
		}
	}

}
