package com.vtiger.crudpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingBDDTest {

	@Test
	public void createProjectUsingBDDTest() {
		/* Create a project body using JSON object*/
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Uday");
		jObj.put("projectName", "Gemak123");
		jObj.put("status", "Created");
		jObj.put("teamSize", 5);
		
		given()
		.contentType(ContentType.JSON)
		.body(jObj)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.assertThat().statusCode(201).log().all();
	}
}
