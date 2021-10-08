package com.seleniumproject.collection;

public class PrintPrimeNumbers {
	public static void main(String[] args) {
		int num =100,primeNum=0;
		
		for (int i = 2; i < num; i++) {
			primeNum = i;
			int count = 0;
			for (int j = 2; j <= primeNum; j++) {
				if (primeNum%j==0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(primeNum+" , ");
			}
		}
		
		System.out.println();
		
		/* To check whether number is prime or not */
		int num1 = 3, count1 = 0;
		for (int i = 2; i <= num1; i++) {
			if (num1%i == 0) {
				count1++;
			}
		}
		if (count1 == 1) {
			System.out.println("Its a prime Number");
		} else 
			System.out.println("Its not a prime number");
	}
}
