package ParrallelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	@Test
	  public void TestOne() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testll in sampleThree....."+id);
	}
	@Test
	  public void TestTwo() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl2 in sampleThree....."+id);
	}
	
	
	@Test
	  public void TestThree() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl3 in sampleThree....."+id);
		  
		  
	}
	@Test
	  public void Testfour() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Testl4 in sampleThree....."+id);
	}
}
