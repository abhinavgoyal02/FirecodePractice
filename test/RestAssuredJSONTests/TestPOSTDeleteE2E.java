package RestAssuredJSONTests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestPOSTDeleteE2E {
	private String baseURI = "https://maps.googleapis.com";
	private String payloadBody = "{\r\n" + 
			"  \"location\": {\r\n" + 
			"    \"lat\": 12.922999,\r\n" + 
			"    \"lng\": 77.666086\r\n" + 
			"  },\r\n" + 
			"  \"accuracy\": 50,\r\n" + 
			"  \"name\": \"Internal Road to ORR :-)!\",\r\n" + 
			"  \"types\": [\"shoe_store\"],\r\n" + 
			"  \"website\": \"http://www.google.com/\",\r\n" + 
			"  \"language\": \"en-US\"\r\n" + 
			"}";

	@Test
	public void addPlaceInGoogleMaps() {
		RestAssured.baseURI = baseURI;
		
		Response res = RestAssured.given()
			.queryParam("key", "AIzaSyCn0NwEYM0NdwKqqr1klSSEovTEXJZidLg")
			.body(payloadBody)
				
			.when()
			.post("maps/api/place/add/json")
			
			.then().assertThat().statusCode(200)
			.and()
			.body("status", Matchers.equalTo("OK"))
			
			.extract().response();
		
			JsonPath jResponse = new JsonPath(res.asString());
			String node_deletePlaceID = jResponse.getString("place_id");
			String body_deletePlace = "{\r\n" + 
					"	\"place_id\": \" "+ node_deletePlaceID +" \"\r\n" + 
					"	\r\n" + 
					"}";
			
			RestAssured.given()
			.queryParam("key", "AIzaSyCn0NwEYM0NdwKqqr1klSSEovTEXJZidLg")
			.body(body_deletePlace)
			
			.when()
			.post("/maps/api/place/delete/json")
			
			.then().assertThat().statusCode(200)
			.and()
			.body("status", Matchers.equalTo("OK"));
	}
}
