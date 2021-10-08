package com.vtiger.crudpractice;

import org.testng.annotations.Test;

import com.seleniumproject.generic.EndPoints;
import com.seleniumproject.pojoclass.ProjectLibrary;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithPojoTest {
	@Test
	public void createProjectWithPojoTest() {
		baseURI = "http://localhost";
		port = 8084;
		ProjectLibrary pLib = new ProjectLibrary("Jackson", "Fritzy", "Completed", 18);
		
		given()
		.contentType(ContentType.JSON)
		.body(pLib)
		
		.when()
		.post(EndPoints.addProject)
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
	}
}
