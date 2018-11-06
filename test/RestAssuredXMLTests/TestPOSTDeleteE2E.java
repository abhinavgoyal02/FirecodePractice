package RestAssuredXMLTests;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import utilities.PayloadParser;

public class TestPOSTDeleteE2E {
	private String baseURI = "https://maps.googleapis.com";

	@Test
	public void addPlaceInGoogleMaps() throws IOException {
		RestAssured.baseURI = baseURI;
		String payloadBody = PayloadParser.getPayloadasString("POSTRequestPayload.xml");
		
		Response res = RestAssured.given()
			.queryParam("key", "AIzaSyCn0NwEYM0NdwKqqr1klSSEovTEXJZidLg")
			.body(payloadBody)
				
			.when()
			.post("maps/api/place/add/xml")
			
			.then().assertThat().statusCode(200)
	
			.extract().response();
		
		XmlPath xmlResponse = new XmlPath(res.asString());
		System.out.println(xmlResponse.get("PlaceAddRequest.place_id").toString());
		
		String node_deletePlaceID = xmlResponse.get("PlaceAddRequest.place_id").toString();
		String body_deletePlace = "{\r\n" + 
					"	\"place_id\": \" "+ node_deletePlaceID +" \"\r\n" + 
					"	\r\n" + 
					"}";
			
			RestAssured.given()
			.queryParam("key", "AIzaSyCn0NwEYM0NdwKqqr1klSSEovTEXJZidLg")
			.body(body_deletePlace)
			
			.when()
			.post("/maps/api/place/delete/json")
			
			.then().assertThat().statusCode(200);
	}
}
