package NumberArrays;

import java.util.Hashtable;
import java.util.Set;

public class NumberAppearsOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] X = { 1, 2, 3, 4, 1, 2, 4, 3, 5 };
		int countOnce = singleNumber(X);
		System.out.println("Number that appears once = " + countOnce);

	}

	public static int singleNumber(int[] A) {
		if (A.length==1)
	        return A[0];
	    
	    int unique=0;
	    Hashtable<Integer,Integer> countMap= new Hashtable<Integer,Integer>();
	    
	    for (int u : A)
	    {
	        Integer freq = countMap.get(u);
	        countMap.put(u, freq==null ? 1:freq+1);
	    }
	    
	    for (Integer nk: countMap.keySet()) {
	    	System.out.println("Number Value Key: " + nk + "\tFrequency: " + countMap.get(nk));
	    }

	    for (Integer nk: countMap.keySet())
	    {
	        if (countMap.get(nk).equals(1))
	        {
	            unique=nk;
	            break;
	        }
	    }
	    return unique;	    
	}

}
