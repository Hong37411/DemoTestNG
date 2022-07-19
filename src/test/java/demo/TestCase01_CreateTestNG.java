package demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ManageListener.class)
public class TestCase01_CreateTestNG {
	
	@Test
	public void testLogin() {
		System.out.println("Test Login");
		Assert.assertTrue(false);
	}
	@Test
	public void testLogin2() {
		System.out.println("Test Login 2");	
	}
	@Test
	public void testLogin3() {
		System.out.println("Test Login 3");	
	}

}
//@Test(groups = "smokeTest")
//  "smokeTest" chạy các test case được chỉ định
