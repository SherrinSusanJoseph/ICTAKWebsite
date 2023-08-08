package qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Utilities.ExcelUtility;
import qa.base.BaseClass;
import qa.pages.LoginPage;
import qa.pages.TestimonialPage;

public class Testimonial_TC extends BaseClass{
	
	LoginPage loginpage;
	TestimonialPage testimonialpage;

	
	@BeforeMethod
	public void tearUp() throws IOException, InterruptedException
	{
		loginpage=new LoginPage(driver);
		testimonialpage = new TestimonialPage(driver);
		String User=ExcelUtility.getDataSheet0(0,0);
		String Pwd=ExcelUtility.getDataSheet0(0,1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_method_admin(User,Pwd);
		
	}
	
	
	@Test(priority=1)
	public void validTestimonial() throws IOException
	{
		//testimonialpage.testimonial_method("Sherrin","tcs","dfgee","Software testing","null");
		String name=ExcelUtility.getDataSheet1(0,0);
		String org=ExcelUtility.getDataSheet1(0,1);
		String testimony=ExcelUtility.getDataSheet1(0,2);
		String course=ExcelUtility.getDataSheet1(0,3);
		String image=ExcelUtility.getDataSheet1(0,4);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		testimonialpage.testimonial_method(name,org,testimony,course,image);
		String txt=testimonialpage.add_testimonial_validation();
		Assert.assertNotEquals(txt,"Add Testimonial");
		System.out.println(txt);
		
	}
	
	@Test(priority=2)
	public void validViewTestimonial() throws InterruptedException
	{
		testimonialpage.testimonial_view();
		//Thread.sleep(2000);//assertion to be done
		String txt=testimonialpage.view_details();
		Assert.assertEquals(txt, "Testimonial");
		System.out.println("Viewed testimonial details");
	}
	@Test(priority=3)
	public void  edit_course_link()
	{
		testimonialpage.testimonial_edit();
		String txt=testimonialpage.testimonial_edit();
		Assert.assertEquals(txt, "Edit Testimony");
		System.out.println("Viewed Testimony details Window");
	}
	@Test(priority=4)
	public void delete_course_details() throws InterruptedException
	{
		Thread.sleep(2000);
		testimonialpage.testimonial_delete();
		String txt=testimonialpage.testimonial_delete();
		Assert.assertEquals(txt, "OK");//close the popup
		System.out.println("Successfully Deleted");
	}
	@AfterMethod
	public void clearMethod()
	{
		driver.close();
	}
	

}
