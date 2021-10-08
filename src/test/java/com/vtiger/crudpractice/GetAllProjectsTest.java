package com.vtiger.crudpractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectsTest {
	@Test
	public void getAllProjectsTest() {
		Response response = RestAssured.get("http://localhost:8084/projects");
		System.out.println(response.prettyPeek());
		System.out.println(response.getStatusCode());
	}
}
