package twitter.api.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETTweets {
	public static String baseURI = "https://api.twitter.com";
	public static String consumerKey = "XlnnX3FTfuTNI5lGV5oloLCMn";
	public static String consumerSecret = "abA5IQNVZRZcdYZXWZ0BYUJhdEnsZzTl1LmOoAQFc0MlnD1IaQ";
	public static String accessToken = "152175819-ex098ARxMf9aIliOt6RtIqYB3tJsQbNe53fqaUAP";
	public static String secretToken = "SBDMmmnmDxab9b85rxOBqpAhybBjiqFPKBCEzEAu0HhfX";

	
  @Test
  public void retrieveTweetsTimeline() {
	  RestAssured.baseURI = baseURI;
	  
	  Response res = RestAssured.given()
	  	.auth().oauth(consumerKey, consumerSecret, accessToken, secretToken)
	  	.param("count", 3).log().all()
	  	.when()
	  	.get("1.1/statuses/user_timeline.json")
	  	.then().assertThat().statusCode(200)
	  	.and()
	  	.contentType(ContentType.JSON)
	  	.extract().response();
	  
	  
	  System.out.println(res.asString());
  }
}
