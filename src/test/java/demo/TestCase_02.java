package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCase_02 {
  @Test
  public void testcase02() {
	  System.out.println("Test 02");
	  Assert.assertTrue(false);
  }
  @Test(dependsOnMethods = "testcase02")
  //dependsOnMethods = "testcase02: kiểm tra nếu fall thì sẽ k chạy nữa
  public void testcase02_1() {
	  System.out.println("Test 02-1");
  }
  @Test(dependsOnMethods = "testcase02")
  public void testcase02_2() {
	  System.out.println("Test 02-2");
  }
  @Test(dependsOnMethods = "testcase02")
  public void testcase02_3() {
	  System.out.println("Test 02-3");
  }
  

}
