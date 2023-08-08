package qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import qa.Utilities.ExcelUtility;
import qa.base.BaseClass;
import qa.pages.LoginPage;
import qa.pages.LogoutPage;

public class Logout_TC extends BaseClass {

	
	LogoutPage logout;
	@Test(priority=1)
	public void LogOut() throws IOException, InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		LogoutPage logout=new LogoutPage(driver);
		String User=ExcelUtility.getDataSheet0(0,0);
		String Pwd=ExcelUtility.getDataSheet0(0,1);
		loginpage.login_method_admin(User,Pwd);
		logout.clickAdmin();
		logout.clickLogout();
		String text=logout.verify_Logout();
		Assert.assertEquals(text, "fingerprintLOGIN");
		System.out.println("Logout successfully!");
	}
	@AfterMethod
	public void window_close()
	{
		driver.close();
	}
}
