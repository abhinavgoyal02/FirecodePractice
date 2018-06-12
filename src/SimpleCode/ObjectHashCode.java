package SimpleCode;

import java.io.ObjectInputStream;

public class ObjectHashCode {

	class HC {
	}

	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ObjectHashCode x = new ObjectHashCode();
		HC obj = x.new HC();
		HC sobj = (HC) Class.forName("SimpleCode.ObjectHashCode.HC").newInstance();
//		HC cobj = (HC) obj.clone();
		
//		ObjectInputStream ois = new ObjectInputStream(anInputStream);
//		HC dobj = (HC) ois.readObject();
		
		System.out.println(obj);// returns a reference id
		System.out.println(obj.hashCode());// returns a hashcode number
	}

}
