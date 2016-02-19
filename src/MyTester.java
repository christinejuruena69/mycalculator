import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {
	int[] arr = {1,2,4,5,8};

	@Test
	public void testNfactorialPositive() {
		MyCalculator calc = new MyCalculator ();
		int  actual = calc.nfactorial(5);
		assertEquals("Test if 5! = 120", 120, actual, 0.0);
		//test for positive number
	}
	public void testNfactorialNegative() {
		MyCalculator calc = new MyCalculator ();
		float  actual = calc.nfactorial(-5);
		assertEquals("Test if -5! = -120", -120, actual, 0.0);
		//test for negative number
	}
	public void testNfactorialBigNumber() {
		MyCalculator calc = new MyCalculator ();
		long  actual = calc.nfactorial(555);
		System.out.println(actual);
		assertEquals("Test if 99! will be Math error", 0, actual, 0.0);
		//test for too big number
	}
	public void testNfactorialNegZero() {
		MyCalculator calc = new MyCalculator ();
		long  actual = calc.nfactorial(-0);
		System.out.println(actual);
		assertEquals("Test if -0! = -1", -1, actual, 0.0);
		//test for negative zero
	}
	
	public void testNfactorialFloat() {
		MyCalculator calc = new MyCalculator ();
		long  actual = calc.nfactorial(0);
		System.out.println(actual);
		assertEquals("Test if 0! = 1", 1, actual, 0.0);
		//test for zero
	}
	public void testNfactorialOperation() {
//		fail("Not yet implemented");
		MyCalculator calc = new MyCalculator ();
		long  actual = calc.nfactorial(2+3);
		System.out.println(actual);
		assertEquals("Test if 99! will be Math error", 120, actual, 0.0); 
		//test if it accepts operation as input
	}

	@Test

	public void testBinarySearchDoesExist() {
		MyCalculator calc = new MyCalculator ();		
		int actual = calc.binarySearch(arr, 11);
		assertEquals("Test if 11 is in the {1,2,4,5,8}", 1, actual, 0.0);
	}
	public void testBinarySearchExists2() {
		MyCalculator calc = new MyCalculator ();
		int actual = calc.binarySearch(arr, 8);
		assertEquals("Test if 8 is in the {1,2,4,5,8}", 4, actual, 0.0);
	}
	public void testBinarySearchExists3() {
		MyCalculator calc = new MyCalculator ();
		int actual = calc.binarySearch(arr, 5);
		assertEquals("Test if 5 is in the {1,2,4,5,8}", 3, actual, 0.0);
	}
	public void testBinarySearchExists() {
		MyCalculator calc = new MyCalculator ();
		int[] arr = {1,2,4,5,8};
		int actual = calc.binarySearch(arr, 1);
		assertEquals("Test if 1 is in the {1,2,4,5,8}", 0, actual, 0.0);
	}
	

}
