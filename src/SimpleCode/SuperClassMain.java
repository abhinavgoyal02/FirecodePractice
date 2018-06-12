package SimpleCode;

import java.util.Collection;
import java.util.HashMap;

public class SuperClassMain {

	public static void main(String[] args) {
		System.out.println(1);
	}

	public class B extends SuperClassMain {
		HashMap<String, String> map = new HashMap<String, String>();
		 
		//Getting Collection of values from HashMap
		         
		Collection<String> values = map.values();

	}
}
