package com.seleniumproject.collection;

public class SumOfFirstTwoMinNum {

	public static void main(String[] args) {
		int[] a = {45,80,98,13,40,20};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sum =0;
		for (int i = 0; i < 2; i++) {
			sum+=a[i];
		}
		System.out.println("Sum of First two min numbers: "+sum);
	}
}
