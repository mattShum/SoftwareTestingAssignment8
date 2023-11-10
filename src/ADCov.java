import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ADCov {
	
	@Test
	/*
	 * Test Case ID: ADC 1
	 * Created by Matt Shuman
	 * This test covers the following x-definitions:
	 * 1
	 * This test covers the following k-definitions:
	 * 1, 5, 8, 12
	 * This test covers the following y-definitions:
	 * 3
	 */
	void ADC1() {
		System.out.println("Test Case ADC 1 result should be: 0");
		int result = T1Fun1.Fun1(-1, 0);
		assertEquals(0, result, "ADC 1 result should be 0");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: ADC 2
	 * Created by Matt Shuman
	 * This test covers the following x-definitions:
	 * 1, 6
	 * This test covers the following k-definitions:
	 * 1, 8, 13
	 * This test covers the following y-definitions:
	 * 3, 7
	 */
	void ADC2() {
		System.out.println("Test Case ADC 2 result should be: -1350545711");
		int result = T1Fun1.Fun1(21, 21);
		assertEquals(-1350545711, result, "ADC 2 result should be -1350545711");
		System.out.println("Result is: " + result);
	}
}