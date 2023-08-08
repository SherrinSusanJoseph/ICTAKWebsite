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
import qa.pages.PatronsPage;

	public class Patrons_TC extends BaseClass{
		PatronsPage patronpage;
		LoginPage loginpage;
		@BeforeMethod
		public void tearUp() throws InterruptedException, IOException
		{
			loginpage=new LoginPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			loginpage.login_method_admin("superadmin","12345");
			patronpage=new PatronsPage(driver);
			patronpage.Patron_link();
				
		}
		@Test(priority=1)
		public void Patron_add_partner() throws IOException, InterruptedException
		{
			patronpage.addPatronPartner();
			Thread.sleep(2000);
		}
		@Test(priority=2)
		public void Delete_no_patron_partner() throws InterruptedException
		{
			patronpage.cancelDeletePatronPartner();
			Thread.sleep(2000);
		}
		@Test(priority=3)
		public void Delete_yes_patron_partner() throws InterruptedException
		{
			patronpage.successDeletePatronPartner();
			Thread.sleep(2000);
		}
		
		@AfterMethod
		public void tearDown() throws InterruptedException
		{
			driver.close();
			Thread.sleep(2000);
		}

	}


