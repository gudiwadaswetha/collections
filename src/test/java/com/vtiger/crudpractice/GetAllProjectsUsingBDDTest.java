package com.vtiger.crudpractice;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class GetAllProjectsUsingBDDTest {
	@Test
	public void getAllProjectsUsingBDDTest() {
		baseURI = "http://localhost";
		port = 8084;
		when()
		.get("/projects")
		
		.then()
		.assertThat().statusCode(200)
		.assertThat().time(Matchers.lessThan(1000L), TimeUnit.MILLISECONDS)
		.log().all();
	}
}
