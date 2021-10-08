package com.vtiger.complexresponsevalidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.seleniumproject.generic.EndPoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ValidateStaticResponseTest {
	@Test
	public void validateStaticResponseTest() {
		baseURI = "http://localhost";
		port = 8084;
		String expId = "TY_PROJ_203";
		
		Response response = when()
		.get(EndPoints.getAllProjects);
		
		//Json path to get 2nd project projectId
		String actId = response.jsonPath().get("[1].projectId");
		System.out.println("Act Id: "+actId);
		Assert.assertEquals(actId, expId);
		response.then().log().all();
	}
}
