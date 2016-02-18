import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorialPositive() {
		MyCalculator calc = new MyCalculator ();
		int  actual = calc.nfactorial(5);
		assertEquals("Test if 5! = 120", 120, actual, 0.0);
	}
	public void testNfactorialNegative() {
		MyCalculator calc = new MyCalculator ();
		float  actual = calc.nfactorial(-5);
		assertEquals("Test if -5! = -120", -120, actual, 0.0);
	}
	public void testNfactorialBigNumber() {
		MyCalculator calc = new MyCalculator ();
		long  actual = calc.nfactorial(555);
		System.out.println(actual);
		assertEquals("Test if 99! will be Math error", 0, actual, 0.0);
	}
	public void testNfactorialNegZero() {
		MyCalculator calc = new MyCalculator ();
		long  actual = calc.nfactorial(-0);
		System.out.println(actual);
		assertEquals("Test if -0! = -1", -1, actual, 0.0);
	}
	
	public void testNfactorialFloat() {
		MyCalculator calc = new MyCalculator ();
		long  actual = calc.nfactorial(0);
		System.out.println(actual);
		assertEquals("Test if 0! = 1", 1, actual, 0.0);
	}
	public void testNfactorialOperation() {
//		fail("Not yet implemented");
		MyCalculator calc = new MyCalculator ();
		long  actual = calc.nfactorial(2+3);
		System.out.println(actual);
		assertEquals("Test if 99! will be Math error", 120, actual, 0.0);
	}

	@Test
	public void testBinarySearch() {
		MyCalculator calc = new MyCalculator ();
		int[] arr = {12345};
		long  actual = calc.binarySearch(arr, 1);
		assertEquals("Test if given is in the list", 0, actual, 0.0);
	}
	

}
