package com.vtiger.crudpractice;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	@Test
	public void updateProjectTest() {
		/* Create project body */
		HashMap map = new HashMap();
		map.put("createdBy", "Uday Kumar");
		
		/* Send Request */
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(map);
		
		Response response = reqSpec.patch("http://localhost:8084/projects/TY_PROJ_602");
		response.then().log().all();
		System.out.println(response.prettyPeek());
		System.out.println(response.getStatusCode());
	}
}
