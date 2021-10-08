package com.seleniumproject.collection;

public class RevStringWithoutLengthMethod {

	public static void main(String[] args) {
		String str = "india", revStr = "", revStr1 = "";
		char[] ch = str.toCharArray();
		int count = 0;
		for (char character : ch) {
			count++;
		}
		for (int i = count-1; i >= 0; i--) {
			revStr+=str.charAt(i);
		}
		System.out.println(revStr);
		
		// Or we can do in this way using try catch
		for (int i = 0;;i++) {
			try {
				revStr1=str.charAt(i)+revStr1;
			}catch (Exception e) {
				break;
			}
		}
		System.out.println(revStr1);
	}

}
