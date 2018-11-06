package RestAssuredJSONTests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestFileUpload {
	private String baseURI = "https://multipart-form-fileupload.com";

	@Test
	public void searchInGoogleMaps() {
		RestAssured.baseURI = baseURI;
		
		RestAssured
		.given()
			.multiPart(new File("\\Payloads\\large-file.bin"))
		.expect()
			.body("fileUploadResult", is("OK"))
		.when()
			.post("/fileUpload");
		
			
	}
}
