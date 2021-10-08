package com.seleniumproject.generic;

import io.restassured.response.Response;

/**
 * This class contins methods related to rest assured
 * @author USM
 *
 */
public class RestAssuredUtility {
	/**
	 * This method will return json data after extracting from the json path
	 * @param resp
	 * @param jsonpath
	 * @return
	 */
	public String getJsonData(Response resp,String jsonpath )
	{
		String jsonData = resp.jsonPath().get(jsonpath);
		return jsonData;
	}
}
