package qa.testcases;



import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qa.Utilities.ExcelUtility;
import qa.base.BaseClass;
import qa.pages.LoginPage;
import qa.pages.LogoutPage;

public class Login_TC extends BaseClass{
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void tearUp()
	{
		loginpage=new LoginPage(driver);
	}

	@Test(priority=1)
	public void validLogin() throws IOException, InterruptedException
	{
		//loginpage=new LoginPage(driver);
		String User=ExcelUtility.getDataSheet0(0,0);
		String Pwd=ExcelUtility.getDataSheet0(0,1);
		System.out.println("UserName:"+User);
		System.out.println("PassWord:"+Pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_method_admin(User,Pwd);
		String txt=loginpage.label_Text();
		Assert.assertEquals(txt, "Admin");
		System.out.println("Successfully logged in");		
	}
	
	@Test(priority=2)
	public void Blank_Username() throws IOException
	{
		//loginpage=new LoginPage(driver);
		String User=ExcelUtility.getDataSheet0(1,0);
		String Pwd=ExcelUtility.getDataSheet0(1,1);
		System.out.println("UserName:"+User);
		System.out.println("PassWord:"+Pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_failed(User,Pwd);
		String message=loginpage.Email_Msg_validation();
		Assert.assertEquals(message,"Email is required");
		System.out.println(message);
	}
	@Test(priority=3)
	public void Blank_Password() throws IOException
	{
		String User=ExcelUtility.getDataSheet0(2,0);
		String Pwd=ExcelUtility.getDataSheet0(2,1);
		System.out.println("UserName:"+User);
		System.out.println("PassWord:"+Pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_failed(User,Pwd);
		String message=loginpage.Pwd_Msg_validation();
		Assert.assertEquals(message,"Password is required");
		System.out.println(message);
	}
	@Test(priority=4)
	public void Blank_fields() throws IOException 
	{
		String User=ExcelUtility.getDataSheet0(3,0);
		String Pwd=ExcelUtility.getDataSheet0(3,1);
		System.out.println("UserName:"+User);
		System.out.println("PassWord:"+Pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_failed(User,Pwd);
		String message=loginpage.Email_Msg_validation();
		Assert.assertEquals(message,"Email is required");
		System.out.println(message);
	}
	@Test(priority=5)
	public void Invalid_pwd() throws IOException 
	{
		String User=ExcelUtility.getDataSheet0(4,0);
		String Pwd=ExcelUtility.getDataSheet0(4,1);
		System.out.println("UserName:"+User);
		System.out.println("PassWord:"+Pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_failed(User,Pwd);
		String message=loginpage.wrong_pwd();
		Assert.assertEquals(message,"Invalid!");
		System.out.println(message);
	}
	@Test(priority=6)
	public void Invalid_user() throws IOException 
	{
		String User=ExcelUtility.getDataSheet0(5,0);
		String Pwd=ExcelUtility.getDataSheet0(5,1);
		System.out.println("UserName:"+User);
		System.out.println("PassWord:"+Pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage.login_failed(User,Pwd);
		String message=loginpage.wrong_user();
		Assert.assertEquals(message,"SIGN IN");
		System.out.println("No Error message and Not logged in");
	}
	@AfterMethod
	public void clearMethod()
	{
		driver.close();
	}
}
