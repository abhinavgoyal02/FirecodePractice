package RestAssuredJSONTests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestGETRequest {
	private String baseURI = "https://maps.googleapis.com";

	@Test
	public void searchInGoogleMaps() {
		RestAssured.baseURI = baseURI;
		String scope = "results[0].scope";
		String latNE = "results[0].geometry.viewport.northeast.lat";

		RestAssured.given()
			.param("location", "48.1351,11.5820")
			.param("types", "food")
			.param("radius", "500")
			.param("key", "AIzaSyCn0NwEYM0NdwKqqr1klSSEovTEXJZidLg")
			.when()
			.get("maps/api/place/nearbysearch/json")
			.then().assertThat().statusCode(200)
			.and()
			.contentType(ContentType.JSON)
			.and()
			.body(scope, Matchers.equalTo("GOOGLE"))
			.and()
			.header("server", Matchers.equalTo("scaffolding on HTTPServer2"))
			.and()
			.body(latNE, Matchers.equalTo("48.24822"));
			
	}
}
