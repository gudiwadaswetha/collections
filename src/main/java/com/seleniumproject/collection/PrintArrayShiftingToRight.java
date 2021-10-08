package com.seleniumproject.collection;

public class PrintArrayShiftingToRight {

	public static void main(String[] args) {
		int[] arr = {2,3,5,7,9,11};
		int k = 3;
		int[] finalArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			finalArr[i] = arr[k++];
			if (k == arr.length) {
				k=0;
			}
		}
		for (int i = 0; i < finalArr.length; i++) {
			System.out.print(finalArr[i]+" ");
		}
	}

}
