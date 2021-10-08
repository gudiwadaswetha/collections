package com.vtiger.apitestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.seleniumproject.generic.BaseApiClass;
import com.seleniumproject.generic.EndPoints;
import com.seleniumproject.pojoclass.ProjectLibrary;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateProjectTest extends BaseApiClass{

	@Test
	public void addSingleProjectWithCreated() {
		
		ProjectLibrary pLib = new ProjectLibrary("Deepak", "deepak_pro_1", "Created", 10);
		
		Response response = given()
		.contentType(ContentType.JSON).body(pLib)
		
		.when().post(EndPoints.addProject);
		
		String projName = response.jsonPath().get("projectName");
		System.out.println("Project Name: "+projName);
		System.out.println("response time: "+response.getTime());
		Assert.assertEquals(projName, "deepak_pro_1");
		response.then().assertThat().statusCode(201).log().all();
	}
	
	@Test
	public void addProjectWitONGoingStatus() {
		baseURI = "http://localhost";
		port = 8084;
		ProjectLibrary pLib = new ProjectLibrary("Deepak", "deepak_pro_2", "On Going", 10);
		
		Response response = given().contentType(ContentType.JSON).body(pLib)
		.when().post(EndPoints.addProject);
		
		String projName = response.jsonPath().get("projectName");
//		String status = response.jsonPath().get("status");
//		System.out.println("status: "+status);
		Assert.assertEquals(projName, "deepak_pro_2");
//		Assert.assertEquals(status, "On Going");
		
		response.then().assertThat().statusCode(201).log().all();
	}
	
	@Test
	public void addPRojectWithTextFromatBody() {
		baseURI = "http://localhost";
		port = 8084;
		ProjectLibrary pLib = new ProjectLibrary("Deepak", "deepak_pro_3", "On Going", 10);
		
		Response response = given().contentType(ContentType.TEXT).body(pLib)
		.when().post(EndPoints.addProject);
		
		String projName = response.jsonPath().get("projectName");
//		String status = response.jsonPath().get("status");
//		System.out.println("status: "+status);
		Assert.assertEquals(projName, "deepak_pro_2");
//		Assert.assertEquals(status, "On Going");
		
		response.then().assertThat().statusCode(201).log().all();
	}
}
