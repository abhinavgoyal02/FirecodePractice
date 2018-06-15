package RestAssuredXMLTests;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import utilities.PayloadReader;

public class TestPOSTRequest {
	private String baseURI = "https://maps.googleapis.com";

	@Test
	public void addPlaceInGoogleMaps() throws IOException {
		RestAssured.baseURI = baseURI;
		String payloadBody = PayloadReader.getPayloadasString("POSTRequestPayload.xml");
		
		System.out.println(payloadBody);

		ValidatableResponse res = RestAssured.given()
			.queryParam("key", "AIzaSyCn0NwEYM0NdwKqqr1klSSEovTEXJZidLg")
			.body(payloadBody)
				
			.when()
			.post("maps/api/place/add/xml")
			
			.then().assertThat().statusCode(200);
		
		System.out.println(res.toString());
	}
}
