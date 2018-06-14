package utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XMLPayloadReader{
	
	public static String getXMLasString(String filePath) throws IOException{
		return new String(Files.readAllBytes(Paths.get(filePath)));
	}

}
