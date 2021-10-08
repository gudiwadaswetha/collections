package com.seleniumproject.collection;

public class ChangeArrayBasedOnZeros {

	public static void main(String[] args) {
		int a[] = {1,2,0,0,4,0,5,0,6}; //{1,2,4,5,6,0,0,0,0}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] !=0) {
				a[count++] = a[i];
			}
		}
		while (count<a.length) {
			a[count++] = 0;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int b[] = {1,2,0,0,4,0,5,0,6}; //{0,0,0,0,1,2,4,5,6}
		int count1 = b.length-1;
		for (int i = b.length-1; i >= 0; i--) {
			if (b[i] != 0) {
				b[count1--] = b[i];
			}
		}
		while (count1>=0) {
			b[count1--] = 0;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
