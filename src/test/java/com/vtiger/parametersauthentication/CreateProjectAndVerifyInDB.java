package com.vtiger.parametersauthentication;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.seleniumproject.generic.BaseApiClass;
import com.seleniumproject.generic.EndPoints;
import com.seleniumproject.pojoclass.ProjectLibrary;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateProjectAndVerifyInDB extends BaseApiClass{
	@Test
	public void createProjectAndVerifyDB() throws Throwable
	{
		//create post request
		ProjectLibrary pLib = new ProjectLibrary("Chaitra", "Qualitest"+jLib.getRandomNumber(), "Completed", 25);
		Response resp = given()
		.contentType(ContentType.JSON)
		.body(pLib)
		.when()
		.post(EndPoints.addProject);
		
		//extract project id
		System.out.println(resp.asString());
		String expData = rLib.getJsonData(resp, "projectId");
		System.out.println(expData);
		
		//validate the exp data in daabase
		String query = "select * from project;";
		String actData = dbLib.executeQueryAndGetData(query, 1, expData);
		System.out.println(actData);
		
		Assert.assertEquals(actData, expData);
		System.out.println("data verified successfully");	
	}
}
