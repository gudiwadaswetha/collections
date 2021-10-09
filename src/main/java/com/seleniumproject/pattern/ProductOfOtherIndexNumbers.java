package com.seleniumproject.pattern;

public class ProductOfOtherIndexNumbers {
	public static void main(String[] args) {
		int[] num = {1,2,3,4};
		for (int i = 0; i < num.length; i++) {
			int prod = 1;
			for (int j = 0; j < num.length; j++) {
				if (j!=i) {
					prod = prod*num[j];
				}
			}
			System.out.println(prod);
		}
	}
}
