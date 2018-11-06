package testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestClass2 {

	@Test (groups={"Sanity"})
	public void sampleTest3() {
		System.out.println("[START] Thread id = #" + Thread.currentThread().getId() + "# is started");
		System.out.println("Sample Test Code 3");
		System.out.println("[END] Thread id = #" + Thread.currentThread().getId() + "# is ended");		
	
		Assert.assertEquals(true, false);
	}

	@Test (groups={"Regression"})
	public void sampleTest4() {
		System.out.println("[START] Thread id = #" + Thread.currentThread().getId() + "# is started");
		System.out.println("Sample Test Code 4");
		System.out.println("[END] Thread id = #" + Thread.currentThread().getId() + "# is ended");			
	}

}
