package ParrallelScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test
  public void TestOne() {
	  long id= Thread.currentThread().getId();
	  System.out.println("Testll in sampleOne....."+id);
	  
  }
  @Test
  public void TestTwo() {
	  long id= Thread.currentThread().getId();
	  System.out.println("Testl2 in sampleOne....."+id);
}
  @Test
  public void TestThree() {
	  long id= Thread.currentThread().getId();
	  System.out.println("Testl3 in sampleOne....."+id);
	  
	  
}
  @Test
  public void TestFour() {
	  long id= Thread.currentThread().getId();
	  System.out.println("Testl4 in sampleOne....."+id);
}
}

