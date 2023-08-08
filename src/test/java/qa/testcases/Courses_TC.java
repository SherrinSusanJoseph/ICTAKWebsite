package qa.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.BaseClass;
import qa.pages.CoursesPage;
import qa.pages.LoginPage;

public class Courses_TC extends BaseClass{
	CoursesPage coursepage;
	@BeforeMethod
	public void tearUp() throws InterruptedException
	{
		LoginPage loginpage=new LoginPage(driver);
		coursepage=new CoursesPage(driver);
		loginpage.login_method_admin("superadmin", "12345");
		
	}
	@Test(priority=1)
	public void course_link()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		coursepage.course_link();
		String txt=coursepage.get_text();
		Assert.assertEquals(txt, "Courses List");
		System.out.println("Navigated to Course list page");
	}
	@Test(priority=2)
	public void newcourse_button_check()
	{
		coursepage.course_link();
		String txt=coursepage.button_check();
		Assert.assertEquals(txt, "Add Courses");
	}
	@Test(priority=3)
	public void view_course_link()
	{
		coursepage.course_link();
		String txt=coursepage.view_details();
		Assert.assertEquals(txt, "Course Details");
		System.out.println("Viewed course details");
	}
	@Test(priority = 4)
	public void  edit_course_link()
	{
		coursepage.course_link();
		String txt=coursepage.edit_link();
		Assert.assertEquals(txt, "Edit Course");
		System.out.println("Viewed Edit details Window");
	}
	@Test(priority=5)
	public void delete_course_details() throws InterruptedException
	{
		Thread.sleep(2000);
		coursepage.course_link();
		String txt=coursepage.delete_details();
		Assert.assertEquals(txt, "OK");
		System.out.println("Successfully Deleted");
	}
	
	//Add courses to the list
	@Test(priority=6)
	public void add_courses() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		coursepage.course_link();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		coursepage.add_course_method();
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
	}
}
