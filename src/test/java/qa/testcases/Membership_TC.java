
       
package qa.testcases;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
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
		
	 @Test(priority=1)
        public void testAcademicMembershipLink() {
            membershippage.hoverOverMembershipMenu();
            membershippage.clickAcadamicMembership();
           String actualAcademicMembershipText = membershippage.AcadamicMembership_valid();
           String expectedAcademicMembershipText = "Acadamic Membership";
           Assert.assertEquals(actualAcademicMembershipText, expectedAcademicMembershipText);
    }

      @Test(priority=2)
       public void testCorporateMembershipLink() {
               membershippage.hoverOverMembershipMenu();
               membershippage.clickCorporateMembership();
               String actualCorporateMembershipText = membershippage.CorporateMembership_valid();
               String expectedCorporateMembershipText = "Corporate Membership";
               Assert.assertEquals(actualCorporateMembershipText, expectedCorporateMembershipText);
    }

    @Test
    public void testPartnershipLink() {
        
          membershippage.hoverOverMembershipMenu();
          membershippage.clickPartnership();
          String actualPartnershipText = membershippage.Partnership_valid();
           String expectedPartnershipText = "Partnership";
          Assert.assertEquals(actualPartnershipText, expectedPartnershipText);
    }

      @AfterMethod
	public void clearMethod(){
		driver.close();
	}
		
}
	
	
	


