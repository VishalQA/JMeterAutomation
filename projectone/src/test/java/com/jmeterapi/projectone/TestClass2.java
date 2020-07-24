package com.jmeterapi.projectone;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestClass2 {
	
	@Test
	public void getListofUsers() {
		
		
		
		given().baseUri("https://reqres.in/api/users?page=2").when().get().then().statusCode(200);
	}

	@Test
	public void getListofUsers1() {
		
		
		given()
		.contentType(ContentType.JSON)
		.baseUri("https://reqres.in/api/users?page=2").when().get().then().statusCode(200);
	}
	
	@Test
	public void getListofUsers2() {
		
		Response response =
		given()
		.contentType(ContentType.JSON)
		.baseUri("https://reqres.in/api/users?page=2").when().get();
		
		System.out.println(response.asString());
	}
	@Test
	public void getListofUsers3() {
	
		 
		given()
		.contentType(ContentType.JSON)
		.baseUri("https://reqres.in/api/users?page=2").when().get().then().body("page", equalTo(1));
		
//		JsonPath jp = new JsonPath(responseInString);
//		jp.getp
	}
}
