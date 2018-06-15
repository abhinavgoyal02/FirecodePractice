package jira.api.rest;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.PayloadReader;

public class POSTJIRAIssue {
	private String baseURI = "http://localhost:8080";
	private String payloadBody_o = "{\r\n " +
       " \"fields\": { " +
       " \"project\": {  " +
          "  \"key\": \"RAT\" " +
        "\r\n}," +
       " \"summary\": \"Backend Issue through REST API call to JIRA\", " +
       " \"issuetype\": { " +
        	" \"name\": \"Bug\" " +
        "\r\n}," +
       " \"assignee\": { " +
        	" \"name\": \"abhinavgoyal02.prt\" " +
        "\r\n}," +
       " \"reporter\": { " +
        	" \"name\": \"abhinavgoyal02.prt\" " +
        "\r\n}," +
   "\r\n}," +
 "\r\n},";

	@Test
	public void addPlaceInGoogleMaps() throws IOException {
		RestAssured.baseURI = baseURI;
		String payloadBody = PayloadReader.getPayloadasString("JIRALoginPayload.json");
		
		Response res = RestAssured.given()
			.body(payloadBody)
				
			.when()
			.get("rest/api/2/issue")
			
			.then().assertThat().statusCode(200)
			
			.extract().response();
		
			JsonPath jResponse = new JsonPath(res.asString());
			System.out.println((jResponse.getString("session.value")));
			
	}
}
