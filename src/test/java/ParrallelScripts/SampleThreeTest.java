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
	
	
	@Test(invocationCount=6, threadPoolSize=3,timeOut=10000)
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
