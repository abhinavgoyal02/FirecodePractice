package utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayloadReader{
	
	public static String getPayloadasString(String fileName) throws IOException{
		String basePath = System.getProperty("user.dir") + "\\Payloads";
		String filePath = basePath + fileName;
		return new String(Files.readAllBytes(Paths.get(fileName)));
	}

}
