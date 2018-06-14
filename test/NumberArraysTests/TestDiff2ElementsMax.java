package NumberArraysTests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import NumberArrays.Diff2ElementsMax;

public class TestDiff2ElementsMax {
	@Test
	public void test() {
		assertEquals("Invalid input - min 2 numbers required", Diff2ElementsMax.maxDiff(new int[] { 2 }));
		assertEquals("Invalid input - min 2 numbers required", Diff2ElementsMax.maxDiff(new int[] {}));
		assertEquals("Invalid input - min 2 numbers required", Diff2ElementsMax.maxDiff(null));
		assertEquals("8", Diff2ElementsMax.maxDiff(new int[] { 2, 3, 10, 6, 4, 8, 1 }));
		assertEquals("2", Diff2ElementsMax.maxDiff(new int[] { 7, 9, 5, 6, 3, 2 }));
		assertEquals("0", Diff2ElementsMax.maxDiff(new int[] { 2, 2, 2, 2, 2, 2 }));
		assertEquals("15", Diff2ElementsMax.maxDiff(new int[] {9, 11, 2, 1, 8, 16}));
		assertEquals("7", Diff2ElementsMax.maxDiff(new int[] {9, 11, 16, 1, 8, 2}));
		assertEquals("109", Diff2ElementsMax.maxDiff(new int[] {1, 2, 90, 10, 110}));

	}
}
