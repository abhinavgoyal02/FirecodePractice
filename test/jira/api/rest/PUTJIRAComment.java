package jira.api.rest;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.PayloadParser;

public class PUTJIRAComment {
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
			
		String payloadBody03 = PayloadParser.getPayloadasString("JIRACommentUpdatePayload.json");	
		Response res03 = RestAssured.given()
			.contentType(ContentType.JSON)
			.body(payloadBody03)
			.header("cookie", "JSESSIONID=" + sessionID)
					
			.when()
			.put("/rest/api/2/issue/RAT-8" //+ issueIdOrKey
					+ "/comment/10000" // + id
					)
					
			.then().assertThat().statusCode(200).log().all()
				
			.extract().response();
			
			JsonPath jResponse03 = new JsonPath(res03.asString());
//			String key = jResponse03.getString("key");
			System.out.println(jResponse03);		
	
	}
}
