package com.vtiger.parametersauthentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class FormParam {
	@Test
	public void formParam() {
		Response response = given().formParam("client_id", "Just Dial")
		.formParam("client_secret", "e8b1fb1a4bc640775a76111792c9dfe3")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://www.example.com")
		
		.when().post("http://coop.apps.symfonycasts.com/token");
		System.out.println(response.prettyPeek());
		
		String accessToken = response.jsonPath().get("access_token");
		
		given()
		.auth()
		.oauth2(accessToken)
		.pathParam("USER_ID", "2295")
		
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed");
		
	}
}
