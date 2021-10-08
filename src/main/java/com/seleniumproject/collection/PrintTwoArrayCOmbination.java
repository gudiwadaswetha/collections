package com.seleniumproject.collection;

public class PrintTwoArrayCOmbination {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {7,8,9};
		int size = a.length;
		if (size < b.length) {
			size = b.length;
		}
		int[] c = new int[a.length+b.length];
		int count = 0;
		for (int i = 0; i < size; i++) {
			try {
				c[count] = a[i];
				count++;
				c[count] = b[i];
				count++;
			} catch (Exception e) {
				if (b.length>a.length) {
					c[count++] = b[i];
				}	
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
