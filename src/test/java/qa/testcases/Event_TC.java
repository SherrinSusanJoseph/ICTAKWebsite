package qa.testcases;

import qa.base.BaseClass;
import qa.pages.EventPage;

import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Event_TC extends BaseClass {
	EventPage eventpage;
	
	@Test(priority=1)
	public void validEvent()
	{
		eventpage=new EventPage(driver);
		eventpage.event_method();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	

}
