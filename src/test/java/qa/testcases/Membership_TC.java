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
import qa.pages.MembershipPage;
import qa.pages.TestimonialPage;

public class Membership_TC extends BaseClass {
		
	LoginPage loginpage;
	MembershipPage membershippage;
		
		
	@BeforeMethod
	public void tearUp() throws IOException, InterruptedException{
		loginpage=new LoginPage(driver);
		membershippage= new MembershipPage(driver);
		String User=ExcelUtility.getDataSheet0(0,0);
		String Pwd=ExcelUtility.getDataSheet0(0,1);
		System.out.println("UserName:"+User);
		System.out.println("PassWord:"+Pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_method_admin(User,Pwd);
	}
		
	@Test(priority = 1)
	public void academic_membership_links_check() throws InterruptedException{
		membershippage.clickAcadamicMembership();
		Thread.sleep(2000);//add assertion
	}
		
	@Test(priority = 2)
	public void corporate_membership_linls_check() throws InterruptedException{
		membershippage.clickCorporateMembership();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void partnership_membership_linls_check() throws InterruptedException{
		membershippage.clickPartnership();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void clearMethod(){
		driver.close();
	}
		
}
