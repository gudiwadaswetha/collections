package com.vtiger.parametersauthentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OauthAuthentication {
	@Test
	public void oauthAuthentication() {
		Response response = given()
		.formParam("client_id", "Sdetrestassure")
		.formParam("client_secret", "0e7895bf9ccf83f18715350629de0d9e")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://example.com")
		
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		
		System.out.println(response.asString());
		
		String token = response.jsonPath().get("access_token");
		System.out.println(token);
		
		given()
		.auth()
		.oauth2(token)
		.pathParam("USER_ID", "2295")
		
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-collect")
		.then().log().all();
	}
}
