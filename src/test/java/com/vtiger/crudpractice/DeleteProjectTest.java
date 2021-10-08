package com.vtiger.crudpractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {
	@Test
	public void deleteProjectTest() {
		Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_215");
		System.out.println(response.prettyPrint());
		System.out.println(response.getStatusCode());
	}
}
