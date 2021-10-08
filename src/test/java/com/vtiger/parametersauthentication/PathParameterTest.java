package com.vtiger.parametersauthentication;

import org.testng.annotations.Test;

import com.seleniumproject.generic.EndPoints;

import static io.restassured.RestAssured.*;

public class PathParameterTest {
	@Test
	public void pathParameterTest() {
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		.pathParam("projId", "TY_PROJ_802")
		
		.when()
		.get(EndPoints.getSingleProject+"/{projId}")
		.then()
		.log().all();
	}
}
