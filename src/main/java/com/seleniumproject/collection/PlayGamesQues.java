package com.seleniumproject.collection;

public class PlayGamesQues {
	public static void main(String[] args) {
		
		int[] x = {4,8,2,15,7,3,11,19,6,13,15,3};
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				for (int y = j+1; y < x.length; y++) {
					int sum = x[i]+x[j]+x[y];
					if (sum == 22) {
						System.out.println(x[i]+","+x[j]+","+x[y]);
					}
					
				}
			}
		}
		
	}
}
