package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_03 {
	@DataProvider(name = "user_account")
	public String[][] UserAccountData(){
		return new String[][] {
			{"user01", "123456"},
			{"user02", "654321"}
		};
	}
	@Test(dataProvider = "user_account")
	// truyền @DataProvider: tự động lấy data chạy nhiều bộ data cùng 1 lục
	public void test03(String userName, String password) {
		System.out.println(" Run testcase 03");
		System.out.println(" Show userName: " +userName);
		System.out.println(" Show pass: "+password);
	}
	// @Test chạy được đúng 1 lần
	//@DataProvider:
	

}
