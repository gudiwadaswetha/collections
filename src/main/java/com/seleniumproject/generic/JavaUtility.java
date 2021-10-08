package com.seleniumproject.generic;

import java.util.Random;

/**
 *  This class contains generic methods w.r.t Java
 * @author USM
 *
 */
public class JavaUtility {
	/**
	 * This method will return a random number 
	 * @return
	 */
	public int getRandomNumber()
	{
		Random ran = new Random();
		int random=ran.nextInt(1000);
		return random;
	}
}
