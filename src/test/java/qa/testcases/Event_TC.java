package qa.testcases;

import qa.base.BaseClass;
import qa.pages.EventPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

//import java.time.Duration;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




public class Event_TC extends BaseClass {
	EventPage eventpage;
	
	@Test(priority=1)
	public void event_click()
	{
		eventpage=new EventPage(driver);
		eventpage.eventdropdown();
		
	}
	public void icset_view()
	{
		eventpage.icset_click();
	}
	@Test(priority=2)
	public void icset_is_valid()
	{
		String valid1=eventpage.icset_valid();
		Assert.assertEquals(valid1, "ICSETpageload");
		System.out.println(valid1);
				
	}
	
	@Test(priority=3)
	public void techathlon_is_valid()
	{
		String valid2=eventpage.techathlon_valid();
		Assert.assertEquals(valid2, "TechathlonPageload");
		System.out.println(valid2);
	}
	@AfterMethod
	public void closemethod()
	{
		driver.close();
	}
	
	

	

}
