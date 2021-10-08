package com.vtiger.crudpractice;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProjectUsingBDDTest {
	@Test
	public void updateProjectUsingBDDTest() {
		/* Create project body */
		JSONObject map = new JSONObject();
		map.put("createdBy", "Uday Kumar");
		
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		.contentType(ContentType.JSON)
		.body(map)
		
		.when().patch("/projects/TY_PROJ_217")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}
}
