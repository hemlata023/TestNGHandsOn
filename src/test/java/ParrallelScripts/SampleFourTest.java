package ParrallelScripts;

import org.testng.annotations.Test;

public class SampleFourTest {
	@Test
	  public void TestOne() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testll in sampleFour....."+id);
	}
	
	
	@Test
	  public void TestTwo() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl2 in sampleFour....."+id);
	}
	
	
	@Test
	  public void Testthree() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl4 in sampleFour....."+id);
	}
	
	
	
	
	@Test
	  public void Testfour() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl3 in sampleFour....."+id);
	}
}
