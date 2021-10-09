package com.seleniumproject.pattern;

public class NumberTriangle {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n; i++) {
			int num = 1;
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print(num++);
				} else
					System.out.print(" ");
			}
			num = num-2;
			for (int k = 0; k < n-1; k++) {
				if (i>=k && num>0) {
					System.out.print(num--);
				}
			}
			System.out.println();
		}
	}

}
