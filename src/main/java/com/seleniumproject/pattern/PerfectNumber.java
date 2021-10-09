package com.seleniumproject.pattern;

public class PerfectNumber {

	public static void main(String[] args) {
		int perfectNum = 25, sum = 0;
		for (int i = 1; i <= perfectNum/2; i++) {
			if (perfectNum%i == 0) {
				sum+=i;
			}
		}
		if (sum == perfectNum) {
			System.out.println("It's a perfect Number");
		} else
			System.out.println("It's not a perfect Number");
	}
	
	/**/

}

