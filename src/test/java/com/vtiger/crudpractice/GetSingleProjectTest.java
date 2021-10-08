package com.vtiger.crudpractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProjectTest {
	@Test
	public void getSingleProjectTest() {
		Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_217");
		System.out.println(response.prettyPeek());
		System.out.println(response.statusCode());
	}
}
