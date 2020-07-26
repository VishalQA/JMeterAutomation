package com.jmeterapi.projectone;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestClass3 {
	
	@Test
	public void getListofUsers3() {
	
		 
		given()
		.contentType(ContentType.JSON)
		.baseUri("https://reqres.in/api/users?page=2").when().get().then().body("page", equalTo(1));
		
	}
	
	
	@Test
	public void hamcrestTest() {
		given().contentType(ContentType.JSON)
		.baseUri("https://reqres.in/api/users?page=2")
		.when()
		.get()
		.then().log().all();
	}
	
	

}
