package NumberArraysTests;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import NumberArrays.PrimeNumbers;

public class TestPrimeNumbersTestNG {
	@Test
	public void testGetNthPrimeMethods() {
		assertEquals("Invalid Input", PrimeNumbers.getNthPrime(-500));
		assertEquals("Invalid Input", PrimeNumbers.getNthPrime(-10));
		assertEquals("Invalid Input", PrimeNumbers.getNthPrime(0));
		assertEquals("2", PrimeNumbers.getNthPrime(1));
		assertEquals("3", PrimeNumbers.getNthPrime(2));
		assertEquals("5", PrimeNumbers.getNthPrime(3));
		assertEquals("37", PrimeNumbers.getNthPrime(12));
		assertEquals("541", PrimeNumbers.getNthPrime(100));
		assertEquals("7919", PrimeNumbers.getNthPrime(1000));
		assertEquals("48611", PrimeNumbers.getNthPrime(5000));
		assertEquals("104729", PrimeNumbers.getNthPrime(10000));
	}
	
	@Test
	public void testIsPrimeMethod() {
		assertEquals(false, PrimeNumbers.isPrime(-7919));
		assertEquals(false, PrimeNumbers.isPrime(-7018));
		assertEquals(false, PrimeNumbers.isPrime(0));
		assertEquals(false, PrimeNumbers.isPrime(1));
		assertEquals(true, PrimeNumbers.isPrime(2));
		assertEquals(true, PrimeNumbers.isPrime(3));
		assertEquals(true, PrimeNumbers.isPrime(5));
		assertEquals(true, PrimeNumbers.isPrime(107));
		assertEquals(false, PrimeNumbers.isPrime(7918));
		assertEquals(true, PrimeNumbers.isPrime(7919));
	}
}
