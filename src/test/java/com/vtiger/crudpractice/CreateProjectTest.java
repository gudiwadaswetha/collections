package com.vtiger.crudpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.seleniumproject.generic.BaseApiClass;
import com.seleniumproject.generic.EndPoints;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest extends BaseApiClass{
	@Test
	public void createProjectApiTest() {
		/* Create a project body using JSON object*/
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Uday");
		jObj.put("projectName", "Gemak");
		jObj.put("status", "Created");
		jObj.put("teamSize", 5);
		
		Response response = given().contentType(ContentType.JSON).body(jObj).when().post(EndPoints.addProject);
		System.out.println(response.prettyPeek());
		if (response.statusCode() == 201) {
			System.out.println("Success");
		} else 
			System.out.println("SOme error");
		
		/* Send Request */
//		RequestSpecification reqSpec = given();
//		reqSpec.contentType(ContentType.JSON);
//		reqSpec.body(jObj);
//		
//		Response response = reqSpec.post("http://localhost:8084/addProject");
//		/* Print the response */
//		System.out.println(response.asString());
//		System.out.println(response.prettyPrint());
//		System.out.println(response.getStatusCode());
		
	}
}
