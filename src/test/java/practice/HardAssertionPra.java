package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPra {

	@Test
	public void strictLevelHA() {
		String actual = "Basha";
		String expected = "Basha";
		
		System.out.println("Strict Level Assertion Hard Assert starts "+actual+"Bhai");
		Assert.assertEquals(actual, expected);
		System.out.println("Strict Level Assertion Hard Assert ends");
	}
	
	@Test
	public void containsLevelHA() {
		String actual = "Basha";
		String expected = "Ba";
		
		System.out.println("Contains Level Assertion Hard Assert starts");
		Assert.assertTrue(actual.contains(expected));
		System.out.println("Contains Level Assertion Hard Assert ends");
	}
}
