package com.seleniumproject.collection;

public class MaxValueInArray {

	public static void main(String[] args) {
		int[] arr = {20,90,78,32,86,45,15,27};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}			
		}
		System.out.println("First Max Element: "+arr[arr.length-1]);
		System.out.println("First Min Element: "+arr[0]);
	}

}
