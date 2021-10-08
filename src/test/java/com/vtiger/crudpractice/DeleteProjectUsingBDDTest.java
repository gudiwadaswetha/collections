package com.vtiger.crudpractice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectUsingBDDTest {
	@Test
	public void deleteProjectUsingBDDTest() {
		baseURI = "http://localhost";
		port = 8084;
		
		when()
		.delete("/projects/TY_PROJ_214")
		
		.then()
		.assertThat().statusCode(204)
		.log().all();
	}
}
