package jira.api.rest;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.PayloadParser;

public class POSTJIRAComment {
	private String baseURI = "http://localhost:8080";

	@Test
	public void getJIRASessionID() throws IOException {
		RestAssured.baseURI = baseURI;
		String payloadBody01 = PayloadParser.getPayloadasString("JIRALoginPayload.json");
		
		Response res01 = RestAssured.given()
			.contentType(ContentType.JSON)
			.body(payloadBody01)
				
			.when()
			.post("rest/auth/1/session")
			
			.then().assertThat().statusCode(200)
			
			.extract().response();
		
			JsonPath jResponse01 = new JsonPath(res01.asString());
			String sessionID = jResponse01.getString("session.value");
			System.out.println(sessionID);
		
		String payloadBody02 = PayloadParser.getPayloadasString("JIRAIssuePayload.json");	
		Response res02 = RestAssured.given()
			.contentType(ContentType.JSON)
			.body(payloadBody02)
			.header("cookie", "JSESSIONID=" + sessionID)
					
			.when()
			.post("rest/api/2/issue")
					
			.then().assertThat().statusCode(201)
				
			.extract().response();
			
			JsonPath jResponse02 = new JsonPath(res02.asString());
			String issueIdOrKey = jResponse02.getString("id");
			System.out.println(issueIdOrKey);	
			
		String payloadBody03 = PayloadParser.getPayloadasString("JIRACommentPayload.json");	
		Response res03 = RestAssured.given()
			.contentType(ContentType.JSON)
			.body(payloadBody03)
			.header("cookie", "JSESSIONID=" + sessionID)
					
			.when()
			.post("rest/api/2/issue/RAT-5" + //issueIdOrKey
			 "/comment")
					
			.then().assertThat().statusCode(201).log().all()
				
			.extract().response();
			
			JsonPath jResponse03 = new JsonPath(res03.asString());
//			String key = jResponse03.getString("key");
			System.out.println(jResponse03);		
			
	}
}
