package com.vtiger.crudpractice;

import org.testng.annotations.Test;

import com.seleniumproject.generic.EndPoints;
import com.seleniumproject.generic.IPathConstants;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;

public class CreateProjectWithJsonFileTest {
	@Test
	public void createProjectWithJsonFileTest() throws Throwable {
		baseURI = "http://localhost";
		port = 8084;
		
		FileInputStream file = new FileInputStream(IPathConstants.JsonFilePath);
		given().contentType(ContentType.JSON).body(file)
		
		.when()
		.post(EndPoints.addProject)
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
	}
}
