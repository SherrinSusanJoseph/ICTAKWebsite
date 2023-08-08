package qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Utilities.ExcelUtility;
import qa.base.BaseClass;
import qa.pages.CourseregisterationPage;
import qa.pages.LoginPage;
import qa.pages.TestimonialPage;
import org.testng.Assert;

public class CourseRegisteration_TC extends BaseClass {
	
	LoginPage loginpage;
	CourseregisterationPage courseregisterationpage;
	
	
	
	@BeforeMethod
	public void tearUp() throws IOException, InterruptedException
	{
		loginpage=new LoginPage(driver);
		courseregisterationpage= new CourseregisterationPage(driver);
		String User=ExcelUtility.getDataSheet0(0,0);
		String Pwd=ExcelUtility.getDataSheet0(0,1);
		System.out.println("UserName:"+User);
		System.out.println("PassWord:"+Pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_method_admin(User,Pwd);
		
	}
	
	@Test(priority = 1)
	  public void validCourseregisterationDownload() throws InterruptedException
	  {
		Thread.sleep(2000);
		courseregisterationpage.courseregistration_download();
		 
	  }
	
	@Test(priority = 1)
	  public void validCourseregisterationDelete() throws InterruptedException
	  {
		Thread.sleep(2000);
		courseregisterationpage.courseregistration_delete();
		 
	  }
	@AfterMethod
	public void clearMethod()
	{
		driver.close();
	}
	
}
