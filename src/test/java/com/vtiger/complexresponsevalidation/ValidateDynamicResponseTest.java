package com.vtiger.complexresponsevalidation;

import org.testng.annotations.Test;

import com.seleniumproject.generic.EndPoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class ValidateDynamicResponseTest {
	@Test
	public void validateDynamicResponseTest() {
		baseURI = "http://localhost";
		port = 8084;
		String expProjName = "Gemak";
		
		Response response = when()
		.get(EndPoints.getAllProjects);
		
		List<String> projectNames = response.jsonPath().get("projectName");
		for (String projName : projectNames) {
			if (projName.equals(expProjName)) {
				System.out.println("Act Proj Name: "+projName);
				
				break;
			}
		}
//		response.then().log().all();
	}
}
