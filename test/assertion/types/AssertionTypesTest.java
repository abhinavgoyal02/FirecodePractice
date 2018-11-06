package assertion.types;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionTypesTest {
	Assertion hardAssert = new Assertion();
	SoftAssert softAssert = new SoftAssert();
	
	@Test (enabled=false)
	public void hardAssertTest() {
		System.out.println("Start of Hard Assert");
		System.out.println("Line 1");
		hardAssert.assertEquals(false, false);
		System.out.println("Line 2");
		hardAssert.assertEquals(true, true);
		System.out.println("Line 3");
		hardAssert.assertEquals(true, true);
		System.out.println("Line 4");
		System.out.println("End of Hard Assert");
	}
	
	@Test
	public void softAssertTest() {
		System.out.println("Start of Soft Assert Test");
		System.out.println("Line 1");
		softAssert.assertEquals(false, false);
		System.out.println("Line 2");
		softAssert.assertEquals(true, true);
		System.out.println("Line 3");
		softAssert.assertEquals(true, true);
		System.out.println("Line 4");
		System.out.println("End of Soft Assert Test");
	}

	@Test
	public void testSoftAssertVerifyAll() {
		System.out.println("Start of Soft Assert [Verify All] Test");
		System.out.println("Line 1");
		softAssert.assertEquals(false, false);
		System.out.println("Line 2");
		softAssert.assertEquals(true, true);
		System.out.println("Line 3");
		softAssert.assertEquals(1, 2);
		System.out.println("Line 4");
		System.out.println("End of Soft Assert [Verify All] Test");
		softAssert.assertAll();
	}

}
