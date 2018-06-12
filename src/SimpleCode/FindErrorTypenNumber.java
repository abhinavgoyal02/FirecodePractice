package SimpleCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FindErrorTypenNumber {
	private static String basePath = "C:\\DATA DRIVE\\SeleniumWorkspace\\Firecode\\src\\SimpleCode\\";
	private static String fileName = "SampleError.log";

	public static void main(String[] args) throws IOException {
		String errorlogLine;
		Map<String, Integer> errorMap = new HashMap<String, Integer>();

		BufferedReader br = new BufferedReader(new FileReader(basePath + fileName));
		for (int lineLimit = 0; (errorlogLine = br.readLine()) != null; lineLimit++) {
			if (errorlogLine.contains("ERROR")) {
				System.out.println(errorlogLine);
				if (errorMap.containsKey(errorlogLine.substring(29))) {
					int freq = errorMap.get(errorlogLine.substring(29));
					errorMap.put(errorlogLine.substring(29), freq + 1);
				} else
					errorMap.put(errorlogLine.substring(29), 1);
			}
			if (lineLimit == 6000)
				break;
		}
		
		System.out.print("\n\n");
		for (String errSummary : errorMap.keySet()) {
			System.out.println(errSummary + " <---> " + errorMap.get(errSummary) + " times");
		}

	}

}
