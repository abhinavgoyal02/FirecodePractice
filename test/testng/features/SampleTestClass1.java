package testng.features;

import org.testng.annotations.Test;

public class SampleTestClass1 {

	@Test (groups={"Smoke"})
	public void sampleTest1() {
		System.out.println("[START] Thread id = #" + Thread.currentThread().getId() + "# is started");
		System.out.println("Sample Test Code 1");
		System.out.println("[END] Thread id = #" + Thread.currentThread().getId() + "#is ended");
	}

	@Test (groups={"Regression"})
	public void sampleTest2() {
		System.out.println("[START] Thread id = #" + Thread.currentThread().getId() + "# is started");
		System.out.println("Sample Test Code 2");
		System.out.println("[END] Thread id = #" + Thread.currentThread().getId() + "# is ended");		
	}

}
