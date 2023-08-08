package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.BaseClass;

public class LogoutPage extends BaseClass{
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css = "#sidenav-collapse-main > ul > li > a")
	WebElement Admin;
	@FindBy(xpath = "//body/aside[@id='sidenav-main']/app-sidenavbar[1]/aside[1]/div[2]/ul[1]/li[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement Logout;
	@FindBy(xpath = "//app-header/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")
	WebElement Login;
	
	
	
	public void clickAdmin()
	{
		Admin.click();
	}
	public void clickLogout()
	{
		Logout.click();
	}
	public String verify_Logout()
	{
		String text=Login.getText();
		return text;
	}
	
}
