package qa.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import qa.base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//app-header/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")
	WebElement Login;
	
	@FindBy(name="email")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath = "//div[@class='text-center']")
	WebElement Submit;
	
	@FindBy(className = "font-weight-bolder.mb-0")//for admin page
	WebElement new_page;
	
	@FindBy(xpath = "//small[@class=\"ng-star-inserted\"]")
	WebElement email_msg;
	
	@FindBy(xpath = "//a[@class=\"nav-link text-white\"]")
	WebElement label_text_Email;
	
	@FindBy(xpath="//small[@class=\"ng-star-inserted\"]")
	WebElement label_text_Pwd;
	
	@FindBy(id="swal2-html-container")
	WebElement invalid_msg;
		
	public void login_method_admin(String user,String pwd) throws InterruptedException
	{
		this.Login.click();
		Thread.sleep(2000);
		UserName.sendKeys(user);
		Password.sendKeys(pwd);
		Submit.click();
		
	}
	public void login_failed(String user,String pwd)
	{
		Login.click();
		UserName.sendKeys(user);
		Password.sendKeys(pwd);
		Submit.click();
	}
	
	//Admin page
	public String label_Text()
	{
		String txt=label_text_Email.getText();
		return txt;
	}
	//email_error msg
	public String Email_Msg_validation()
	{
		String msg=email_msg.getText();
		return msg;
	}
	//password error msg
	public String Pwd_Msg_validation()
	{
		String msg1=label_text_Pwd.getText();
		//System.out.println(msg1);
		return msg1;
	}
	//wrong password warning mesg
	public String wrong_pwd()
	{
		String msg2=invalid_msg.getText();
		//System.out.println(msg2);
		return msg2;
	}
	public String wrong_user()
	{
		String msg3=Submit.getText();
		System.out.println(msg3);
		return msg3;
	}
}
