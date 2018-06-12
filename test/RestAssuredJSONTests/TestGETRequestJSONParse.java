package RestAssuredJSONTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestGETRequestJSONParse {
	private String baseURI = "https://maps.googleapis.com/"; 

	@Test
	public void searchGoogleMapsJSON() {
		RestAssured.baseURI = baseURI;
	
		Response res = RestAssured.given()
			.param("location", "48.1351,11.5820")
			.param("types", "food")
			.param("radius", "500")
			.param("key", "AIzaSyCn0NwEYM0NdwKqqr1klSSEovTEXJZidLg")//.log().all()
			
		.when()
		.get("maps/api/place/nearbysearch/json")
		
		.then().log().status()
		.assertThat().statusCode(200)
		.and().contentType(ContentType.JSON).log().headers()
		
		.extract().response();
		
		
		JsonPath jResponse = new JsonPath(res.asString());
//		int lenResults = jResponse.getInt("results.size()");
//		for (int i=0; i < lenResults; i++) {
//			String currJSONPath = "results[" + i + "]";
//			String name = jResponse.getString(currJSONPath + ".name");
//			System.out.print(name + " >> ");
//			for (int j=0; j < jResponse.getInt(currJSONPath + ".types.size()"); j++) {
//				String subJSONPath = currJSONPath + ".types[" + j + "]";
//				String type = jResponse.getString(subJSONPath);
//				System.out.print(type + " >> ");
//			}
//			System.out.println();
//		}
		
	}
		
}
