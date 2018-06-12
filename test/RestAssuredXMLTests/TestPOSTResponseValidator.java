package RestAssuredXMLTests;

import java.io.IOException;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import utilities.XMLPayloadReader;

public class TestPOSTResponseValidator {
	private String baseURI = "https://maps.googleapis.com";
	
	@Test
	public void addPlaceInGoogleMaps() throws IOException {
		RestAssured.baseURI = baseURI;
		String payloadBody = XMLPayloadReader.getXMLasString(System.getProperty("user.dir") + "\\test\\RestAssuredXMLTests\\POSTRequestPayload.xml");
		
		Response res = RestAssured.given()
			.queryParam("key", "AIzaSyCn0NwEYM0NdwKqqr1klSSEovTEXJZidLg")
			.body(payloadBody)
				
			.when()
			.post("maps/api/place/add/xml")
			
			.then().assertThat().statusCode(200)
			
			.extract().response();
		
			XmlPath xmlResponse = new XmlPath(res.asString());
			System.out.println(xmlResponse.get("PlaceAddRequest.place_id").toString());
			
	}
}
