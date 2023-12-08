package ParrallelScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
	@Test
	  public void TestOne() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testll in sampleTwo....."+id);
	}
	@Test
	  public void TestTwo() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl2 in sampleTwo....."+id);
	}
	
	@Test
	  public void TestThree() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl3 in sampleTwo....."+id);
	}
	
	
	@Test
	  public void Testfour() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl4 in sampleTwo....."+id);
	}
	
}
