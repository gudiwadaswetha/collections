package com.vtiger.parametersauthentication;

import org.testng.annotations.Test;

import com.seleniumproject.generic.EndPoints;
import com.seleniumproject.pojoclass.ProjectLibrary;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChainingTest {
	@Test
	public void requestChainingTest() {
		baseURI = "http://localhost";
		port = 8084;
		
		/* Create a project */
		ProjectLibrary pLib = new ProjectLibrary("Shilpa", "Robert Bosch", "Completed", 24);
		
		Response response = given()
		.contentType(ContentType.JSON)
		.body(pLib)
		.when()
		.post(EndPoints.addProject);
		
		/* Capture the response */
		String projId = response.jsonPath().get("projectId");
		
		/*Perform the get operation on the captured id */
		given()
		.pathParam("pid", projId)
		.when()
		.delete(EndPoints.getSingleProject+"/{pid}")
		
		.then()
		.assertThat().statusCode(204).log().all();
	}
}
