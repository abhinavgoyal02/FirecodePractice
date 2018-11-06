package JSONParse;

import java.io.IOException;

import org.apache.log4j.Logger;

import io.restassured.path.json.JsonPath;
import utilities.PayloadParser;


public class SampleJSONParse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String strJSONContact = PayloadParser.getPayloadasString("ContactsSample.json");
		JsonPath contactSample = new JsonPath(strJSONContact);
		String condition = contactSample.getString("weather.condition");
		
		System.out.println("Current weather condition from the JSON = " + condition);
	}

}
