package practice;

//import org.testng.Assert;
//import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {
	
	@Test(priority = 10,enabled = true)
	public void bashaWakes() {
		//Assert.fail();
		System.out.println("good morning");
	}
	
	@Test(priority = 1,dependsOnMethods = {"bashaSleeps","bashaWakes"})
	public void bashaEats() {
		System.out.println("good afternoon");
	}
	
	
//	@Ignore
	@Test(priority = 2)
	public void bashaRuns() {
		
		System.out.println("good evening");
	}
	
	@Test(priority = 3)
	public void bashaSleeps() {
		System.out.println("good night");
	}
	
	
	
}
