package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPra {

	
	@Test
	public void strictLevelSA() {
		String act = "Basha";
		String expected = "Bhai";
		System.out.println("Strict Level Soft Assertion Starts");
		SoftAssert s = new SoftAssert();
		s.assertEquals(act, expected);
		s.assertAll();
		System.out.println("Strict Level Soft Assertion ends");
	}
	
	@Test
	public void conatainsLevelSA() {
		String act = "Basha";
		String expe = "Ba";
		System.out.println("contains Level Soft Assertion starts");
		SoftAssert s = new SoftAssert();
		s.assertTrue(act.contains(expe));
	//	s.assertFalse(act.contains(expe));
		System.out.println("Conatains level Soft Assertion ends");
		s.assertAll();
	}
}
