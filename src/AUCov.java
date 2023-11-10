/**
 * This class contains the all-uses coverage tests for this program.
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AUCov {

	@Test
	/**
	 * Test Case ID: testAUCov01
	 * Created by: Elvis Blanco Gonzalez
	 * This tests (x,k): (1,0)
	 * This test covers the following x-uses: 3,4,5,8,10,11,13
	 * This test covers the following k-uses: 3,14
	 * This test covers the following y-uses: 5,8,11,13
	 */
	public void testAUCov01 () {
		System.out.println("Test Case testAUCov01 result should be: 2");
		int x = 1;
		int k = 0;
		int result = T1Fun1.Fun1(x, k);
		int expected = 2;
		
		assertEquals(expected, result);
		
		System.out.println("Result is: " + result + "\n");
	}
	
	@Test
	/**
	 * Test Case ID: testAUCov02
	 * Created by: Elvis Blanco Gonzalez
	 * This tests (x,k): (4,0)
	 * This test covers the following x-uses: 8,10,4,7
	 * This test covers the following k-uses: 6
	 * This test covers the following y-uses: 7,8
	 */
	public void testAUCov02 () {
		System.out.println("Test Case testAUCov02 result should be: 0");
		int x = 4;
		int k = 0;
		int result = T1Fun1.Fun1(x, k);
		int expected = 0;
		
		assertEquals(expected, result);
		
		System.out.println("Result is: " + result + "\n");
	}
	
	@Test
	/**
	 * Test Case ID: testAUCov03
	 * Created by: Elvis Blanco Gonzalez
	 * This tests (x,k): (-1,0)
	 * This test covers the following x-uses: 12
	 * This test covers the following k-uses: 14
	 * This test covers the following y-uses: 12
	 */
	public void testAUCov03 () {
		System.out.println("Test Case testAUCov03 result should be: 0");
		int x = -1;
		int k = 0;
		int result = T1Fun1.Fun1(x, k);
		int expected = 0;
		
		assertEquals(expected, result);
		
		System.out.println("Result is: " + result + "\n");
	}	
}