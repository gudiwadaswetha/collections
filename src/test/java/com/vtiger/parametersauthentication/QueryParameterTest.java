package com.vtiger.parametersauthentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameterTest {
	@Test
	public void queryParameterTest() {
		given()
		.queryParams("page", 2)
		
		.when()
		.get("https://reqres.in/api/users")
		
		.then()
		.log().all();
		
	}
}
