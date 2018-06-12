package NumberArraysTests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import NumberArrays.ProfitLossInStocks;

public class TestMaxProfitLossInStocks {
	@Test
	public void test() {
		assertEquals("Invalid Input - Atleast 2 price point inputs needed", ProfitLossInStocks.maxPnLChecker(new double[]{250.16}));
		assertEquals("Invalid Input - Atleast 2 price point inputs needed", ProfitLossInStocks.maxPnLChecker(new double[]{-110.76}));
		assertEquals("Invalid Input - Stock price cannot have negative values", ProfitLossInStocks.maxPnLChecker(new double[]{10.46, 8, -9.40, 11}));
		assertEquals("Invalid Input - Stock price cannot have negative values", ProfitLossInStocks.maxPnLChecker(new double[]{-44.97, 12.6, -99.40, 50}));
		assertEquals("Invalid Input - Stock price cannot have negative values", ProfitLossInStocks.maxPnLChecker(new double[]{14.17, 29.7, -61, -110.01}));
		assertEquals("$16.7 / $-18.02", ProfitLossInStocks.maxPnLChecker(new double[]{4.10, 6.25, 20.80, 12.35, 8.45, 18.11, 2.78}));
		assertEquals("$96.44 / $-56.34", ProfitLossInStocks.maxPnLChecker(new double[]{7.01, 50.20, 60.55, 4.21, 100.65}));
		assertEquals("$45.0 / $-33.0", ProfitLossInStocks.maxPnLChecker(new double[]{77.00, 67.00, 44.00, 89.00, 79.00}));
		assertEquals("$49.11 / $-56.23", ProfitLossInStocks.maxPnLChecker(new double[]{95.11, 38.88, 51.00, 87.99, 79.00}));
	}
}
