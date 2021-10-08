package com.seleniumproject.collection;

public class PrintMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,3,6,7,8,10,11,12,14,15,20};
		
		for (int i = 0; i < arr.length-1; i++) {
			int num = arr[i+1];   //2 6 7
//			int num1 = arr[i];
			int count =arr[i+1]-arr[i];  // 1 //4
			if (count!=1) {
				while (count>1) { //4 3 2
					System.out.print(" "+(num-count+1)); //6-4+1 = 3 4 5
					count--; // 3 2 1
				}
			}
		}
	}
}
