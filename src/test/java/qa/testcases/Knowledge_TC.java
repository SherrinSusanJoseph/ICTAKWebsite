package qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.Utilities.ExcelUtility;
import qa.base.BaseClass;
import qa.pages.KnowledgePage;
import qa.pages.LoginPage;

public class Knowledge_TC extends BaseClass{
	KnowledgePage knwpage;
	LoginPage loginpage;
	@BeforeMethod
	public void tearUp() throws InterruptedException, IOException
	{
		loginpage=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_method_admin("superadmin","12345");
		knwpage=new KnowledgePage(driver);
		knwpage.Knowledge_link();
			
	}
	@Test(priority=1)
	public void Knowledge_page_navigate() throws IOException, InterruptedException
	{
		
		String txt=knwpage.get_heading();
		Assert.assertEquals(txt, "Knowledge Partner");
		System.out.println("Navigated to "+txt);
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void add_knw_partner_navigate() throws InterruptedException
	{
		
		String txt=knwpage.add_knw_link();
		Assert.assertEquals(txt, "New knowledge partner");
		System.out.println("Got New Knowledge partner window");
	
	}
	@Test(priority=3)
	public void delete_file_yes() throws InterruptedException
	{
		String txt=knwpage.delete_partner();
		Assert.assertEquals(txt, "Successfully Deleted");
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		driver.close();
	}
}
		
