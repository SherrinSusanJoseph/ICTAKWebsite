package qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.BaseClass;
import qa.pages.IndustrialPage;
import qa.pages.KnowledgePage;
import qa.pages.LoginPage;

public class Industrial_TC extends BaseClass{
	IndustrialPage industrialpage;
	LoginPage loginpage;
	@BeforeMethod
	public void tearUp() throws InterruptedException, IOException
	{
		loginpage=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_method_admin("superadmin","12345");
		industrialpage=new IndustrialPage(driver);
		industrialpage.Industrial_link();
			
	}
	@Test(priority=1)
	public void Industrial_add_partner() throws IOException, InterruptedException
	{
		industrialpage.addIndustrialPartner();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void Delete_no_industrial_partner() throws InterruptedException
	{
		industrialpage.cancelDeleteIndustrialPartner();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void Delete_yes_industrial_partner() throws InterruptedException
	{
		industrialpage.successDeleteIndustrialPartner();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		driver.close();
		Thread.sleep(2000);
	}

}
