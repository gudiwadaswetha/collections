package com.seleniumproject.generic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * This class contains the configuration method which should be executed before and after executing the testscripts 
 * @author USM
 *
 */
public class BaseApiClass {
	public DatabaseUtility dbLib = new DatabaseUtility();
	public JavaUtility jLib = new JavaUtility();
	public RestAssuredUtility rLib = new RestAssuredUtility();
	
	
	@BeforeSuite
	public void bsConfig() throws Throwable
	{
		
		baseURI = "http://localhost";
		port = 8084;
		
		dbLib.connectToDB();
		System.out.println("========DB Connection successfull=======");
	}
	
	@AfterSuite
	public void asCconfig() throws Throwable
	{
		dbLib.closeDB();
		System.out.println("=========DB Close successful======");
	}
}
