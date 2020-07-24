package com.jmeterapi.projectone;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestClass1 {
	
	@Test
	public void getListofUsers() {
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification reqspec = RestAssured.given();
		Response  response = reqspec.get();
		int status = response.statusCode();
		System.out.println(status);
					
	}

	@Test
	public void voidgetListofUsers1() {
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "api/users?page=2";
		RequestSpecification reqspec = RestAssured.given();
		Response response = reqspec.get();
		String respInString = response.asString();
		System.out.println(respInString);
		
	}
}
