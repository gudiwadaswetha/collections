package com.seleniumproject.collection;

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6,7,9};
		int count = a.length;
		if (count<b.length) {
			count = b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				if (a.length>b.length) {
					System.out.println(a[i]);
				} else
					System.out.println(b[i]);
			}
		}	
	}
}
