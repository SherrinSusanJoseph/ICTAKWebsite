package qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.BaseClass;
import qa.pages.IndustrialPage;
import qa.pages.LandingPage;


public class Landing_TC extends BaseClass{
	LandingPage landingpage;
	
	@BeforeMethod
	public void tearUp() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		landingpage=new LandingPage(driver);		
	}
	@Test(priority=1)
	public void Home() throws IOException, InterruptedException
	{
		landingpage.home();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void About_us() throws InterruptedException
	{
		landingpage.aboutUs();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void Courses() throws InterruptedException
	{
		landingpage.courses();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	public void Memberships() throws IOException, InterruptedException
	{
		landingpage.memberships();
		Thread.sleep(2000);
	}
	@Test(priority=5)
	public void Events() throws InterruptedException
	{
		landingpage.events();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void Contact_Us() throws InterruptedException
	{
		landingpage.contactUs();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		driver.close();
		Thread.sleep(2000);
	}
	
}
